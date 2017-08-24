import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class TestRest {
	
	@Test
	public void testRest(){
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, Object> multiMap = new LinkedMultiValueMap<String, Object>(5);

        // 增加请求头
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "oauth2 " + "1bJAR49kj58Uain18gt3k0gw");

        HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<MultiValueMap<String, Object>>(multiMap, headers);
        String body = restTemplate.exchange("http://172.19.105.53:8080/auth2/authc/captcha/get", HttpMethod.GET, entity, String.class).getBody();
        System.out.println("body = "+body);
	}

}
