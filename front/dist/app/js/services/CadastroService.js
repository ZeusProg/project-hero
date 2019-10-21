ModuloPrincipal.service("CadastroService", CadastroService);

CadastroService.$inject = ["$http"];

function CadastroService($http){

    const self = this;
     self.baseUrl = "http://localhost:8080/curso-hackaton-cdi/heroi";
    self.url = "http://localhost:8080/curso-hackaton-cdi/login";

    self.cadastrar = function(user){
        return $http.post(self.url, user);
    };

    self.getHerois = function () {
		return $http.get(self.baseUrl);
	};

    
	


}