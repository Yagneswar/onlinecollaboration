var home = angular.module('collaborationAppHome', []);

home.controller('HomeController', function($location) {

	// to highlight the active menu
	window.menu = 'home';
});

home.controller('AboutController', function() {

	// to highlight the active menu
	window.menu = 'about';
});

home.controller('ContactController', function() {

	// to highlight the active menu
	window.menu = 'contact';
});
