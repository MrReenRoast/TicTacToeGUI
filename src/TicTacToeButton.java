import javax.swing.*;
import java.awt.*;

public class TicTacToeButton extends JButton {
    private int row, col;

    public TicTacToeButton(int row, int col) {
        this.row = row;
        this.col = col;
        setFont(new Font("Arial", Font.PLAIN, 40));
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
