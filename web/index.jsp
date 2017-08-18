<%--
  Created by IntelliJ IDEA.
  User: Azlan
  Date: 16/8/2017
  Time: 7:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Weather Application</title>
    <!-- Latest compiled and minified CSS -->
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body ng-app="staticSelect">
<div ng-controller="ExampleController" class="container theme-showcase" role="main">

    <div class="page-header">
        <h1>Weather Application</h1>
    </div>

    <form name="myForm">


        <label>Please select your city:</label>
        <select name="citySelect" ng-options="cityObj for cityObj in cityNameArray" ng-model="cityModel" ng-change="getWeather(cityModel)"
                class="form-control btn btn-secondary dropdown-toggle">
            <option value="">-- Please select your city --</option>
        </select>
        <br>
        <br>

        <div ng-if="errorMessage" class="alert alert-danger" role="alert">{{ err }}</div>

        <div ng-if="hasData">

            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title"><b>Location Details</b></h3>
                </div>
                <div class="panel-body">Country: {{countryName}}</div>
                <div class="panel-body">City: {{cityName}}</div>
                <div class="panel-body">{{dateTime}}</div>
            </div>
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title"><b>Weather Details</b></h3>
                </div>
                <div class="panel-body">Current Weather: {{weather}}</div>
                <div class="panel-body">Current Temperature: {{temperature}}</div>
                <div class="panel-body">Current Humidity: {{humidity}}</div>
                <div class="panel-body">Current Wind: {{wind}} KM/H</div>
                <div class="panel-body"><img src="{{imageUrl}}"></div>
            </div>

            <div class="page-header">
                <h1>Weather Forecast</h1>
            </div>

            <div class="row">
                <div class="col-sm-4" ng-repeat-start="forecastObj in forecastArray">
                    <div ng-if="hasData" class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title"><b>{{forecastArray[$index].title}}</b></h3>
                        </div>
                        <div class="panel-body"><img src="{{forecastArray[$index].icon_url}}"></div>
                        <div class="panel-body">{{forecastArray[$index].fcttext_metric}}</div>
                    </div>
                </div>
                <div ng-repeat-end></div>
            </div>
        </div>
    </form>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-route.js"></script>
<script src="/resources/app.js"></script>
<script src="/resources/controller/weatherController.js"></script>
<script src="/resources/service/weatherService.js"></script>
</body>
</html>
