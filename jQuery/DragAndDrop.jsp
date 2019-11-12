<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Drag and Drop</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.0.11/handlebars.js"></script>
<style type="text/css">
.fileDrop {
	width: 300px;
	height: 100px;
	border: 1px dotted blue;
	overflow: auto;
}
</style>
<script type="text/javascript">
	var urno = '';
	var fileList = [];
	$(document).ready(function() {				
		//내PC 첨부파일 시작////////////////////
		//var filecount = 0;
		var userfile = '';
		$('#userpc').on('click', function() {
			userfile = $('<input type="file" />');
			userfile.click();
			userfile.change(function() {						
			   console.log($(userfile[0]).val());
				var partname = $(userfile[0]).val().substring($(userfile[0]).val().lastIndexOf("\\")+1);
				console.log(partname);
				var str = '<p><input type="checkbox" />' + partname + '</p>';
			//	$('.fileDrop').empty(); //초기화
				$('.fileDrop').append(str);						
			//fileList = fileList + userfile[0].files[0];
				fileList.push(userfile[0].files[0]);
		     //console.log(fileList);
			});
		});
		//내PC 첨부파일끝///////////////////////
		//첨부파일 드래그 시작///////////////
		var obj = $('.fileDrop');
		var win=$('.fileDrop');
		win.on('dragover', function(e) {
			//dragover, dragenter은 되지만 drop이 안되므로 preventDefault() 메소드를 호출한다.
			e.preventDefault();
			$(this).css('border', '2px solid #0B85A1');
		});
		win.on('drop', function(e) {
			e.preventDefault();
		//	$(obj).empty();
			var files = e.originalEvent.dataTransfer.files;
			for(i=0; i<files.length;i++){
			obj.append('<p><input type="checkbox" />' + files[i].name + '</p>');
			fileList.push(files[i]);
			}
			console.log(fileList);
		});				
		//첨부파일 드래그 끝///////////////
		//첨부파일 삭제 시작////
		$(document).on('click','.fileDrop input' ,function(){
			if($(this).prop('checked')){
				fileList.pop($(this).index());
				$(this).parent().remove();
			}
		});
		//첨부파일 삭제 끝///////////////////
	});//end readly()////////////////////////////

	function files_upload() {
		//첨부파일을 보낼때는 이렇게
		var form_data = new FormData();
		form_data.append('bno', '${boardDTO.bno}');
		form_data.append('replyer', $("#newReplyWriter").val());
		form_data.append('replytext', $("#newReplyText").val());
		//	다중첨부파일
		if (fileList) {
			for ( var index in fileList) {
				form_data.append('filename', fileList[index]);
			}
		}
		$.ajax({
			// 첨부파일이 있을때는 data, contentType, enctype, processData가 이런 폼으로 있어야한다.
			type : 'POST',
			dataType : 'json',
			url : 'replyInsertList.do',
			data : form_data,
			contentType : false,
			enctype : 'multipart/form-data',
			processData : false,
			success : reply_list_result
		});
		fileList = [];
	}
</script>
</head>
<body>
	<div class="wrap">
		<!-- box box-success 시작 -->
		<div class="box box-success">
			<div class="box-header">
				<h3 class="box-title">Drag and Drop</h3>
			</div>
			<div class="box-body">
				<div><span id="userpc" style="cursor: pointer">내PC</span></div>
				<div class="fileDrop"></div>
			</div>
			<div class="box-footer">
				<button type="button" class="btn btn-primary" id="replyAddBtn">ADD File</button>
			</div>
		</div>
		<!-- box box-success 끝 -->
	</div>
</body>
</html>