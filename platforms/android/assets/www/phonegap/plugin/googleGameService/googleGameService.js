cordova.define("com.github.aogilvie.phonegap.plugin.googleGameService", function(require, exports, module) {
/**
 * 
 * @author Ally Ogilvie
 * @copyright 2014
 * @file googleGameService.js for Cordova
 *
 */
    var exec = require("cordova/exec");

    if (window.cordova) {
        window.document.addEventListener("deviceready", function () {
            ggs.authenticate("12345", null, null, function (e) { alert(e) });
        }, false);
    }

    var ggs = {
        authenticate: function(id, options, s, f) {
            return cordova.exec(s, f, "GoogleGameServicePlugin", "authenticate", [id]);
        }
    }
    
    module.exports = ggs;
});