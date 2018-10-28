
function cleanError() {
    var errors = document.getElementsByClassName("myerror");
    for (var i = 0; i < errors.length; i++) {
        errors[i].textContent = "";
    }
}