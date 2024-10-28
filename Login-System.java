    public class Main {
        document.addEventListener("DOMContentLoaded", function() {
            const loginBtn = document.getElementById("login-btn");
            const signUpBtn = document.getElementById("sign-up-btn");
            const responseDiv = document.getElementById("response");
            const signUpForm = document.getElementById("sign-up-form");
            const createAccountBtn = document.getElementById("create-account-btn");
            let accounts = localStorage.getItem("accounts");
            if (!accounts) {
                accounts = {};
                localStorage.setItem("accounts", JSON.stringify(accounts));
            } else {
                accounts = JSON.parse(accounts);
            }
            loginBtn.addEventListener("click", function() {
                const username = document.getElementById("username").value;
                const password = document.getElementById("password").value;
                if (accounts[username] && accounts[username] === password) {
                    responseDiv.innerText = "Login successful!";
                } else {
                    responseDiv.innerText = "Invalid username or password. Please sign up for an account.";
                    signUpBtn.disabled = false;
                }
            });
            signUpBtn.addEventListener("click", function() {
                document.getElementById("login-form").style.display = "none";
                signUpForm.style.display = "block";
            });
            createAccountBtn.addEventListener("click", function() {
                const newUsername = document.getElementById("new-username").value;
                const newPassword = document.getElementById("new-password").value;
    
    }
     
}
