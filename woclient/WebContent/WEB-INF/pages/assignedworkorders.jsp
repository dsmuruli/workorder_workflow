<!DOCTYPE html>
<html lang="en">

 <head>
    <meta charset="utf-8">
    <title>Signup - Bootstrap Admin Template</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">

<link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="resources/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />

<link href="resources/css/font-awesome.css" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">

<link href="resources/css/style.css" rel="stylesheet" type="text/css">
<link href="resources/css/pages/signin.css" rel="stylesheet" type="text/css">
<link href="resources/css/pages/reports.css" rel="stylesheet">
<script src="https://www.igniteui.com:443/data-files/nw-customers-with-orders.js"></script>

<!-- Ignite UI Required Combined CSS Files -->
    <link href="http://cdn-na.infragistics.com/jquery/20132/latest/css/themes/infragistics/infragistics.theme.css" rel="stylesheet" />
    <link href="http://cdn-na.infragistics.com/jquery/20132/latest/css/structure/infragistics.css" rel="stylesheet" />
    <link href="https://www.igniteui.com:443/css/bootstrap/bootstrap-responsive.min.css" rel="stylesheet" />

    <script src="http://modernizr.com/downloads/modernizr-latest.js"></script>
    <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.min.js"></script>

    <!-- Ignite UI Required Combined JavaScript Files -->
    <script src="http://cdn-na.infragistics.com/jquery/20132/latest/js/infragistics.core.js"></script>
    <script src="http://cdn-na.infragistics.com/jquery/20132/latest/js/infragistics.lob.js"></script>

</head>

<body>

	<div class="navbar navbar-fixed-top">

	<div class="navbar-inner">

		<div class="container">

			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</a>

			<a class="brand" href="index.html">
				Assigned Work Orders
			</a>

			<div class="nav-collapse">
				<ul class="nav pull-right">
					<li class="">
						<a href="login.html" class="">
							Already have an account? Login now
						</a>

					</li>
					<li class="">
						<a href="index.html" class="">
							<i class="icon-chevron-left"></i>
							Back to Homepage
						</a>

					</li>
				</ul>

			</div><!--/.nav-collapse -->

		</div> <!-- /container -->

	</div> <!-- /navbar-inner -->

</div> <!-- /navbar -->

<div class="main">
 <div class="container">
<div class="info-box">



	      	<div class="span12">
	      	<h1>My Assigned Work Orders</h1>
	      	</div> <!-- div span 12 -->




	    <table id="grid"></table>
	    <script>
	        $(function () {
	            $("#grid").igGrid({
	                columns: [
	                    { headerText: "Work Orer ID", key: "ID", dataType: "string", width:"10%" },
	                    { headerText: "Work Order Title", key: "CompanyName", dataType: "string", width: "10%" },
	                    { headerText: "Customer Contact Name", key: "ContactName", dataType: "string", width: "10%" },
	                    { headerText: "Customer Contact Title", key: "ContactTitle", dataType: "string", width: "15%" },
	                    { headerText: "Site Address", key: "Address", dataType: "string", width: "15%" },
	                    { headerText: "Site City", key: "City", dataType: "string", width: "10%" },
	                    { headerText: "Last Worked", key: "Country", dataType: "string", width: "15%" }
	                ],
	                autoGenerateColumns: false,
	                dataSource: nwCustomersWithOrders,
	                width: "100%",
	                height: "70%",
	                autofitLastColumn: true,
	                features: [
	                    {
	                        name: "Responsive",
	                        enableVerticalRendering: true,
	                        columnSettings: [
	                            {
	                                columnKey: "ID",
	                                classes: "hidden-tablet hidden-phone"
	                            },
	                            {
	                                columnKey: "ContactName",
	                                classes: "hidden-phone"
	                            },
	                            {
	                                columnKey: "ContactTitle",
	                                classes: "hidden-tablet hidden-phone"
	                            },
	                            {
	                                columnKey: "Address",
	                                classes: "hidden-phone"
	                            },
	                            {
	                                columnKey: "City",
	                                classes: "hidden-phone"
	                            },
	                            {
	                                columnKey: "Country",
	                                classes: "hidden-tablet hidden-phone"
	                            }
	                        ]
	                    }
	                ]
	            });
	        });
    </script>

	</div> <!-- info-box -->
	</div> <!-- container -->
</div> <!-- /main -->






<script src="js/bootstrap.js"></script>

<script src="js/signin.js"></script>

</body>

 </html>
