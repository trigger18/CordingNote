$(document).ready(function() {
	$('#btn').on('click', process);
});

function process() {
	var param = $('form').serialize();
	$.ajax({
		type : 'POST',
		dataType : 'text',
		data : param,
		//data : 'id=' + id + '&pass=' + pass,
		url : 'loginProcess',
		success : function(res) {
			$('#div').html(res);
		}
	})
}