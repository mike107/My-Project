<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles.css">
<script src="index.js"></script>
	<title>
		SD - Smart Drive Automated Vehicle
	</title>
</head>
<body>
<div id="title">
</div>
<div class="drop">
	<ul class="drop_menu">
		<li><a href='SD.html'>Home</a>
		</li>
		<li><a href='#'>Personal</a>
		<ul>
			<li><a href='#'>Vehicle for 1</a></li>
			<li><a href='#'>Vehicle for 2</a></li>
			<li><a href='#'>Vehicle for 4</a></li>
			<li><a href='#'>Vehicle for 4+</a></li>
		</ul>
		</li>
		<li><a href='#'>Commercial</a>
		<ul>
			<li><a href='#'>National</a></li>
			<li><a href='#'>International</a></li>
		</ul>
		</li>
		<li><a href='#'>About Us</a>
		</li>
		<li><a href='#'>Contact Us</a>
		</li>
	</ul>
</div>
Process Success<br>
Date of reservation: <?php echo $_POST["date"]; ?><br>
Time of arrival for vehicle: <?php echo $_POST["time"]; ?> <br>
Departure: <?php echo $_POST["origin"]; ?> <br>
Arrival:  <?php echo $_POST["destination"]; ?>
</body>
</html>
