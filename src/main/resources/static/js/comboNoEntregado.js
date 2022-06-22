$(document).ready(function(){
    setCmbInventario();
});

//llena el combobox con los objetos no entregados
async function setCmbInventario(){
    //obtenemos todos los prestamos
    const request = await fetch('prestamos',{
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'  
         }
    });
    const prestamos = await request.json();

    let encabezado = '<option selected disabled value="0">-Selecciona la clave-</option>';
    let cuerpo = '';
    for(prestamo of prestamos){
        if(prestamo.pre_estado == 0){
            var inv_id = prestamo.inv_id;
            const requestInv = await fetch('inventario/'+inv_id,{
                method: 'GET',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'  
                 }
            });
            const inventario = await requestInv.json();
            cuerpo+='<option value="'+ inventario.inv_id +'">'+ inventario.inv_clave +'</option>';
        }
    }
    let mostrar = encabezado+cuerpo;
    document.querySelector('#cmbClave').innerHTML=mostrar;
}