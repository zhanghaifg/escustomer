function validate(){
	var v1 = isNaN($("#month").val());
	var v2 = isNaN($("#year").val());
	var month = $("#month").val();
	var year = $("#year").val();
	if (month.length!=2) {
		var s = "input 2 digit for month";
		$("#serror").text(s);
		return false;
	}
	if (month>=12||month<=1) {
		var s = "month is between 1 and 12";
		$("#serror").text(s);
		return false;
	}
	if (v1||v2){
		var s = "input number for month and year";
		$("#serror").text(s);
		return false;
	}
	return true;
}
