angular.config(Config);

Config.$inject = ["$routeProvider"];

function Config($routeProvider){
    $routeProvider
    .when("/", {
        templateUrl: "../../app/pages/login.html"
    })
    .when("/home", {
        templateUrl: "../app/home/home.html"
    })
    .when("/cadastro", {
        templateUrl: "../app/cadastro/cadastro.html"
    })
    .when("/login", {
        templateUrl: "../../app/js/"
    })
    .otherwise({
        redirectTo: "/"
    });


}