ModuloPrincipal.controller("LoginController", LoginController );

LoginController.$inject = ["$scope", "LoginService", "$location"];

function LoginController($scope, LoginService,  $location){

	const self = this;
	self.message = "";
	self.service = LoginService;
	
	self.login = null;
	self.cadastrar = null;

	self.titulo = "Heróis";

	self.autenticar = {
		nickname: null,
		senha: null
	} ;

	self.entrar= (autenticar) => {
		console.log(autenticar);
		self.service.logar(autenticar);
	}
	




	self.irCadastrar = function () {
		$location.path("/cadastro");
	}

	

}
	
