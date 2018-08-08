<!-- Button to Open the Modal -->
<!-- <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
  Open modal
</button> -->

<!-- The Modal -->
<div class="modal" id="myModal">
  <div class="modal-dialog">
    <div class="modal-content">

      <!-- Modal Header -->
      <div class="modal-header">
        <h4 class="modal-title" id="modalHeadingId"> Success</h4>
        <button type="button" class="close" data-dismiss="modal">&times;</button>
      </div>

      <!-- Modal body -->
      <div class="modal-body" id="modalBodyId">
      </div>

      <!-- Modal footer -->
      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-dismiss="modal" onclick="javascript:goBackToHome();">Go back to Home</button>
      </div>

    </div>
  </div>
</div>
<script>
	function goBackToHome(){
		console.log('----go back to home-----');
		window.location.href = "/commodity/commoditydetails/getHomePage";
	}
</script>