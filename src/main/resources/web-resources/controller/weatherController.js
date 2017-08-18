(function () {
    'use strict';
    angular.module('staticSelect', [])
        .controller('ExampleController', ['$scope', 'WeatherService', function($scope, WeatherService) {
            $scope.selectedCity = null;
            $scope.display = "Test";

            $scope.getWeather = function (param) {

                $scope.errorMessage = false;
                $scope.err = "";
                $scope.hasData = false;
                $scope.forecastArray = [];

                if(param !== null)
                {
                    WeatherService.getWeather(param).then(function (res) {
                        console.log(res);
                        $scope.weatherDetails = res;

                        $scope.hasData = true;

                        // get the details from the response
                        $scope.countryName = res.data.location.country_name;
                        $scope.cityName = res.data.location.city;
                        $scope.dateTime = res.data.current_observation.observation_time;
                        $scope.weather = res.data.current_observation.weather;
                        $scope.temperature = res.data.current_observation.temperature_string;
                        $scope.wind = res.data.current_observation.wind_kph;
                        $scope.humidity = res.data.current_observation.relative_humidity;
                        $scope.imageUrl = res.data.current_observation.icon_url;

                        $scope.forecastArray = res.data.forecast.txt_forecast.forecastday;

                    }, function (err) {
                        if (err.status === 404)
                        {
                            $scope.errorMessage = true;
                            $scope.err = "There is no data available for " + param;
                        }

                    });
                }
            }

            WeatherService.getCityDetails().then(function(res){
                $scope.cityNameArray = res.data.city;
                }, function (err){
            });
        }]);
})();
