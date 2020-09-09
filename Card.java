public class Card
{
	// data field variables for this class
	private String suit;
	private int value;
	private String rank;
	// mutator (setter) methods for this class
	public void setSuit(String s)
	{
		suit = s;
	}
	public void setValue(int v)
	{
		value = v;
		// set the rank data field based off the numeric value
		switch(value)
		{
			case 1:
			{
				rank ="Ace";
				break;
			}
			case 11:
			{
				rank ="Jack";
				break;
			}
			case 12:
			{
				rank = "Queen";
				break;
			}
			case 13:
			{
				rank = "King";
				break;
			}
			default:
			{
				rank = Integer.toString(value);
			}
		}
	}
	// accessor (getter) methods for this class
	public String getSuit()
	{
		return suit;
	}
	public int getValue()
	{
		return value;
	}
	public String getRank()
	{
		return rank;
	}
}