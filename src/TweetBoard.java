import java.util.HashMap;
import java.util.List;
import java.util.*;

public class TweetBoard{
    HashMap<Integer, List<Tweet>> tweetList = new HashMap<>();
    HashMap<Integer, Set<Integer>> followMap = new HashMap<>();

    public void addTweet(int userId, int tweetId, String news) {
        Tweet newTweet = new Tweet(userId, tweetId, news);
        tweetList.putIfAbsent(userId, new ArrayList<>());
        tweetList.get(userId).add(newTweet);
    }
        //get top 10 tweets
    public void getTweet() {
        List<Tweet> allTweets = new ArrayList<>();

        for (List<Tweet> tweets : tweetList.values()) {
            allTweets.addAll(tweets);
        }

        int total = allTweets.size();
        int start = Math.max(0, total - 10);

        for (int i = start; i < total; i++) {
            Tweet t = allTweets.get(i);
            System.out.println("User ID: "+t.getId() + ", Tweet ID: "+t.getTweetId() + ", News: "+t.getNews());
        }
    }

    // Follow another user
    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return;
        followMap.putIfAbsent(followerId, new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }

    // Unfollow a user
    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId) return;
        Set<Integer> followees = followMap.get(followerId);
        if (followees != null) {
            followees.remove(followeeId);
        }
    }






}


