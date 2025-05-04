//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TweetBoard board = new TweetBoard();

        board.addTweet(1, 101, "User 1 - Hello this is aditya this is my first tweet!");
        board.addTweet(2, 102, "User 2 - Good morning aditya this is my first tweet i am ram!");
        board.addTweet(1, 103, "User 1 - nice tweet ram");
        board.addTweet(3, 104, "User 3 - Hey there!");

        board.follow(1, 2);
        board.follow(1, 3);
        board.unfollow(1, 2);
        board.getTweet();

    }
}