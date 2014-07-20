var parse = {

	initialize : function(successCallback, errorCallback){
		cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'ParseExtension', // mapped to our native Java class called "ParseExtension"
            'initialize', // with this action name
            [{                  // and this array of custom arguments to create our entry
                "appid": "test1",
                "clientkey": "test2"
            }]
        ); 
	}

}

module.exports = parse;