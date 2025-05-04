public class Tweet {
    private int id;
    private int tweetId;
    private String news;

    public Tweet(int id, int tweetId, String news) {
        this.id = id;
        this.tweetId = tweetId;
        this.news = news;
    }

    public int getId() { return id; }
    public int getTweetId() { return tweetId; }
    public String getNews() { return news; }
}
