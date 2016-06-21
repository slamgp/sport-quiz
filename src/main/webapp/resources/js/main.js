function paintContext() {
    $("#mainContext").css({'background-color': 'yellow'});
}

function divContentRequest() {
	$.ajax({
	    url: '/sport/content',            
	    dataType : "html",                    
	    success: function (data, textStatus) { 
	         $("#mainContext").html(data);
	    } 
	});
}

function divContentRequestPOST() {
	$.ajax({
		url: '/sport/content',
		type: 'POST',            
	    dataType : 'json',     
	    contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function (data, textStatus) {
	    	alert("data " + data);
	        $("#mainContext").html(data.name);
	    },
		error : function(e) {
			console.log("ERROR: ", e);
		}
	});
}

$("#mainContext").bind('click', function() {paintContext()});
$("#btnDivContent").bind('click', function() {divContentRequest()});
$("#btnDivContentPost").bind('click', function() {divContentRequestPOST()});

$(document).ready(function(){   
    var player = $('#player').get(0);
    player.play();
});
