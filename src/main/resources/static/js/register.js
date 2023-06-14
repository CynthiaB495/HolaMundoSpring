// Call the dataTables jQuery plugin
$(document).ready(function() {
	
	// on ready
	
});

/*crearemos una funcion para que cargue los usuarios para hacer llamada al servidor 
se utiliza la funcion FETCH*/
async function registrarUsuario(){
	
	let datos = {};
	datos.nombre = ...;
	
	
  const request = await fetch('api/usuarios', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    
    // convierte un objeto de java string y lo convierte a un string de JSON 
   body: JSON.stringify({datos}) 
   
  });
  const usuarios = await request.json();
  
}

