package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		String ans = new String(new char[101]);
		int[] left = new int[101]; //???????????
		int n = 0; //t??????????
		int i;
		int t = 0;
		while ((c = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			t = 0;
			n = c.length();
			for (i = 0; i < n; i++)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, i, ' ');
				if (c.charAt(i) == '(')
				{
					left[t++] = i;
				}
				if (c.charAt(i) == ')')
				{
					if (t == 0)
					{
						ans = tangible.StringFunctions.changeCharacter(ans, i, '?');
					}
					else
					{
						t--;
					}
				}
			}
			for (i = 0; i < t; i++)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, left[i], '$');
			}
			ans = tangible.StringFunctions.changeCharacter(ans, n, '\0');
			System.out.print(c);
			System.out.print("\n");
			System.out.print(ans);
			System.out.print("\n");
		}
	}
}

