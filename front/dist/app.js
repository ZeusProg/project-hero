const ModuloPrincipal = angular.module("heroi", ["ngRoute"]);

ModuloPrincipal.run(Run);

Run.$inject = ["$rootScope", "$location"];

function Run($rootScope, $location){

}