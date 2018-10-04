<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="utf-8">
<title>Insure Calculator</title>
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css" href="css/app.css" />
<link rel="stylesheet" type="text/css" href="css/static.css" />

</head>
<body ng-app="insure">
	<div class="container" ng-controller="InsuranceController">
		<header>
			<div class="container  w3-grey">
				<div class="headerRow" style="padding-left: 15px; margin-left: 0px;">
					<h1>
						<font color="#00667f" style="font-weight: bold">Insurance
							Module Product</font>
					</h1>
				</div>
			</div>
		</header>
		<span>&nbsp</span>
		<div class="container">
			<form>

				<div class="form-group row">
					<label for="modules" class="col-sm-3 ">Insurance Modules:</label>
					<div class="col-sm-3">
						<select id="module" ng-model="moduleSelected" class="form-control"
							ng-options="obj.moduleName for obj in allModules">
							<option value="">--Please Select--</option>
						</select>
					</div>
				</div>
				<div class="form-group row">
					<label for="modules" class="col-sm-3 ">Insurance Coverage
						Range:</label> <span class="col-sm-2"
						ng-repeat="operation in allCoverageDetails"> <input
						type="radio" name="operations" ng-model="coverageRange"
						value="{{operation}}" ng-click="getCheckedFunc()" />
						{{operation.rangeText}}
					</span>
				</div>
				<div class="form-group row">
					<label for="period" name="period" class="col-sm-3 "> Period
						for Premium (Months)<span class="error"
						ng-show="period.$error.required">*</span>
					</label>
					<div class="col-sm-3">
						<input id="period" name="period" class="form-control col-sm-3"
							type="text" ng-model="period" placeholder="EX: 18"
							ng-minlength="1" ng-maxlength="5" ng-pattern="/^\d+$/" required />
					</div>
				</div>
				<div class="form-group row">
					<label for="modules" class="col-sm-3 ">Amount per month:</label>
					<button class=" col-sm-2 btn btn-default border-radius-small"
						id="buttonSave" ng-click="calculate()">Calculate Tariff</button>

					<button class=" col-sm-2 btn btn-default border-radius-small"
						id="buttonSave" ng-click="save()">Save</button>
				</div>
				<div class="form-group row">
					<span class="col-sm-6  ">{{riskPercentage}}</span>
				</div>
				<div class="form-group row">
					<span class="col-sm-6  ">{{tariffCalculated}}</span>
				</div>

			</form>

			<table id="insure">
				<tr>
					<th>Module Name</th>
					<th>Coverage</th>
					<th>Tariff Applied</th>
				</tr>
				<tr ng-repeat="x in allTariff">
					<td>{{x.moduleName}}</td>
					<td>{{x.coverageStored}}</td>
					<td>{{x.tariffCalculated}}</td>
				</tr>
			</table>
		</div>

	</div>
</body>
<script src="js/lib/angular.js"></script>
<script src="js/lib/ui-bootstrap-tpls-2.5.0.min.js"></script>
<script src="js/app/app.js"></script>
<script src="js/app/InsuranceController.js"></script>
<script src="js/app/InsuranceService.js"></script>
</html>
