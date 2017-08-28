$(document).ready(function() {
	$(function() {
		$("#search").autocomplete({

			source : function(request, response) {
				$.ajax({
					url : "../QuestionSearchAutoComplete",
					type : "get",
					data : {
						term : request.term
					},
					dataType : "json",
					success : function(data) {
						response(data);
					}
				});
			}
                         
		});
	});
        
        
});
