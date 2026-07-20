class Twitter {

    private int timestamp;

    private Map<Integer, Set<Integer>> followMap;
    private Map<Integer, List<Tweet>> tweetMap;

    public Twitter() {
        timestamp = 0;
        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {

        tweetMap.putIfAbsent(userId, new ArrayList<>());

        tweetMap.get(userId).add(
            new Tweet(tweetId, timestamp++)
        );
    }

    public List<Integer> getNewsFeed(int userId) {

        List<Integer> result = new ArrayList<>();

        followMap.putIfAbsent(userId, new HashSet<>());
        followMap.get(userId).add(userId);

        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> b.time - a.time
        );

        for (int followee : followMap.get(userId)) {

            List<Tweet> tweets = tweetMap.get(followee);

            if (tweets != null && !tweets.isEmpty()) {

                int index = tweets.size() - 1;

                Tweet tweet = tweets.get(index);

                pq.offer(
                    new Node(
                        tweet.tweetId,
                        tweet.time,
                        followee,
                        index
                    )
                );
            }
        }

        while (!pq.isEmpty() && result.size() < 10) {

            Node curr = pq.poll();

            result.add(curr.tweetId);

            int nextIndex = curr.index - 1;

            if (nextIndex >= 0) {

                Tweet nextTweet =
                    tweetMap.get(curr.userId).get(nextIndex);

                pq.offer(
                    new Node(
                        nextTweet.tweetId,
                        nextTweet.time,
                        curr.userId,
                        nextIndex
                    )
                );
            }
        }

        return result;
    }

    public void follow(int followerId, int followeeId) {

        followMap.putIfAbsent(
            followerId,
            new HashSet<>()
        );

        followMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {

        if (followMap.containsKey(followerId)
                && followerId != followeeId) {

            followMap.get(followerId)
                     .remove(followeeId);
        }
    }

    class Tweet {

        int tweetId;
        int time;

        Tweet(int tweetId, int time) {
            this.tweetId = tweetId;
            this.time = time;
        }
    }

    class Node {

        int tweetId;
        int time;
        int userId;
        int index;

        Node(
            int tweetId,
            int time,
            int userId,
            int index
        ) {
            this.tweetId = tweetId;
            this.time = time;
            this.userId = userId;
            this.index = index;
        }
    }
}