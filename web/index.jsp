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
    <title>Title</title>
    <script src="//code.angularjs.org/snapshot/angular.min.js"></script>
    <script src="app.js"></script>
</head>
<body ng-app="ngrepeatSelect">
<div ng-controller="ExampleController">
    <form name="myForm">
        <label for="repeatSelect"> Repeat select: </label>
        <select name="repeatSelect" id="repeatSelect" ng-model="data.model">
            <option ng-repeat="option in data.availableOptions" value="{{option.id}}">{{option.name}}</option>
        </select>
    </form>
    <hr>
    <tt>model = {{data.model}}</tt><br/>
</div>
</body>
</html>
