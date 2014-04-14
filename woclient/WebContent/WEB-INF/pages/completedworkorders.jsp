<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>WorkOrder View</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">

    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/bootstrap-responsive.min.css" rel="stylesheet">

    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">
    <link href="resources/css/font-awesome.css" rel="stylesheet">

    <link href="resources/css/style.css" rel="stylesheet">
	 <link href="resources/css/pages/plans.css" rel="stylesheet">

	<script src="resources/js/bootstrap.js"></script>
<script src="resources/js/base.js"></script>
<link href="http://www.fuelcdn.com/fuelux-imh/2.4.0/css/fuelux.css" rel="stylesheet" />
<link href="http://www.fuelcdn.com/fuelux-imh/2.4.0/css/fuelux-responsive.css" rel="stylesheet" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
<script src="http://www.fuelcdn.com/fuelux-imh/2.4.0/loader.min.js" type="text/javascript"></script>


    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <link href="resources/js/grid/datasource.js">
<script  type="text/javascript">
$( document ).ready(function() {
 $('#MyGrid').datagrid({ dataSource: "StaticDataSource", stretchHeight: true });
});
</script>
  </head>

<body>









<div class="main">



	    <div class="container">
		<div class="fuelux">
		   <!-- DATAGRID MARKUP -->
			<table id="MyGrid" class="table table-bordered datagrid">
				<thead>
				<tr>
					<th>
						<span class="datagrid-header-title">SO-16440292</span>
						<div class="datagrid-header-left"></div>
						<div class="datagrid-header-right">
							<div class="input-append search">
								<input type="text" class="input-medium" placeholder="Search"><button class="btn"><i class="icon-search"></i></button>
							</div>
						</div>
					</th>
				</tr>
				</thead>

				<tfoot>
				<tr>
					<th>
						<div class="datagrid-footer-left" style="display:none;">
							<div class="grid-controls">
								<span><span class="grid-start"></span> - <span class="grid-end"></span> of <span class="grid-count"></span></span>
								<select class="grid-pagesize"><option>5</option><option>10</option></select>
								<span>Per Page</span>
							</div>
						</div>
						<div class="datagrid-footer-right" style="display:none;">
							<div class="grid-pager">
								<button class="btn grid-prevpage"><i class="icon-chevron-left"></i></button>
								<span>Page</span>
								<div class="input-append dropdown combobox">
									<input class="span1" type="text">
								</div>
								<span>of <span class="grid-pages"></span></span>
								<button class="btn grid-nextpage"><i class="icon-chevron-right"></i></button>
							</div>
						</div>
					</th>
				</tr>
				</tfoot>
	</table>
	    </div> <!-- /fuelux -->
		</div> <!-- /container -->

</div> <!-- /main -->




  </body>

</html>
