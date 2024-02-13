package test;
import static org.mockito.Mockito.mock;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import Collatz.src.NetworkAPI;
import Collatz.src.User;


public class NetworkAPITest {

    @Mock
    private NetworkAPI networkAPI;
    private User user;

    @Before
    public void setUp() {
        networkAPI = mock(NetworkAPI.class);
    }

    @Test
    public void testGetPath() {
        networkAPI.getPath(user);
    }

    @Test
    public void testGetDelimiter() {
        Mockito.when(networkAPI.getDelimeter(Mockito.any(User.class))).thenReturn(',');
    }

    @Test
    public void testSetOutputPath() {
       
    }
}
