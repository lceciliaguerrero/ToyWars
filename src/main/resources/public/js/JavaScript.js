function dataAction() {
    fetch("/get/newToyAction")
        .then(doActionsDataAction => doActionsDataAction.json())
        .then(data => {
            let contenidoDActionsDataAction = "";
            data.forEach(action => {
                contenidoDActionsDataAction += `<input type="submit" value="${action}" onclick="/get/doAction({action})">`;
            });
            document.getElementById("acciones").innerHTML = contenidoDActionsDataAction;
        })
}