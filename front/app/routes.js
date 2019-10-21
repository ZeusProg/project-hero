ModuloPrincipal.config(Config);

Config.$inject = ["$routeProvider"];

function Config($routeProvider){
    $routeProvider
    .when("/", {
        templateUrl: "../app/pages/login.html"
    })
    .when("/cadastro", {
        templateUrl: "../app/pages/cadastro.html"
    })
    .otherwise({
        redirectTo: "/"
    });


}