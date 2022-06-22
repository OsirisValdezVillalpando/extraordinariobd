$(document).ready(function(){

});
//elimina un inventario
async function eliminar(){
    //obtiene el id del combobox
    var inv_id = parseInt(document.getElementById('cmbClave').value);
    if(inv_id == 0){alert("Escoge la clave del objeto a Eliminar");return;}
    //pregunta si se quiere eliminar
    if(!confirm("¿En verdad quieres eliminar el objeto?")){
        return;
    }
    //elimina el inventario
    const request = await fetch('eliminar/'+inv_id,{
        method: 'DELETE', 
        headers: {
            'Accept': 'application/json', 
            'Context-Type': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    alert("el objeto fue eliminado del inventario")
    location.reload();
}