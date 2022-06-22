//coloca todos los valores a los combobox en la pagina web
$(document).ready(function(){
    setCmbSolicitante();
    setCmbAutorizado();
    setCmbUsuario();
    setCmbInventario();
});

//llena el combo box solicitante
async function setCmbSolicitante(){
    //obtenemos todos los solicitantes
    const request = await fetch('solicitantes',{
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'  
         }
    });
    const solicitantes = await request.json();

    var valor = 1;
    let encabezado = '<option selected disabled value="0">-Selecciona el solicitante-</option>';
    let cuerpo = '';
    for(solicitante of solicitantes){
        cuerpo+='<option value="'+ valor +'">'+ solicitante.sol_nombre +' '+ solicitante.sol_apellido +'</option>';
        valor++;
    }
    let mostrar = encabezado+cuerpo;
    document.querySelector('#cmbSolicitante').innerHTML=mostrar;
}

//llena el combobox autorizado
async function setCmbAutorizado(){
    //obtenemos todos los solicitantes
    const request = await fetch('solicitantes',{
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'  
         }
    });
    const solicitantes = await request.json();

    let encabezado = '<option selected disabled value="0">-Selecciona el Autorizante-</option>';
    let cuerpo = '';
    for(solicitante of solicitantes){
        if(solicitante.sol_tipo == 'd'){
            cuerpo+='<option value="'+ solicitante.sol_id +'">'+ solicitante.sol_nombre +' '+ solicitante.sol_apellido +'</option>';
        }
    }
    let mostrar = encabezado+cuerpo;
    document.querySelector('#cmbAutorizado').innerHTML=mostrar;
}

//llena el combo box de usuarios
async function setCmbUsuario(){
    //obtenemos todos los usuarios
    const request = await fetch('usuarios',{
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'  
         }
    });
    const usuarios = await request.json();

    var valor = 1;
    let encabezado = '<option selected disabled value="0">-Selecciona el encargado-</option>';
    let cuerpo = '';
    for(usuario of usuarios){
        cuerpo+='<option value="'+ valor +'">'+ usuario.usu_nombre +' '+ usuario.usu_apellido +'</option>';
        valor++;
    }
    let mostrar = encabezado+cuerpo;
    document.querySelector('#cmbUsuario').innerHTML=mostrar;
}

//llena el combobox de inventarios disponibles para el prestamo
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
        if(prestamo.pre_estado != 0){
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
    document.querySelector('#cmbInventario').innerHTML=mostrar;
}