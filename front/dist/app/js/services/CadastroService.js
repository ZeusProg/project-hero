ModuloPrincipal.service("CadastroService", CadastroService);

CadastroService.$inject = ["$location", "$http"];

function CadastroService($location, $http){

    const self = this;
    self.url = "http://localhost:8080/curso-hackaton-cdi/jogador/autentica";

    self.cadastrar = function(user){
        return $http.post(self.url, user);
    }

}