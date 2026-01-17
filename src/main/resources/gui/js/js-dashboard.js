window.addEventListener('load', function(){
	
	const logoutButton = document.querySelector('.header-spacer-container');
	
	if(logoutButton){
		logoutButton.addEventListener('click', function(e){
			console.log("Logging out...");
			//code to clear tokens and secure logout
			window.location.href = 'login.html';
		});
	}else{
		console.error("Could not find the logout button");
	}
});