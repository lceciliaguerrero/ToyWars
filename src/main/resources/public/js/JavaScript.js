

/*function dataAction() {
    fetch("/do/{action}")
        .then(response=>response.json())
        .then(data=>{
            console.log("fetchfinish");
            console.log(data);
            let content="";
            data.forEach(item=>{
                content+=`
                    <p>${item.isbn}-${item.title}-${item.year}</p>`;
            });
            document.getElementById('library').innerHTML=content;
        });
}*/



function getActions() {
    fetch("/get/getAction")
        .then(value => value.json())
        .then(data => {
            actionsToy = data
        })
}

function dataActionD(action) {
    fetch(`/get/do/${action}`)
        .then(doActionsDataAction => doActionsDataAction.json())
        .then(data => {
            let contenidoDActionsDataAction = "";
            data.forEach(actionData => {
                contenidoDActionsDataAction += `<input type="submit" value="${actionData}" onclick="/get/doActions'${actionData}'">`;
            });
            document.getElementById("acciones").innerHTML = contenidoDActionsDataAction;
        })

}

function doActions(action) {
    fetch(`/get/do/${action}`)
}