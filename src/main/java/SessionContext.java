import java.util.ArrayList;
import java.util.List;

public class SessionContext {
    List<UserDTO> users = new ArrayList<>();

    public SessionContext() {
        users.add(new UserDTO("bob", "bob"));
        users.add(new UserDTO("john", "john"));
    }
}
