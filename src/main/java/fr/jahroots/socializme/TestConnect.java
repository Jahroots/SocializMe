package fr.jahroots.socializme;

import java.util.Collections;
import java.util.List;

import org.springframework.social.facebook.FacebookTemplate;
import org.springframework.social.twitter.Tweet;
import org.springframework.social.twitter.TwitterTemplate;

public class TestConnect {

    private static final String USERNAME = "Jahroots972";

	public static void main(String[] args) {
        final TwitterTemplate twitterTemplate = new TwitterTemplate();
        final List<String> friends = twitterTemplate.getFriends(USERNAME);
        Collections.sort(friends);
        System.out.println(USERNAME + " got " + friends.size() + " friends:");
        for (String friend : friends) {
          System.out.println("\t - " + friend);
        }
        
        final List<String> followers = twitterTemplate.getFollowers(USERNAME);
        Collections.sort(followers);
        System.out.println(USERNAME + " got " + friends.size() + " followers:");
        for (String follower : followers) {
          System.out.println("\t - " + follower);
        }
    }
}
