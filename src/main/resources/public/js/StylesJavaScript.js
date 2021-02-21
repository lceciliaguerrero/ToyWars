function hideUser() {
    let colapsarUserData = document.getElementsByClassName('extendedInsetarDatosUser');
    for (let i = 0; i < colapsarUserData.length; i++) {
        colapsarUserData[i].style="display:none";
    }
}

function expandUser() {
    let expandirUserData = document.getElementsByClassName('extendedInsetarDatosUser');
    for (let i = 0; i < expandirUserData.length; i++) {
        expandirUserData[i].style="display:block";
    }
}

function hideToy() {
    let colapsarToyData = document.getElementsByClassName('extendedInsetarDatosToy');
    for (let i = 0; i < colapsarToyData.length; i++) {
        colapsarToyData[i].style="display:none";
    }
}

function expandToy() {
    let expandirToyData = document.getElementsByClassName('extendedInsetarDatosToy');
    for (let i = 0; i < expandirToyData.length; i++) {
        expandirToyData[i].style="display:block";
    }
}

function hideActionToy() {
    let colapsarToyActionData = document.getElementsByClassName('extendedInsetarDatosActionToy');
    for (let i = 0; i < colapsarToyActionData.length; i++) {
        colapsarToyActionData[i].style="display:none";
    }
}

function expandActionToy() {
    let expandirToyActionData = document.getElementsByClassName('extendedInsetarDatosActionToy');
    for (let i = 0; i < expandirToyActionData.length; i++) {
        expandirToyActionData[i].style="display:block";
    }
}

