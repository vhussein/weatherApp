(function () {
    'use strict';
    angular.module('staticSelect', [])
        .controller('ExampleController', ['$scope', 'WeatherService', function($scope, WeatherService) {
             $scope.data = {
                 city: 'Sydney'
             };

            // $scope.err = "";
            $scope.display = "Test";

           // WeatherService.getWeather($scope.data).then(function (res) {
           //      console.log(res);
           // });

            $scope.getWeather = function (param) {

                $scope.err = "";
                WeatherService.getWeather(param).then(function (res) {
                    console.log(res);
                }, function (err) {
                    if (err.status == 404)
                    {
                        $scope.err = "NO DATA AVAILABLE FOR " + param;
                    }

                });

            }


            // $scope.forceUnknownOption = function() {
            //     $scope.data.singleSelect = 'nonsense';
            // };
        }]);
// })(window.angular);
})();
