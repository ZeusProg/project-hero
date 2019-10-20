ModuloPrincipal.controller("LoginController", function ($scope, LoginService,  $location) {
	
	const self = this;
	self.message = "";
	self.service = LoginService;
	self.personagens = [];

	self.titulo = "Heróis";
	self.autenticar = {
		nickname: null,
		senha: null
	} ;

	self.personagem = {
		nickname: null,
		senha: null,
		personagem: null
	}


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

	self.irCadastrar = function () {
		self.cadastrar = true;
		self.login = false;
	}

	self.irLogin = function () {
		self.login = true;
		self.cadastrar = false;
	}

	
});