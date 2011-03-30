package fr.jahroots.socializme;

import java.util.List;

import org.springframework.social.twitter.TwitterTemplate;

public class TestConnect {

    public static void main(String[] args) {
        final TwitterTemplate twitterTemplate = new TwitterTemplate();
        final List<String> friends = twitterTemplate.getFriends("chariotsolution");

        for (String friend : friends) {
          System.out.println("Friend: " + friend);
        }
    }
}
