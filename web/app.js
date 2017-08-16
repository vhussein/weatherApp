(function(angular) {
    'use strict';
    angular.module('ngrepeatSelect', [])
        .controller('ExampleController', ['$scope', function($scope) {
            $scope.data = {
                model: null,
                availableOptions: [
                    {id: '1', name: 'Option A'},
                    {id: '2', name: 'Option B'},
                    {id: '3', name: 'Option C'}
                ]
            };
        }]);
})(window.angular);

// var app = angular.module('myApp', []);
// app.controller('myCtrl', function($scope) {
//     $scope.names = ["Emil", "Tobias", "Linus"];
// });