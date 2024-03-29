<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
</div>
<!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

<script src="https://code.jquery.com/jquery-3.7.1.min.js"
    integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
    crossorigin="anonymous"></script>
<script src="/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="/resources/vendor/metisMenu/metisMenu.min.js"></script>
<script src="/resources/vendor/datatables/js/jquery.dataTables.min.js"></script>
<script src="/resources/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
<script src="/resources/vendor/datatables-responsive/dataTables.responsive.js"></script>
<script src="/resources/dist/js/sb-admin-2.js"></script>


<script>
	$(document).ready(function() {
		$('#dataTables-example').DataTable({
			responsive: true
		});
		$(".sidebar-nav")
		.attr("class","sidebar-nav navbar-collapse collapse")
		.attr("aria-expanded", 'false')
		.attr("style", "height:1px");
	});
</script>

</body>
</html>
