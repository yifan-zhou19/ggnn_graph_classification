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
		x = x - 1; //??????eof
		for (int i = x;i > 0;i--) //????????
		{
			if (a.charAt(i) == 32)
			{
				for (int j = i + 1;j < x;j++)
				{
					System.out.print(a.charAt(j));
				}
				System.out.print(" ");
				x = i;
			}
		}
		for (int j = 0;j < x;j++) //??????
		{
			System.out.print(a.charAt(j));
		}

		return 0;
	}
}

