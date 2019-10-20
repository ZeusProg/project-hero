ModuloPrincipal.controller("CadastroController", CadastroController);

CadastroController.$inject = ["CadastroService", "LoginService"];

function CadastroController(CadastroService, LoginService){
   const self = this;

    self.cadastro = (user) => {
        
        console.log(user);
        self.service.cadastrar(user).success(function (data) {
            self.personagem = data;
            console.log(self.personagem);
            
			
		}).error(function (data, status) {
            console.log("Parou aqui");
            self.message = "Aconteceu um problema: " + data;
            
            console.log(self.message);
		});;
    };



}