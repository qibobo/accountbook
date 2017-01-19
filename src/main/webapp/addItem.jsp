<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <title>Bootstrap 实例 - 表单控件状态</title>
   <link href="/accountbook/resource/css/bootstrap.min.css" rel="stylesheet">
   <script src="/accountbook/resource/js/jquery.js"></script>
   <script src="/accountbook/resource/js/bootstrap.min.js"></script>
</head>
<body>
<a href="/accountbook/index.jsp">列表</a>
<form class="form-horizontal" role="form" action="/accountbook/operation/addItem" method="post">
   <div class="form-group">
      <label class="col-sm-2 control-label">名称</label>
      <div class="col-sm-10">
         <input class="form-control" id="name" name="name" type="text"/>
      </div>
   </div>
   <div class="form-group">
      <label class="col-sm-2 control-label">类别</label>
      <div class="col-sm-10">
         <input class="form-control" id="categoryId" name="categoryId" type="text"/>
      </div>
   </div>
   <div class="form-group">
      <label class="col-sm-2 control-label">金额</label>
      <div class="col-sm-10">
         <input class="form-control" id="amount" name="amount" type="text"/>
      </div>
   </div>
   <div class="form-group">
      <label class="col-sm-2 control-label">备注</label>
      <div class="col-sm-10">
         <input class="form-control" id="remark" name="remark" type="text"/>
      </div>
   </div>
  <div class="form-group form-actions">
					<div class="col-xs-4 col-xs-offset-4 ">
						<button type="submit" class="btn btn-sm btn-info"><span class="glyphicon glyphicon-off"></span>提交</button>
					</div>
				</div>
</form>
 
</body>
</html>