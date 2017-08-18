(function () {
    'use strict';
    angular.module('staticSelect').service('WeatherService', ['$http', '$q', function($http, $q)
    {
        var WEATHER_REST_SERVICE_URI = 'weather/';
        var CITY_REST_SERVICE_URI = 'cityDetails/';

        this.getWeather = function(data, onSuccess, onError) {
            var  req = {
                method: 'GET',
                url: WEATHER_REST_SERVICE_URI + data
            };
            return $http(req);
        };

        this.getCityDetails = function(data, onSuccess, onError)
        {
            var req = {
              method: 'GET',
              url: CITY_REST_SERVICE_URI
            };
            return $http(req);
        };
    }
    ]);
})();