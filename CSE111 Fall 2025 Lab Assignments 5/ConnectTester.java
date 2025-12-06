/* 
Task 4

Design the ConnectFriends class with the necessary properties so that the provided driver code generates the output given below. 

Driver Code
public class ConnectTester{
  public static void main(String[] args) {
    ConnectFriends sanaf = new ConnectFriends("Sanaf");
    System.out.println("=======1=======");
    ConnectFriends mantasha = new ConnectFriends("Mantasha", 3);
    ConnectFriends mostafiz = new ConnectFriends("Mostafiz");
    ConnectFriends matt = new ConnectFriends("Matt", 4);
    System.out.println("=======2=======");
    sanaf.sendFriendRequest(mantasha);
    System.out.println("=======3=======");
    sanaf.sendFriendRequest(mostafiz, matt);
    System.out.println("=======4=======");
    sanaf.showDetails();
    System.out.println("=======5=======");
    sanaf.removeRequest("Mantasha");
    System.out.println("=======6=======");
    sanaf.showDetails();
    System.out.println("=======7=======");
    sanaf.removeRequest("Murdock");
    System.out.println("=======8=======");
    sanaf.removeRequest("Matt");
    sanaf.removeRequest("Mostafiz");
    sanaf.showDetails();
    System.out.println("=======9=======");
    mantasha.showDetails();
  }
}

Output
Welcome to ConnectFriends, Sanaf
=======1=======
Welcome to ConnectFriends, Mantasha
Welcome to ConnectFriends, Mostafiz
Welcome to ConnectFriends, Matt
=======2=======
Sanaf sent a friend request to Mantasha.
=======3=======
Sanaf sent a friend request to Mostafiz.
Sanaf has reached the friend request limit!
=======4=======
User Name: Sanaf
Maximum number of Sent Friend Request: 2
Total Friends Request: 2
Sent Friends Request: Mantasha Mostafiz 
=======5=======
Reuqest to add Mantasha is removed for Sanaf.
=======6=======
User Name: Sanaf
Maximum number of Sent Friend Request: 2
Total Friends Request: 1
Sent Friends Request: Mostafiz 
=======7=======
Murdock is not in Sanaf's sent request list.
=======8=======
Matt is not in Sanaf's sent request list.
Reuqest to add Mostafiz is removed for Sanaf.
User Name: Sanaf
Maximum number of Sent Friend Request: 2
Total Friends Request: 0
Sent Friends Request: 
=======9=======
User Name: Mantasha
Maximum number of Sent Friend Request: 3
Total Friends Request: 0
Sent Friends Request:
*/

public class ConnectTester {
    public static void main(String[] args) {
        ConnectFriends sanaf = new ConnectFriends("Sanaf");
        System.out.println("=======1=======");
        ConnectFriends mantasha = new ConnectFriends("Mantasha", 3);
        ConnectFriends mostafiz = new ConnectFriends("Mostafiz");
        ConnectFriends matt = new ConnectFriends("Matt", 4);
        System.out.println("=======2=======");
        sanaf.sendFriendRequest(mantasha);
        System.out.println("=======3=======");
        sanaf.sendFriendRequest(mostafiz, matt);
        System.out.println("=======4=======");
        sanaf.showDetails();
        System.out.println("=======5=======");
        sanaf.removeRequest("Mantasha");
        System.out.println("=======6=======");
        sanaf.showDetails();
        System.out.println("=======7=======");
        sanaf.removeRequest("Murdock");
        System.out.println("=======8=======");
        sanaf.removeRequest("Matt");
        sanaf.removeRequest("Mostafiz");
        sanaf.showDetails();
        System.out.println("=======9=======");
        mantasha.showDetails();
    }
}