$(document).ready(function(){
    setCmbClave();
});

//llena el combobox con las claves de todo el inventario
async function setCmbClave(){
    //obtenemos todos los prestamos
    const request = await fetch('inventarios',{
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'  
         }
    });
    const inventarios = await request.json();

    let encabezado = '<option selected disabled value="0">-Selecciona la clave-</option>';
    let cuerpo = '';
    for(inventario of inventarios){
            cuerpo+='<option value="'+ inventario.inv_id +'">'+ inventario.inv_clave +'</option>';
    }
    let mostrar = encabezado+cuerpo;
    document.querySelector('#cmbClave').innerHTML=mostrar;
}