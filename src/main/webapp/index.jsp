<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/accountbook/resource/css/jquery.dataTables.min.css">
<script type="text/javascript" language="javascript" src="/accountbook/resource/js/jquery.js"></script>
<script type="text/javascript" language="javascript" src="/accountbook/resource/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" language="javascript">
	

$(document).ready(function() {
	$('#datatable').DataTable( {
		"processing": true,
		"serverSide": true,
		"ajax": {
			"url": "/accountbook/operation/listItems",
			"type": "POST"
		},
		"columns": [
			{ "data": "id" },
			{ "data": "categoryId" },
			{ "data": "name" },
			{ "data": "amount" },
			{ "data": "remark" }
		]
	} );
} );

	</script>
</head>
<body>
<div><a href="/accountbook/addItem.jsp">添加</a></div>
<div>
<table id="datatable" class="display" cellspacing="0" width="100%">
   <thead>
       <tr>
           <th>id</th>
           <th>category</th>
           <th>name</th>
           <th>amount</th>
           <th>remark</th>
       </tr>
   </thead>
   <tfoot>
       <tr>
            <th>id</th>
           <th>category</th>
           <th>name</th>
           <th>amount</th>
           <th>remark</th>
       </tr>
   </tfoot>
</table>
</div>
</body>
</html>