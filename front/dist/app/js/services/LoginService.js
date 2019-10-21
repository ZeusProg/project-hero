ModuloPrincipal.service("LoginService", LoginService);

LoginService.$inject = ["$http"];

function LoginService($http) {

	const self = this;
	
	self.url = "http://localhost:8080/curso-hackaton-cdi/jogador/autentica";

	self.logar = function (user){
		return $http.post(self.url, user);
	};



	

	
};