package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String c = new String(new char[1000]);
		int ls;
		int la;
		int lb;
		int i;
		int j;
		int pointer = 0;
		int t;
		int m = 0;
		int n = 0;
		cin.get(s,1000);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		ls = s.length();
		la = a.length();
		lb = b.length();
		for (i = 0;i < ls;i++)
		{
			int counter = 0;

				for (j = 0;j < la;j++)
				{
					if (s.charAt(i + j) == a.charAt(j))
					{
						counter++;
						continue;
					}
					else
					{
						break;
					}
				}
				if (counter == la && (s.charAt(i) == a.charAt(0) && (i == 0 || s.charAt(i - 1) == ' ')))
				{

					for (t = 0;t < lb;t++)
					{
						c = tangible.StringFunctions.changeCharacter(c, pointer, b.charAt(t));
						pointer++;

					}


					i = i + la - 1;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, pointer, s.charAt(i));
					pointer++;
				}

		}
		c = tangible.StringFunctions.changeCharacter(c, pointer, '\0');
		for (j = 0;j < pointer;j++)
		{
			System.out.print(c.charAt(j));
		}
		return 0;
	}
}

