angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    
  

      .state('menu.tres', {
    url: '/page1',
    views: {
      'side-menu21': {
        templateUrl: 'templates/tres.html',
        controller: 'tresCtrl'
      }
    }
  })

  .state('menu.acercaDe', {
    url: '/page2',
    views: {
      'side-menu21': {
        templateUrl: 'templates/acercaDe.html',
        controller: 'acercaDeCtrl'
      }
    }
  })

  .state('menu', {
    url: '/side-menu21',
    templateUrl: 'templates/menu.html',
    abstract:true
  })

  .state('menu.cuatro', {
    url: '/page3',
    views: {
      'side-menu21': {
        templateUrl: 'templates/cuatro.html',
        controller: 'cuatroCtrl'
      }
    }
  })

  .state('menu.cinco', {
    url: '/page4',
    views: {
      'side-menu21': {
        templateUrl: 'templates/cinco.html',
        controller: 'cincoCtrl'
      }
    }
  })

  .state('menu.seis', {
    url: '/page5',
    views: {
      'side-menu21': {
        templateUrl: 'templates/seis.html',
        controller: 'seisCtrl'
      }
    }
  })

  .state('menu.comojugar', {
    url: '/page6',
    views: {
      'side-menu21': {
        templateUrl: 'templates/comojugar.html',
        controller: 'comojugarCtrl'
      }
    }
  })

$urlRouterProvider.otherwise('/side-menu21/page1')

  

});