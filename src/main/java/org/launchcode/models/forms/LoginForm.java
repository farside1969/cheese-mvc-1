package org.launchcode.models.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by LaunchCode
 */
public class LoginForm {

    @NotNull
    @Pattern(regexp = "[a-zA-Z][a-zA-Z0-9_-]{3,30}", message = "Usernames must be between 3 and 30 characters, and may contain only letters and numbers")
    private String username;

    @NotNull
    @Pattern(regexp = "(\\S){3,20}", message = "Password must have 3-20 characters")
    private String password;

    public LoginForm() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
