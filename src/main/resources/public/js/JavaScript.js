function actionToyAlimentar() {

    let acciones = document.getElementsByClassName('actionToyAcciones');
    acciones.forEach(action => {
        action.addEventListener("click", () => {
            fetch(`/do/${action.value}`)
        })
    });
}

function inserUser() {
    let insertDataUserForm = document.getElementByid('insetarDatosUserForm');
    let nombre = insertDataUserFom.firstNamePersona.value;
    let apellido = insertDataUserFom.lastNamePersona.value;
    let edad = insertDataUserFom.agePersona.value;
    let numeroTelefono = insertDataUserFom.mobilePhoneNumberPersona.value;
    let email = insertDataUserForm.emailPersona.value;
    let genero = insertDataUserForm.generoPersona.value;
    let clave = insertDataUserForm.keyUser.value;

    insertDataUserForm.addEventListener('submit', () => {
        fetch('/newUser', {
            method:"post",
            body: {nombre, apellido, edad, numeroTelefono, email, genero, clave}
        })
            .then (value => value.json())
    });
}