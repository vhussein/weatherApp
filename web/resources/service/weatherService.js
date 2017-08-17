(function () {
    'use strict';
    angular.module('staticSelect').service('WeatherService', ['$http', '$q', function($http, $q)
    {
        var REST_SERVICE_URI = 'weather/';

        this.getWeather = function(data, onSuccess, onError) {
            var  req = {
                method: 'GET',
                url: REST_SERVICE_URI + data
            };
            return $http(req);
        };
    }
    ]);
})();