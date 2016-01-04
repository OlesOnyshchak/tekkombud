angular
    .module('app')
    .controller('NavigationController', ['$scope', '$location',
        function ($scope, $location) {
            $scope.loaded = true;
            $scope.isActive = function (viewLocation) {
                return viewLocation === $location.path();
            };
        }]);
