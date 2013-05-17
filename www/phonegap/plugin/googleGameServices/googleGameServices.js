/**
 * 
 * @author Ally Ogilvie
 * @copyright WizCorp Inc. [ Incorporated Wizards ] 2013
 * @file googleGameServices.js for Cordova
 *
 */

if (window.cordova) {
    window.document.addEventListener("deviceready", function () {
        cordova.exec(null, null, "GoogleGameServicesPlugin", "test", []);
    }, false);
}

var googleGameServices = {

	test : function(id, options) {

		return cordova.exec(null, null, "GoogleGameServicesPlugin", "test", []);
	}
}