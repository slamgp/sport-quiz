function paintContext() {
    $("#mainContext").css({'background-color': 'yellow'});
}

$("#mainContext").bind('click', function() {paintContext()});

