package iths.helena;

import org.springframework.web.client.RestTemplate;

public class ClientConnect {

    public static void main(String[] args) {
        getEmployees();
    }

    private static void getEmployees(){
        final String uri = "http://restlabb-env.rntvyhfjkd.eu-north-1.elasticbeanstalk.com/employees/";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }

}
