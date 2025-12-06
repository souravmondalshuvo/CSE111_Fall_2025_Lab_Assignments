//HomeWorkTask04

public class ConnectFriends {
    
    public String name;
    public int request_limit = 2;
    public int request_count;
    public String[] request_sent;

    public ConnectFriends(String name) {
        this.name = name;
        this.request_sent = new String[this.request_limit];
        System.out.println("Welcome to ConnectFriends, " + this.name);
    }

    public ConnectFriends(String name, int request_limit) {
        this.name = name;
        this.request_limit = request_limit;
        this.request_sent = new String[this.request_limit];
        System.out.println("Welcome to ConnectFriends, " + this.name);
    }

    public void sendFriendRequest(ConnectFriends friends) {

        if(this.request_count < this.request_limit) {
            this.request_sent[this.request_count] = friends.name;
            this.request_count++;
            System.out.println(this.name + " sent a friend request to " + friends.name + ".");
        } else {
            System.out.println(this.name + " has reached the friend request limit!");
        }
    }

    public void sendFriendRequest(ConnectFriends friends_1, ConnectFriends friends_2) {
        sendFriendRequest(friends_1);
        sendFriendRequest(friends_2);
    }

    public void removeRequest(String name) {
        
        boolean exist = false;

        for(int i = 0; i < this.request_count; i++) {
            if(this.request_sent[i].equals(name)) {
                for(int j = 0; j < this.request_count - 1; j++) {
                    this.request_sent[j] = this.request_sent[j + 1];
                }

                this.request_sent[this.request_count - 1] = null;
                this.request_count--;
                System.out.println("Request to add " + name + " is removed for " + this.name + ".");
                exist = true;
                break;
            }
        }

        if(!exist) {
            System.out.println(name + " is not in " + this.name + "'s sent request list.");
        }
    }

    public void showDetails() {
        System.out.println("User name: " + this.name);
        System.out.println("Maximum number of Sent Friend Request: " + this.request_limit);
        System.out.println("Total Friends Request: " + this.request_count);
        System.out.print("Sent Friends Request: ");
        for(int i = 0; i < request_count; i++) {
            System.out.print(this.request_sent[i] + " ");
        }
        System.out.println();
    }
}