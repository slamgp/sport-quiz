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

$("#mainContext").bind('click', function() {paintContext()});
$("#btnDivContent").bind('click', function() {divContentRequest()});

$(document).ready(function(){   
    alert("alert");
});
