<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${cxt }/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/common/bootstrap.min.css">
<link rel="stylesheet" href="css/backend/write_article.css"
	type="text/css">
<link rel="stylesheet" href="css/backend/simditor.css" />
<script type="text/javascript" src="js/backend/jquery.min.js"></script>
<script type="text/javascript" src="js/backend/module.js"></script>
<script type="text/javascript" src="js/backend/hotkeys.js"></script>
<script type="text/javascript" src="js/backend/uploader.js"></script>
<script type="text/javascript" src="js/backend/simditor.js"></script>
<title>右侧栏</title>
</head>
<body>
	<div id="right">
		<div class="wrap">
			<h1 class="heading-inline">撰写新文章</h1>
			<div class="title_div">
				<input type="text" autocomplete="off" placeholder="在此输入标题">
			</div>
			<div class="editor_area">
				<div class="form-group">
					<textarea class="from-control" name="content" id="editor"
						placeholder="正文从这里开始..."></textarea>
				</div>
			</div>
			<div id="other">
				<div id="upload">
					<div class="upload_header">发布</div>
					<div class="upload_type">
						<button class="btn btn-primary save_draft" type="button">保存草稿</button>
						<button class="btn btn-primary  release" type="button">发布</button>
					</div>
				</div>
				<div id="article_type">
					<div class="a_header">分类</div>
					<div class="art_type">
						<ol class="art_list">
							<li><input type="radio" value="编程语言" name="a_type">编程语言 </li>
							<li><input type="radio" value="操作系统" name="a_type">操作系统 </li>
							<li><input type="radio" value="计算机网络" name="a_type">计算机网络</li>
							<li><input type="radio" value="答题" name="a_type">答题</li>
						</ol>
					</div>
				</div>
				<div id="article_tag">
					<div class="tag_header">标签</div>
					<div class="tag_div">
						<ol class="tag_list">
							<li><input type="radio" value="" name="tag_type">haha</li>
							<li><input type="radio" value="" name="tag_type">haha</li>
							<li><input type="radio" value="" name="tag_type">haha</li>
						</ol>
					</div>
				</div>
			</div>
			<script type="text/javascript">
				var editor = new Simditor({
					textarea : $('#editor'),
					upload : {
						url : '/file/upload',
						fileKey : 'file_key'
					}
				});
			</script>
		</div>
	</div>
</body>
</html>