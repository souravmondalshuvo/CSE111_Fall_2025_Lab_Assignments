//HomeWorkTask01

public class Player {

    public String name;
    public int health_point;
    public String[] defeated_villain = new String[5];
    public int defeated_villain_count;

    public Player(String name) {
        this.name = name;
        this.health_point = 100;

        System.out.println(name + " joined the game");
        System.out.println("HP: " + health_point);
    }

    public Player(String name, int health_point) {
        this.name = name;
        this.health_point = health_point;

        System.out.println(name + " joined the game");
        System.out.println("HP: " + health_point);
    }

    public void viewInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Current HP: " + health_point);

        if(defeated_villain_count > 0) {
            System.out.println("Defeated: ");
            for(int i = 0; i < defeated_villain_count; i++) {
                System.out.print(defeated_villain[i] + ", ");
            }
            System.out.println();
        }
    }

    public void defeatVillain(String villain_name, int villain_health_point) {
        if(this.health_point >= villain_health_point) {
            System.out.println("defeated " + villain_name);
            defeated_villain[defeated_villain_count++] = villain_name;
            this.health_point += villain_health_point;
        } else {
            System.out.println("failed to defeat " + villain_name);
        }
    }

    public void defeatVillain(char boost, String villain_name, int villain_health_point) {
        int power_boost = boost - '0';
        int boosted_health_point = this.health_point * power_boost;
        System.out.println("HP with " + boost + "x boost: " + boosted_health_point);

        if(boosted_health_point >= villain_health_point) {
            System.out.println("defeated " + villain_name);
            defeated_villain[defeated_villain_count++] = villain_name;
            this.health_point += villain_health_point + boosted_health_point - this.health_point;
        } else {
            System.out.println("failed to defeat " + villain_name);
        }
    }

    public void defeatVillain(Player another_player) {
        if(this.health_point >= another_player.health_point) {
            System.out.println("defeated " + another_player.name);
            defeated_villain[defeated_villain_count++] = another_player.name;
            this.health_point += another_player.health_point;
        } else {
            System.out.println("failed to defeat " + another_player.name);
        }
    }
}