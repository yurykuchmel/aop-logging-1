<!DOCTYPE html>
<html>
	<head>
		<title>MongoDB Log Viewer</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="centered">
			<h3>MongoDB Log Viewer</h3>
			<form class="form-horizontal">
				<div class="form-group">
					<label for="fromDate">From</label>
					<input type="date" class="form-control" id="fromDate" placeholder="Date from...">
				</div>
				<div class="form-group">
					<label for="toDate">To</label>
					<input type="date" class="form-control" id="toDate" placeholder="Date to...">
				</div>
				<div class="form-group">
					<label for="businessFunction">Business Function</label>
					<input type="date" class="form-control" id="businessFunction" placeholder="Business function...">
				</div>
				<div class="form-group">
					<button id="search" type="button" class="btn btn-primary">Search</button>
				</div>
			</form>
		</div>
	</body>
	
	<script>
		$(document).ready(function(){
			$("#search").click(function(){
				$.ajax({
					url: "log/getLog"
				})
				.done(function(response){
					alert(response);
				});
			});
		});
	</script>
	
	<style>
		.centered {
			width: 50%;
			margin: 0 auto;
		}
	</style>
</html>