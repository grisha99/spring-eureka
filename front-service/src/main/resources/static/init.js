angular.module('app', []).controller('indexController', function ($scope, $http) {
    const apiPath = 'http://localhost:5555/zuul';

    $scope.fillTable = function () {
        $http({
            url: apiPath + '/products',
            method: 'GET',
        }).then(function (response) {
            $scope.productsList = response.data;
        });
    };

    $scope.fillTable();
});