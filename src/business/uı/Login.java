package business.uý;

import business.abstracts.UserService;

public class Login {
	private UserService userService;

    public Login(UserService userService)
    {
        this.userService=userService;
    }

    public void login(String mail, String password)
    {

    }

    public void loginWithGoogle(String mail)
    {

        userService.loginWithGoogle(mail);
    }

}
