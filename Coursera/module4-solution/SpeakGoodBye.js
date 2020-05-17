(function (window){
	var byeSpeaker = {};

	var speakWord = "Good Bye";
	byeSpeaker.SpeakGoodBye = function (name) {
	  console.log(speakWord + " " + name);
	}

	window.byeSpeaker = byeSpeaker;

})(window);
