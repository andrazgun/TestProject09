function myAlert() {
    window.alert("This is a popup");
}
function validateForm(id) {
    var userInputElement = document.getElementById(id);
    //var userInputElement = document.activeElement;
    var userInput = userInputElement.value;
    userInputElement.style = "background-color:white;";
    document.getElementById('errorText').innerText = "";
    console.log(userInput);
    console.log(userInputElement);
    console.log(userInput.length);
    //if (userInput.length >= 8 && userInput.length <= 30) {
    if (userInput.length < 8 || userInput.length > 30) {
        document.getElementById('errorText').innerText="Text must be between 8 and 30";
        userInputElement.style = "background-color:red;";
    }
}
    /* script to validate confirm password
function matchPassword() {
    var pw1 = documentgetElementById("passwordInput");
    var pw2 = documentgetElementById("passwordConfirmInput");
    if (pw1 != pw2) {
        document.getElementById('errorText').innerText="Password do not match.";
        userInputElement.style = "background-color:red;";
    }
} */

function validateFormAll() {
}


