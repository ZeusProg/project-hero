ModuloPrincipal.controller("CadastroController", CadastroController);

CadastroController.$inject = ["CadastroService", "$location"];

function CadastroController(CadastroService, $location){
   const self = this;
  
   self.service = CadastroService;

   self.personagens = [];

   

    self.cadastro = (user) => {
        
            console.log(personagens);
            self.service.cadastrar(user).success(function (data) {
            self.personagem = data;
            console.log(self.personagens);
			
		}).error(function (data, status) {
            console.log("Parou aqui");
            self.message = "Aconteceu um problema: " + data;
            
            console.log(self.message);
		});;
    };

    self.init = function(){
		self.login = true;
		self.carregarHerois();
	}

	self.carregarHerois = function () {
		self.service.getHerois().success(function (data) {
			self.personagens = data;
			
		}).error(function (data, status) {
			self.message = "Aconteceu um problema: " + data;
		});
	};

    self.irLogin = function () {
		$location.path("/");
	}


}