package Main;
import javax.swing.JFrame;
public class Main {
    public static void main(String[]args) {
        JFrame window = new JFrame("Chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // Add Gamepanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();
    }
}
//hatalar


//3- kale,fil ,queen butun taslari bir anda tum taslari sutundaki e satirdaki aliyor orayi duzelt, ilk rakip tasta durmasi lazim

