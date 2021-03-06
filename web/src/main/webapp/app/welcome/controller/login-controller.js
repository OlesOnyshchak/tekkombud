angular.module('app')
    .controller('LoginController', ['$scope', '$http','$modal', function ($scope, $http,$modal) {
        $scope.login = function () {

            $scope.incorrectStyle = false;
            $scope.incorrectStylePlaceholder = false;
            $scope.loginCorrect = false;

            var loginData = 'username=' + $scope.login.username
                + '&password=' + $scope.login.password;

            console.log(loginData);
            var request = {
                method: 'POST',
                url: '/authenticate',
                data: loginData,
                headers: {
                    'Content-Type': "application/x-www-form-urlencoded",
                    'X-Login-Ajax-call': 'true'
                }
            };

            var response = $http(request);
            response.success(function (data) {
                var path = redirectByRole(data);
                $scope.login.password = null;

                if (path)
                    window.location.replace(path);
                if (path == undefined){
                    $scope.loginCorrect = true;
                    $scope.incorrectStyle = true;
                    $scope.incorrectStylePlaceholder = true;

                    var modalInstance = $modal.open({
                        animation: true,
                        templateUrl: 'app/welcome/template/modals/error/login.html',
                        size: 'md'
                    });
                }
            });
            response.error(function (data) {
                console.dir(data);
                console.log("bad");
            });

            function redirectByRole(role) {
                var path = undefined;
                if (role == "ADMIN")
                    path = '/admin';
                else if (role == 'USER')
                    path = '/employee';
                return path;
            }
        };
    }]);
