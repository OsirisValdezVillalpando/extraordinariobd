$(document).ready(function(){

});

//funcion para guardar y los if validan los datos que sean corectos
async function guardarPrestamo(){
    let datos = {};
    datos.sol_id = parseInt(document.getElementById('cmbSolicitante').value);
    if(datos.sol_id == 0){alert("Escoge el solicitante");return;}

    datos.pre_fecha_inicio = new Date(document.getElementById('fechaPrestamo').value);
    if(datos.pre_fecha_inicio == null){alert("Escoge la fecha de inicio");return;}

    datos.pre_fecha_devolucion = new Date(document.getElementById('fechaDevolucion').value);
    if(datos.pre_fecha_devolucion == null){alert("Escoge la fecha de devolución");return;}

    datos.doc_autoriza = parseInt(document.getElementById('cmbAutorizado').value);
    if(datos.doc_autoriza == 0){alert("Escoge el autorizante");return;}

    datos.inv_id = parseInt(document.getElementById('cmbInventario').value);
    if(datos.inv_id == 0){alert("Escoge el objeto");return;}

    datos.usu_id = parseInt(document.getElementById('cmbUsuario').value);
    if(datos.usu_id == 0){alert("Escoge el Encargado");return;}

    datos.pre_estado = parseInt(document.getElementById('cmbEstado').value);
    if(datos.pre_estado == 99){alert("Escoge el estado");return;}

    //Agregamos el nuevo prestamo
    const request = await fetch('prestamo/insert',{
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'  
        },
        body: JSON.stringify(datos)
    });
    alert("El prestamo a sido un exito")
    location.reload();
}