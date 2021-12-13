import com.fasterxml.jackson.databind.ObjectMapper;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;

public class Another {

    public static void main(String[] args) {

        String serverUrl = "http://localhost:8080/auth/";
        String realm = "demo";
        // idm-client needs to allow "Direct Access Grants: Resource Owner Password Credentials Grant"
        String clientId = "study-keycloak";
        String clientSecret = "admin";
        ObjectMapper mapper = new ObjectMapper();

        Keycloak keycloak = KeycloakBuilder.builder() //
                .serverUrl(serverUrl) //
                .realm(realm) //
                .grantType(OAuth2Constants.PASSWORD) //
                .clientId(clientId) //
                .clientSecret(clientSecret) //
                .username("danilo") //
                .password("trinker")
                .build();

    }
}
