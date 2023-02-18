import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    // Values which are being used in the heading to display stats
    private int XWIN = 0;
    private int OWIN = 0;
    private JLabel xWinCount;
    private JLabel oWinCount;
    private JLabel message;
    private boolean player;

    // Every button
    private JButton topLeft;
    private JButton topCenter;
    private JButton topRight;
    private JButton middleLeft;
    private JButton middleCenter;
    private JButton middleRight;
    private JButton bottomLeft;
    private JButton bottomCenter;
    private JButton bottomRight;


    public static void main(String[] args) {
        new Main();
    }

    //Create JFrame with BorderLayout and adjust the panels
    public Main() {
        player = true;
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,1280);
        frame.setResizable(true);
        frame.add(createHeading(), BorderLayout.NORTH);
        frame.add(createBorder(), BorderLayout.WEST);
        frame.add(createBorder(), BorderLayout.SOUTH);
        frame.add(createBorder(), BorderLayout.EAST);
        frame.add(createLayout(), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Create Game-Panel with GridLayout
    private JPanel createLayout() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 20, 20));
        panel.setBackground(Color.black);
        // Create ActionListener
        ActionListener action = createActionListener();

        // Create all buttons
        topLeft = createButton(action);
        topCenter = createButton(action);
        topRight = createButton(action);
        middleLeft = createButton(action);
        middleCenter = createButton(action);
        middleRight = createButton(action);
        bottomLeft = createButton(action);
        bottomCenter = createButton(action);
        bottomRight = createButton(action);

        // Add all buttons
        panel.add(topLeft);
        panel.add(topCenter);
        panel.add(topRight);
        panel.add(middleLeft);
        panel.add(middleCenter);
        panel.add(middleRight);
        panel.add(bottomLeft);
        panel.add(bottomCenter);
        panel.add(bottomRight);

        return panel;
    }

    // Creates empty button with preferred configuration
    private JButton createButton(ActionListener action) {

        JButton button = new JButton();
        button.addActionListener(action);
        button.setBackground(new Color(0x161616));
        button.setFocusable(false);
        button.setFocusPainted(false);
        button.setBorder(null);
        button.setText("");
        button.setForeground(Color.red);
        button.setFont(new Font("Roboto", Font.BOLD, 250));
        return button;
    }

    // Create the panel at the top to show game-stats
    private JPanel createHeading() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3));
        panel.setPreferredSize(new Dimension(100,100));
        panel.setBackground(Color.black);

        xWinCount = new JLabel("X won 0 games!");
        xWinCount.setForeground(Color.white);
        xWinCount.setFont(new Font("Roboto", Font.BOLD, 15));
        xWinCount.setHorizontalAlignment(JLabel.CENTER);
        message = new JLabel();
        message.setFont(new Font("Roboto", Font.BOLD, 15));
        message.setForeground(new Color(0xBB000E));
        message.setHorizontalAlignment(JLabel.CENTER);
        oWinCount = new JLabel("O won 0 games!");
        oWinCount.setForeground(Color.white);
        oWinCount.setFont(new Font("Roboto", Font.BOLD, 15));
        oWinCount.setHorizontalAlignment(JLabel.CENTER);

        panel.add(xWinCount);
        panel.add(message);
        panel.add(oWinCount);

        return panel;
    }

    // Method for creating invisible walls (to structure the overall layout)
    private JPanel createBorder() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,100));
        panel.setBackground(new Color(0x000000));
        return panel;
    }

    // Checks which button is selected and which player hit the button
    // Additionally checks if a game is won by any of the two players or if every field is already being used
    // => Creates the labels for the heading and resets the game
    private ActionListener createActionListener() {
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentPlayer;

                if (e.getSource().equals(topLeft)) {
                    if(topLeft.getText().equals("")) {
                        if (player) {
                            currentPlayer = "X";
                            topLeft.setForeground(new Color(0xBB000E));
                            player = false;
                        } else {
                            currentPlayer = "O";
                            topLeft.setForeground(Color.white);
                            player = true;
                        }
                        topLeft.setText(currentPlayer);
                    }
                } else if (e.getSource().equals(topCenter)) {
                    if(topCenter.getText().equals("")) {
                        if (player) {
                            currentPlayer = "X";
                            topCenter.setForeground(new Color(0xBB000E));
                            player = false;
                        } else {
                            currentPlayer = "O";
                            topCenter.setForeground(Color.white);
                            player = true;
                        }
                        topCenter.setText(currentPlayer);
                    }
                } else if (e.getSource().equals(topRight)) {
                    if(topRight.getText().equals("")) {
                        if (player) {
                            currentPlayer = "X";
                            topRight.setForeground(new Color(0xBB000E));
                            player = false;
                        } else {
                            currentPlayer = "O";
                            topRight.setForeground(Color.white);
                            player = true;
                        }
                        topRight.setText(currentPlayer);
                    }

                } else if (e.getSource().equals(middleLeft)) {
                    if(middleLeft.getText().equals("")) {
                        if (player) {
                            currentPlayer = "X";
                            middleLeft.setForeground(new Color(0xBB000E));
                            player = false;
                        } else {
                            currentPlayer = "O";
                            middleLeft.setForeground(Color.white);
                            player = true;
                        }
                        middleLeft.setText(currentPlayer);
                    }

                } else if (e.getSource().equals(middleCenter)) {
                    if(middleCenter.getText().equals("")) {
                        if (player) {
                            currentPlayer = "X";
                            middleCenter.setForeground(new Color(0xBB000E));
                            player = false;
                        } else {
                            currentPlayer = "O";
                            middleCenter.setForeground(Color.white);
                            player = true;
                        }
                        middleCenter.setText(currentPlayer);
                    }

                } else if (e.getSource().equals(middleRight)) {
                    if(middleRight.getText().equals("")) {
                        if (player) {
                            currentPlayer = "X";
                            middleRight.setForeground(new Color(0xBB000E));
                            player = false;
                        } else {
                            currentPlayer = "O";
                            middleRight.setForeground(Color.white);
                            player = true;
                        }
                        middleRight.setText(currentPlayer);
                    }

                } else if (e.getSource().equals(bottomLeft)) {
                    if(bottomLeft.getText().equals("")) {
                        if (player) {
                            currentPlayer = "X";
                            bottomLeft.setForeground(new Color(0xBB000E));
                            player = false;
                        } else {
                            currentPlayer = "O";
                            bottomLeft.setForeground(Color.white);
                            player = true;
                        }
                        bottomLeft.setText(currentPlayer);
                    }

                } else if (e.getSource().equals(bottomCenter)) {
                    if(bottomCenter.getText().equals("")) {
                        if (player) {
                            currentPlayer = "X";
                            bottomCenter.setForeground(new Color(0xBB000E));
                            player = false;
                        } else {
                            currentPlayer = "O";
                            bottomCenter.setForeground(Color.white);
                            player = true;
                        }
                        bottomCenter.setText(currentPlayer);
                    }

                } else if (e.getSource().equals(bottomRight)) {
                    if(bottomRight.getText().equals("")) {
                        if (player) {
                            currentPlayer = "X";
                            bottomRight.setForeground(new Color(0xBB000E));
                            player = false;
                        } else {
                            currentPlayer = "O";
                            bottomRight.setForeground(Color.white);
                            player = true;
                        }
                        bottomRight.setText(currentPlayer);
                    }
                }

                if(checkWin("X")) {
                    XWIN++;
                    if (XWIN == 1) {
                        xWinCount.setText("X won " + XWIN + " game!");
                    } else {
                        xWinCount.setText("X won " + XWIN + " games!");
                    }

                    message.setText("Player X won the game");
                    resetFields();

                } else if(checkWin("O")) {
                    OWIN++;
                    if (OWIN == 1) {
                        oWinCount.setText("O won " + OWIN + " game!");
                    } else {
                        oWinCount.setText("O won " + OWIN + " games!");
                    }
                    message.setText("Player O won the game");
                    resetFields();
                } else if(checkAllTaken()) {
                    message.setText("Draw");
                    resetFields();
                }


            }
        };
        return action;
    }

    // Checks if "player" won the game
    private boolean checkWin(String player) {

        if (topLeft.getText().equals(player) && topCenter.getText().equals(player) && topRight.getText().equals(player)) {
            return true;
        }

        if (middleLeft.getText().equals(player) && middleCenter.getText().equals(player) && middleRight.getText().equals(player)) {
            return true;
        }

        if (bottomLeft.getText().equals(player) && bottomCenter.getText().equals(player) && bottomRight.getText().equals(player)) {
            return true;
        }

        if (topLeft.getText().equals(player) && middleLeft.getText().equals(player) && bottomLeft.getText().equals(player)) {
            return true;
        }

        if (topCenter.getText().equals(player) && middleCenter.getText().equals(player) && bottomCenter.getText().equals(player)) {
            return true;
        }

        if (topRight.getText().equals(player) && middleRight.getText().equals(player) && bottomRight.getText().equals(player)) {
            return true;
        }

        if (topRight.getText().equals(player) && middleCenter.getText().equals(player) && bottomLeft.getText().equals(player)) {
            return true;
        }

        if (topLeft.getText().equals(player) && middleCenter.getText().equals(player) && bottomRight.getText().equals(player)) {
            return true;
        }

        return false;
    }

    // Check if every field is already being used
    private boolean checkAllTaken() {
        if (!(topLeft.getText().isEmpty() || topCenter.getText().isEmpty() || topRight.getText().isEmpty() || middleLeft.getText().isEmpty() || middleCenter.getText().isEmpty() ||
            middleRight.getText().isEmpty() || bottomLeft.getText().isEmpty() || bottomCenter.getText().isEmpty() || bottomRight.getText().isEmpty())) {

            return true;
    }
        return false;
    }

    // Resets all fields
    private void resetFields() {
        topLeft.setText("");
        topCenter.setText("");
        topRight.setText("");
        bottomLeft.setText("");
        bottomCenter.setText("");
        bottomRight.setText("");
        middleLeft.setText("");
        middleCenter.setText("");
        middleRight.setText("");
    }
}
