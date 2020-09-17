package dto;

public class UserDto {
    private final String userName;

    public UserDto(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
