// (function(angular) {
//     'use strict';
//     angular.module('ngrepeatSelect', [])
//         .controller('ExampleController', ['$scope', function($scope) {
//             $scope.data = {
//                 model: null,
//                 availableOptions: [
//                     {id: '1', name: 'Option A'},
//                     {id: '2', name: 'Option B'},
//                     {id: '3', name: 'Option C'}
//                 ]
//             };
//         }]);
// })(window.angular);

// var app = angular.module('myApp', []);
// app.controller('myCtrl', function($scope) {
//     $scope.names = ["Emil", "Tobias", "Linus"];
// });

// (function(angular) {
//     'use strict';
//     angular.module('staticSelect', [])
//         .controller('ExampleController', ['$scope', function($scope) {
//             $scope.data = {
//                 singleSelect: null,
//                 multipleSelect: [],
//                 option1: 'option-1'
//             };
//
//             $scope.forceUnknownOption = function() {
//                 $scope.data.singleSelect = 'nonsense';
//             };
//         }]);
// })(window.angular);

'use strict';

var App = angular.module('myApp',[]);

/*
Copyright 2017 Google Inc. All Rights Reserved.
Use of this source code is governed by an MIT-style license that
can be found in the LICENSE file at http://angular.io/license
*/