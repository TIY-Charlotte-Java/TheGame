var stompClient = null;

function setConnected(connected) {
    console.log("Connected.");
}

function connect() {
    var socket = new SockJS('/cards');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function(frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/card-data/cards', function(greeting){
            showGreeting(JSON.parse(greeting.body).content);
        });
    });
}

function disconnect() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName() {
    stompClient.send("/app/cards");
}

function showGreeting(message) {
    console.log(message);
}