angular.module('app.controllers', [])
  
.controller('tresCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
	$scope.j1=0;
	$scope.j2=0;
	$scope.j3=0;


	$scope.reset = function (){
        $scope.j1=0;
        $scope.j2=0;
        $scope.j3=0;        
    }

    $scope.mas3 = function (){
         $scope.j1=$scope.j1 + 3;        
    }
    $scope.mas4 = function (){
         $scope.j1=$scope.j1 + 4;        
    }
    $scope.mas5 = function (){
         $scope.j1=$scope.j1 + 5;        
    }
    $scope.mas6 = function (){
         $scope.j1=$scope.j1 + 6;        
    }
    $scope.mas7 = function (){
         $scope.j1=$scope.j1 + 7;        
    }
    $scope.mas8 = function (){
         $scope.j1=$scope.j1 + 8;        
    }

    $scope.menos3 = function (){
         $scope.j1=$scope.j1 - 3;        
    }
    $scope.menos4 = function (){
         $scope.j1=$scope.j1 - 4;        
    }
    $scope.menos5 = function (){
         $scope.j1=$scope.j1 - 5;        
    }
    $scope.menos6 = function (){
         $scope.j1=$scope.j1 - 6;        
    }
    $scope.menos7 = function (){
         $scope.j1=$scope.j1 - 7;        
    }
    $scope.menos8 = function (){
         $scope.j1=$scope.j1 - 8;        
    }


    $scope.mas3b = function (){
         $scope.j2=$scope.j2 + 3;        
    }
    $scope.mas4b = function (){
         $scope.j2=$scope.j2 + 4;        
    }
    $scope.mas5b = function (){
         $scope.j2=$scope.j2 + 5;        
    }
    $scope.mas6b = function (){
         $scope.j2=$scope.j2 + 6;        
    }
    $scope.mas7b = function (){
         $scope.j2=$scope.j2 + 7;        
    }
    $scope.mas8b = function (){
         $scope.j2=$scope.j2 + 8;        
    }
    
    $scope.menos3b = function (){
         $scope.j2=$scope.j2 - 3;        
    }
    $scope.menos4b = function (){
         $scope.j2=$scope.j2 - 4;        
    }
    $scope.menos5b = function (){
         $scope.j2=$scope.j2 - 5;        
    }
    $scope.menos6b = function (){
         $scope.j2=$scope.j2 - 6;        
    }
    $scope.menos7b = function (){
         $scope.j2=$scope.j2 - 7;        
    }
    $scope.menos8b = function (){
         $scope.j2=$scope.j2 - 8;        
    }


    $scope.mas3c = function (){
         $scope.j3=$scope.j3 + 3;        
    }
    $scope.mas4c = function (){
         $scope.j3=$scope.j3 + 4;        
    }
    $scope.mas5c = function (){
         $scope.j3=$scope.j3 + 5;        
    }
    $scope.mas6c = function (){
         $scope.j3=$scope.j3 + 6;        
    }
    $scope.mas7c = function (){
         $scope.j3=$scope.j3 + 7;        
    }
    $scope.mas8c = function (){
         $scope.j3=$scope.j3 + 8;        
    }
    
    $scope.menos3c = function (){
         $scope.j3=$scope.j3 - 3;        
    }
    $scope.menos4c = function (){
         $scope.j3=$scope.j3 - 4;        
    }
    $scope.menos5c = function (){
         $scope.j3=$scope.j3 - 5;        
    }
    $scope.menos6c = function (){
         $scope.j3=$scope.j3 - 6;        
    }
    $scope.menos7c = function (){
         $scope.j3=$scope.j3 - 7;        
    }
    $scope.menos8c = function (){
         $scope.j3=$scope.j3 - 8;        
    }


}])
   
.controller('acercaDeCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
      
.controller('cuatroCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
	$scope.j1=0;
	$scope.j2=0;
	$scope.j3=0;
	$scope.j4=0;

	$scope.reset = function (){
        $scope.j1=0;
        $scope.j2=0;
        $scope.j3=0;
        $scope.j4=0;
    }

    $scope.mas3 = function (){
         $scope.j1=$scope.j1 + 3;        
    }
    $scope.mas4 = function (){
         $scope.j1=$scope.j1 + 4;        
    }
    $scope.mas5 = function (){
         $scope.j1=$scope.j1 + 5;        
    }
    $scope.mas6 = function (){
         $scope.j1=$scope.j1 + 6;        
    }
    $scope.mas7 = function (){
         $scope.j1=$scope.j1 + 7;        
    }
    $scope.mas8 = function (){
         $scope.j1=$scope.j1 + 8;        
    }

    $scope.menos3 = function (){
         $scope.j1=$scope.j1 - 3;        
    }
    $scope.menos4 = function (){
         $scope.j1=$scope.j1 - 4;        
    }
    $scope.menos5 = function (){
         $scope.j1=$scope.j1 - 5;        
    }
    $scope.menos6 = function (){
         $scope.j1=$scope.j1 - 6;        
    }
    $scope.menos7 = function (){
         $scope.j1=$scope.j1 - 7;        
    }
    $scope.menos8 = function (){
         $scope.j1=$scope.j1 - 8;        
    }


    $scope.mas3b = function (){
         $scope.j2=$scope.j2 + 3;        
    }
    $scope.mas4b = function (){
         $scope.j2=$scope.j2 + 4;        
    }
    $scope.mas5b = function (){
         $scope.j2=$scope.j2 + 5;        
    }
    $scope.mas6b = function (){
         $scope.j2=$scope.j2 + 6;        
    }
    $scope.mas7b = function (){
         $scope.j2=$scope.j2 + 7;        
    }
    $scope.mas8b = function (){
         $scope.j2=$scope.j2 + 8;        
    }
    
    $scope.menos3b = function (){
         $scope.j2=$scope.j2 - 3;        
    }
    $scope.menos4b = function (){
         $scope.j2=$scope.j2 - 4;        
    }
    $scope.menos5b = function (){
         $scope.j2=$scope.j2 - 5;        
    }
    $scope.menos6b = function (){
         $scope.j2=$scope.j2 - 6;        
    }
    $scope.menos7b = function (){
         $scope.j2=$scope.j2 - 7;        
    }
    $scope.menos8b = function (){
         $scope.j2=$scope.j2 - 8;        
    }


    $scope.mas3c = function (){
         $scope.j3=$scope.j3 + 3;        
    }
    $scope.mas4c = function (){
         $scope.j3=$scope.j3 + 4;        
    }
    $scope.mas5c = function (){
         $scope.j3=$scope.j3 + 5;        
    }
    $scope.mas6c = function (){
         $scope.j3=$scope.j3 + 6;        
    }
    $scope.mas7c = function (){
         $scope.j3=$scope.j3 + 7;        
    }
    $scope.mas8c = function (){
         $scope.j3=$scope.j3 + 8;        
    }
    
    $scope.menos3c = function (){
         $scope.j3=$scope.j3 - 3;        
    }
    $scope.menos4c = function (){
         $scope.j3=$scope.j3 - 4;        
    }
    $scope.menos5c = function (){
         $scope.j3=$scope.j3 - 5;        
    }
    $scope.menos6c = function (){
         $scope.j3=$scope.j3 - 6;        
    }
    $scope.menos7c = function (){
         $scope.j3=$scope.j3 - 7;        
    }
    $scope.menos8c = function (){
         $scope.j3=$scope.j3 - 8;        
    }

	$scope.mas3d = function (){
         $scope.j4=$scope.j4 + 3;        
    }
    $scope.mas4d = function (){
         $scope.j4=$scope.j4 + 4;        
    }
    $scope.mas5d = function (){
         $scope.j4=$scope.j4 + 5;        
    }
    $scope.mas6d = function (){
         $scope.j4=$scope.j4 + 6;        
    }
    $scope.mas7d = function (){
         $scope.j4=$scope.j4 + 7;        
    }
    $scope.mas8d = function (){
         $scope.j4=$scope.j4 + 8;        
    }
    
    $scope.menos3d = function (){
         $scope.j4=$scope.j4 - 3;        
    }
    $scope.menos4d = function (){
         $scope.j4=$scope.j4 - 4;        
    }
    $scope.menos5d = function (){
         $scope.j4=$scope.j4 - 5;        
    }
    $scope.menos6d = function (){
         $scope.j4=$scope.j4 - 6;        
    }
    $scope.menos7d = function (){
         $scope.j4=$scope.j4 - 7;        
    }
    $scope.menos8d = function (){
         $scope.j4=$scope.j4 - 8;        
    }

}])
 
 .controller('cincoCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
    $scope.j1=0;
    $scope.j2=0;
    $scope.j3=0;
    $scope.j4=0;
    $scope.j5=0;

    $scope.reset = function (){
        $scope.j1=0;
        $scope.j2=0;
        $scope.j3=0;
        $scope.j4=0;
        $scope.j5=0;
    }

    $scope.mas3 = function (){
         $scope.j1=$scope.j1 + 3;        
    }
    $scope.mas4 = function (){
         $scope.j1=$scope.j1 + 4;        
    }
    $scope.mas5 = function (){
         $scope.j1=$scope.j1 + 5;        
    }
    $scope.mas6 = function (){
         $scope.j1=$scope.j1 + 6;        
    }
    $scope.mas7 = function (){
         $scope.j1=$scope.j1 + 7;        
    }
    $scope.mas8 = function (){
         $scope.j1=$scope.j1 + 8;        
    }

    $scope.menos3 = function (){
         $scope.j1=$scope.j1 - 3;        
    }
    $scope.menos4 = function (){
         $scope.j1=$scope.j1 - 4;        
    }
    $scope.menos5 = function (){
         $scope.j1=$scope.j1 - 5;        
    }
    $scope.menos6 = function (){
         $scope.j1=$scope.j1 - 6;        
    }
    $scope.menos7 = function (){
         $scope.j1=$scope.j1 - 7;        
    }
    $scope.menos8 = function (){
         $scope.j1=$scope.j1 - 8;        
    }


    $scope.mas3b = function (){
         $scope.j2=$scope.j2 + 3;        
    }
    $scope.mas4b = function (){
         $scope.j2=$scope.j2 + 4;        
    }
    $scope.mas5b = function (){
         $scope.j2=$scope.j2 + 5;        
    }
    $scope.mas6b = function (){
         $scope.j2=$scope.j2 + 6;        
    }
    $scope.mas7b = function (){
         $scope.j2=$scope.j2 + 7;        
    }
    $scope.mas8b = function (){
         $scope.j2=$scope.j2 + 8;        
    }
    
    $scope.menos3b = function (){
         $scope.j2=$scope.j2 - 3;        
    }
    $scope.menos4b = function (){
         $scope.j2=$scope.j2 - 4;        
    }
    $scope.menos5b = function (){
         $scope.j2=$scope.j2 - 5;        
    }
    $scope.menos6b = function (){
         $scope.j2=$scope.j2 - 6;        
    }
    $scope.menos7b = function (){
         $scope.j2=$scope.j2 - 7;        
    }
    $scope.menos8b = function (){
         $scope.j2=$scope.j2 - 8;        
    }


    $scope.mas3c = function (){
         $scope.j3=$scope.j3 + 3;        
    }
    $scope.mas4c = function (){
         $scope.j3=$scope.j3 + 4;        
    }
    $scope.mas5c = function (){
         $scope.j3=$scope.j3 + 5;        
    }
    $scope.mas6c = function (){
         $scope.j3=$scope.j3 + 6;        
    }
    $scope.mas7c = function (){
         $scope.j3=$scope.j3 + 7;        
    }
    $scope.mas8c = function (){
         $scope.j3=$scope.j3 + 8;        
    }
    
    $scope.menos3c = function (){
         $scope.j3=$scope.j3 - 3;        
    }
    $scope.menos4c = function (){
         $scope.j3=$scope.j3 - 4;        
    }
    $scope.menos5c = function (){
         $scope.j3=$scope.j3 - 5;        
    }
    $scope.menos6c = function (){
         $scope.j3=$scope.j3 - 6;        
    }
    $scope.menos7c = function (){
         $scope.j3=$scope.j3 - 7;        
    }
    $scope.menos8c = function (){
         $scope.j3=$scope.j3 - 8;        
    }

    $scope.mas3d = function (){
         $scope.j4=$scope.j4 + 3;        
    }
    $scope.mas4d = function (){
         $scope.j4=$scope.j4 + 4;        
    }
    $scope.mas5d = function (){
         $scope.j4=$scope.j4 + 5;        
    }
    $scope.mas6d = function (){
         $scope.j4=$scope.j4 + 6;        
    }
    $scope.mas7d = function (){
         $scope.j4=$scope.j4 + 7;        
    }
    $scope.mas8d = function (){
         $scope.j4=$scope.j4 + 8;        
    }
    
    $scope.menos3d = function (){
         $scope.j4=$scope.j4 - 3;        
    }
    $scope.menos4d = function (){
         $scope.j4=$scope.j4 - 4;        
    }
    $scope.menos5d = function (){
         $scope.j4=$scope.j4 - 5;        
    }
    $scope.menos6d = function (){
         $scope.j4=$scope.j4 - 6;        
    }
    $scope.menos7d = function (){
         $scope.j4=$scope.j4 - 7;        
    }
    $scope.menos8d = function (){
         $scope.j4=$scope.j4 - 8;        
    }

    $scope.mas3e = function (){
         $scope.j5=$scope.j5 + 3;        
    }
    $scope.mas4e= function (){
         $scope.j5=$scope.j5 + 4;        
    }
    $scope.mas5e = function (){
         $scope.j5=$scope.j5 + 5;        
    }
    $scope.mas6e = function (){
         $scope.j5=$scope.j5 + 6;        
    }
    $scope.mas7e = function (){
         $scope.j5=$scope.j5 + 7;        
    }
    $scope.mas8e = function (){
         $scope.j5=$scope.j5 + 8;        
    }

    $scope.menos3e = function (){
         $scope.j5=$scope.j5 - 3;        
    }
    $scope.menos4e = function (){
         $scope.j5=$scope.j5 - 4;        
    }
    $scope.menos5e = function (){
         $scope.j5=$scope.j5 - 5;        
    }
    $scope.menos6e = function (){
         $scope.j5=$scope.j5 - 6;        
    }
    $scope.menos7e = function (){
         $scope.j5=$scope.j5 - 7;        
    }
    $scope.menos8e= function (){
         $scope.j5=$scope.j5 - 8;        
    }


}])

 .controller('seisCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
    $scope.j1=0;
    $scope.j2=0;
    $scope.j3=0;
    $scope.j4=0;
    $scope.j5=0;
    $scope.j6=0;

    $scope.reset = function (){
        $scope.j1=0;
        $scope.j2=0;
        $scope.j3=0;
        $scope.j4=0;
        $scope.j5=0;
        $scope.j6=0;
    }

    $scope.mas3 = function (){
         $scope.j1=$scope.j1 + 3;        
    }
    $scope.mas4 = function (){
         $scope.j1=$scope.j1 + 4;        
    }
    $scope.mas5 = function (){
         $scope.j1=$scope.j1 + 5;        
    }
    $scope.mas6 = function (){
         $scope.j1=$scope.j1 + 6;        
    }
    $scope.mas7 = function (){
         $scope.j1=$scope.j1 + 7;        
    }
    $scope.mas8 = function (){
         $scope.j1=$scope.j1 + 8;        
    }

    $scope.menos3 = function (){
         $scope.j1=$scope.j1 - 3;        
    }
    $scope.menos4 = function (){
         $scope.j1=$scope.j1 - 4;        
    }
    $scope.menos5 = function (){
         $scope.j1=$scope.j1 - 5;        
    }
    $scope.menos6 = function (){
         $scope.j1=$scope.j1 - 6;        
    }
    $scope.menos7 = function (){
         $scope.j1=$scope.j1 - 7;        
    }
    $scope.menos8 = function (){
         $scope.j1=$scope.j1 - 8;        
    }


    $scope.mas3b = function (){
         $scope.j2=$scope.j2 + 3;        
    }
    $scope.mas4b = function (){
         $scope.j2=$scope.j2 + 4;        
    }
    $scope.mas5b = function (){
         $scope.j2=$scope.j2 + 5;        
    }
    $scope.mas6b = function (){
         $scope.j2=$scope.j2 + 6;        
    }
    $scope.mas7b = function (){
         $scope.j2=$scope.j2 + 7;        
    }
    $scope.mas8b = function (){
         $scope.j2=$scope.j2 + 8;        
    }
    
    $scope.menos3b = function (){
         $scope.j2=$scope.j2 - 3;        
    }
    $scope.menos4b = function (){
         $scope.j2=$scope.j2 - 4;        
    }
    $scope.menos5b = function (){
         $scope.j2=$scope.j2 - 5;        
    }
    $scope.menos6b = function (){
         $scope.j2=$scope.j2 - 6;        
    }
    $scope.menos7b = function (){
         $scope.j2=$scope.j2 - 7;        
    }
    $scope.menos8b = function (){
         $scope.j2=$scope.j2 - 8;        
    }


    $scope.mas3c = function (){
         $scope.j3=$scope.j3 + 3;        
    }
    $scope.mas4c = function (){
         $scope.j3=$scope.j3 + 4;        
    }
    $scope.mas5c = function (){
         $scope.j3=$scope.j3 + 5;        
    }
    $scope.mas6c = function (){
         $scope.j3=$scope.j3 + 6;        
    }
    $scope.mas7c = function (){
         $scope.j3=$scope.j3 + 7;        
    }
    $scope.mas8c = function (){
         $scope.j3=$scope.j3 + 8;        
    }
    
    $scope.menos3c = function (){
         $scope.j3=$scope.j3 - 3;        
    }
    $scope.menos4c = function (){
         $scope.j3=$scope.j3 - 4;        
    }
    $scope.menos5c = function (){
         $scope.j3=$scope.j3 - 5;        
    }
    $scope.menos6c = function (){
         $scope.j3=$scope.j3 - 6;        
    }
    $scope.menos7c = function (){
         $scope.j3=$scope.j3 - 7;        
    }
    $scope.menos8c = function (){
         $scope.j3=$scope.j3 - 8;        
    }

    $scope.mas3d = function (){
         $scope.j4=$scope.j4 + 3;        
    }
    $scope.mas4d = function (){
         $scope.j4=$scope.j4 + 4;        
    }
    $scope.mas5d = function (){
         $scope.j4=$scope.j4 + 5;        
    }
    $scope.mas6d = function (){
         $scope.j4=$scope.j4 + 6;        
    }
    $scope.mas7d = function (){
         $scope.j4=$scope.j4 + 7;        
    }
    $scope.mas8d = function (){
         $scope.j4=$scope.j4 + 8;        
    }
    
    $scope.menos3d = function (){
         $scope.j4=$scope.j4 - 3;        
    }
    $scope.menos4d = function (){
         $scope.j4=$scope.j4 - 4;        
    }
    $scope.menos5d = function (){
         $scope.j4=$scope.j4 - 5;        
    }
    $scope.menos6d = function (){
         $scope.j4=$scope.j4 - 6;        
    }
    $scope.menos7d = function (){
         $scope.j4=$scope.j4 - 7;        
    }
    $scope.menos8d = function (){
         $scope.j4=$scope.j4 - 8;        
    }

    $scope.mas3e = function (){
         $scope.j5=$scope.j5 + 3;        
    }
    $scope.mas4e= function (){
         $scope.j5=$scope.j5 + 4;        
    }
    $scope.mas5e = function (){
         $scope.j5=$scope.j5 + 5;        
    }
    $scope.mas6e = function (){
         $scope.j5=$scope.j5 + 6;        
    }
    $scope.mas7e = function (){
         $scope.j5=$scope.j5 + 7;        
    }
    $scope.mas8e = function (){
         $scope.j5=$scope.j5 + 8;        
    }

    $scope.menos3e = function (){
         $scope.j5=$scope.j5 - 3;        
    }
    $scope.menos4e = function (){
         $scope.j5=$scope.j5 - 4;        
    }
    $scope.menos5e = function (){
         $scope.j5=$scope.j5 - 5;        
    }
    $scope.menos6e = function (){
         $scope.j5=$scope.j5 - 6;        
    }
    $scope.menos7e = function (){
         $scope.j5=$scope.j5 - 7;        
    }
    $scope.menos8e= function (){
         $scope.j5=$scope.j5 - 8;        
    }

    $scope.mas3f = function (){
         $scope.j6=$scope.j6 + 3;        
    }
    $scope.mas4f = function (){
         $scope.j6=$scope.j6 + 4;        
    }
    $scope.mas5f = function (){
         $scope.j6=$scope.j6 + 5;        
    }
    $scope.mas6f = function (){
         $scope.j6=$scope.j6 + 6;        
    }
    $scope.mas7f = function (){
         $scope.j6=$scope.j6 + 7;        
    }
    $scope.mas8f = function (){
         $scope.j6=$scope.j6 + 8;        
    }

    $scope.menos3f = function (){
         $scope.j6=$scope.j6 - 3;        
    }
    $scope.menos4f = function (){
         $scope.j6=$scope.j6 - 4;        
    }
    $scope.menos5f = function (){
         $scope.j6=$scope.j6 - 5;        
    }
    $scope.menos6f = function (){
         $scope.j6=$scope.j6 - 6;        
    }
    $scope.menos7f = function (){
         $scope.j6=$scope.j6 - 7;        
    }
    $scope.menos8f = function (){
         $scope.j6=$scope.j6 - 8;        
    }

}])

 .controller('comojugarCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
