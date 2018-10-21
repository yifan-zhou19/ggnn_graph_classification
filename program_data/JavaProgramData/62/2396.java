package <missing>;

public class GlobalMembers
{
	/*??? 1200012866 11.2*/
	public static int Main()
	{
		char f;
		String a = new String(new char[100]);
		int x = 0;
		while ((f = System.in.read()) != EOF)
		{ //??
			a = tangible.StringFunctions.changeCharacter(a, x, f);
			x++;
		}
		x = x - 1; //????
		for (int i = 0;i <= x;i++)
		{ //????????
			if (a.charAt(i) == 32)
			{
				if (a.charAt(i + 1) == ' ')
				{
					continue;
				}
			}
			System.out.print(a.charAt(i));
		}

		return 0;
	}
}

