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
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <%--<script src="//code.angularjs.org/snapshot/angular.min.js"></script>--%>
    <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-route.js"></script>
    <script src="/resources/js/app.js"></script>
</head>
<%--<body ng-app>--%>
<%--<div data-ng-app="" data-ng-init="firstName='John'">--%>

    <%--<p>The name is <span data-ng-bind="firstName"></span></p>--%>

<%--</div>--%>
<%--</body>--%>
<body ng-app="staticSelect">
<div ng-controller="ExampleController">
    <form name="myForm">
        <label for="singleSelect"> Single select: </label><br>
        <select name="singleSelect" ng-model="data.singleSelect">
            <option value="option-1">Option 1</option>
            <option value="option-2">Option 2</option>
        </select><br>

        <label for="singleSelect"> Single select with "not selected" option and dynamic option values: </label><br>
        <select name="singleSelect" id="singleSelect" ng-model="data.singleSelect">
            <option value="">---Please select---</option> <!-- not selected / blank option -->
            <option value="{{data.option1}}">Option 1</option> <!-- interpolation -->
            <option value="option-2">Option 2</option>
        </select><br>
        <button ng-click="forceUnknownOption()">Force unknown option</button><br>
        <tt>singleSelect = {{data.singleSelect}}</tt>

        <hr>
        <label for="multipleSelect"> Multiple select: </label><br>
        <select name="multipleSelect" id="multipleSelect" ng-model="data.multipleSelect" multiple>
            <option value="option-1">Option 1</option>
            <option value="option-2">Option 2</option>
            <option value="option-3">Option 3</option>
        </select><br>
        <tt>multipleSelect = {{data.multipleSelect}}</tt><br/>
    </form>
</div>
</body>
<%--<body ng-app="ngrepeatSelect">--%>
<%--<div ng-controller="ExampleController">--%>
    <%--<form name="myForm">--%>
        <%--<label for="repeatSelect"> Repeat select: </label>--%>
        <%--<select name="repeatSelect" id="repeatSelect" ng-model="data.model">--%>
            <%--<option ng-repeat="option in data.availableOptions" value="{{option.id}}">{{option.name}}</option>--%>
        <%--</select>--%>
    <%--</form>--%>
    <%--<hr>--%>
    <%--<tt>model = {{data.model}}</tt><br/>--%>
<%--</div>--%>
<%--</body>--%>
</html>
