package <missing>;

public class GlobalMembers
{
	public static final String c = "\0";
	public static final String temp = "\0";
	public static int deal()
	{
		int i;
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if ((c.charAt(i) >= 'a') && (c.charAt(i) <= 'z'))
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'a'+'A');
			}
		}
		return 0;
	}
	public static int deal1()
	{
		int i;
		char word = c.charAt(0);
		int[] times = new int[1001];
		int l = 0;
		temp = tangible.StringFunctions.changeCharacter(temp, 0, word);
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) == word)
			{
				times[l]++;
			}
			else
			{
				l++;
				times[l] = 1;
				temp = tangible.StringFunctions.changeCharacter(temp, l, c.charAt(i));
				word = temp.charAt(l);
			}
		}
		for (i = 0;times[i] != 0;i++)
		{
			System.out.print('(');
			System.out.print(temp.charAt(i));
			System.out.print(',');
			System.out.print(times[i]);
			System.out.print(')');
		}
		System.out.print("\n");
		return 0;
	}
	public static int Main()
	{
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		deal();
		deal1();
		return 0;
	}
}

