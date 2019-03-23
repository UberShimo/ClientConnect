package iths.helena;

import org.springframework.web.client.RestTemplate;

public class ClientConnect {
    public static void main(String[] args) {
        getSongs();
    }

    private static void getSongs(){
        final String url = "https://simon-herokuserver.herokuapp.com/songs";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        System.out.println(result);
    }
}
