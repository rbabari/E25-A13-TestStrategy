import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Robot robot1 = new Robot("Walle");
        Robot robot2 = new Robot("Optimus");

        robot1.setBehaviour(new AgressifBehaviour());
        robot1.move();

        robot2.setBehaviour(new AgressifBehaviour());
        robot2.move();
        robot2.setBehaviour(new NormalBehaviour());
        robot2.move();



        }
    }
