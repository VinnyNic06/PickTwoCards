// gui based version of chapter 7 project

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PickTwoCardsGui extends JFrame implements ActionListener
{

	// gui components for this class
	Font mainFont = new Font("Verdana", Font.BOLD, 32);
	Color myColor = new Color(93, 245, 66);
	JLabel mainTitle = new JLabel("Pick Two Cards");
	JLabel comLabel = new JLabel("Computer's card is: ");
	JLabel comResult = new JLabel("");
	JLabel playerLabel = new JLabel("Player's card is: ");
	JLabel playerResult = new JLabel("");
	JLabel endResult = new JLabel("");
	JButton button = new JButton("Draw Cards");

	// constructor method for this class
	public PickTwoCardsGui()
	{
		// use the JFrame constructor to construct an object from this class
		super("Two Cards Gui");
		setBounds(600, 380, 315, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		// customize and then add the GUI components to the frame
		getContentPane().setBackground(myColor);
		mainTitle.setFont(mainFont);
		button.setForeground(Color.RED);

		add(mainTitle);
		add(comLabel);
		add(comResult);
		add(playerLabel);
		add(playerResult);
		add(endResult);
		add(button);

		// add the event listener to the button
		button.addActionListener(this);
	}

	// event handler method for the click event
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// call the play game method
		playGame();
	}

	public void playGame()
	{
		// variables and constants
		final int CARDS_IN_SUIT = 13;
		int comValue;
		int userValue;
		String msg;
		Card comCard = new Card();
		Card userCard = new Card();
		// calculation phase
		comValue = ((int)(Math.random() * CARDS_IN_SUIT + 1));
		userValue = ((int)(Math.random() * CARDS_IN_SUIT + 1));

		comCard.setValue(comValue);
		userCard.setValue(userValue);

        String[] cardSuits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		comCard.setSuit(cardSuits[(int)Math.random() * 4]);
		userCard.setSuit(cardSuits[(int)Math.random() * 4]);
        
        
		if(comCard.getValue() > userCard.getValue())
		{
			msg = "Sorry, the Computer has won.";
		}
		else
		{
			if(comCard.getValue() < userCard.getValue())
			{
				msg = "Congratulations, you win!";
			}
			else
			{
				msg = "We have a tie!";
			}
		}
		// Output phase
		comResult.setText(comCard.getRank() + " of " + comCard.getSuit());
		playerResult.setText(userCard.getRank() + " of " + userCard.getSuit());
		endResult.setText(msg);
	}

	public static void main(String[] args)
	{
		PickTwoCardsGui frame1 = new PickTwoCardsGui();
		frame1.setVisible(true);
	}
}