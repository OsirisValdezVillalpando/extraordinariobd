$(document).ready(function(){
    
});

//edita el prestamo y valida los datos antes de editar
async function editarPrestamo(){
    let datos = {};
    var inv_id = parseInt(document.getElementById('cmbClave').value);
    if(datos.inv_id == 0){alert("Escoge la clave");return;}

    //obtiene el prestamo
    const request = await fetch('prestamos',{
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'  
         }
    });
    const prestamos = await request.json();

    for(prestamo of prestamos){
        if(prestamo.inv_id == inv_id){
            datos.pre_id = prestamo.pre_id;
        }
    }

    datos.pre_fecha_entrega = new Date(document.getElementById('fechaEntrega').value);

    //validacion de datos
    datos.pre_observaciones = document.getElementById('areaObservaciones').value;
    if(datos.pre_observaciones == ''){alert("Agrega las observaciones");return;}

    datos.pre_estado = parseInt(document.getElementById('cmbEstado').value);
    if(datos.pre_estado == 99){alert("Escoge el estado de entrega");return;}

    //Editamos el prestamo
    const requestPre = await fetch('prestamo/edit',{
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'  
        },
        body: JSON.stringify(datos)
    });
    alert("El inmueble a sido devuelto");
    location.reload();
}