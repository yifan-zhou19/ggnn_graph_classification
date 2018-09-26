package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1;t <= n;t++)
		{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n1;
		int n2;
		int n3;
		int i;
		int j;
		int k = 0;
		n1 = a.length(),n2 = b.length(),n3 = a.length();
		for (i = n1 - 1,j = n2 - 1;i >= 0;i--,j--)
		{
			if (j >= 0)
			{
				if (a.charAt(i) - k >= b.charAt(j))
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - b.charAt(j) - k + 48);
					k = 0;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + 10 - b.charAt(j) - k + 48);
					k = 1;
				}
			}
			else
			{
				if (a.charAt(i) - 48 >= k)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - k);
					k = 0;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, 10 + a.charAt(i) - k);
					k = 1;
				}
			}
		}
		if (c.charAt(0) != '0')
		{
			System.out.print(c.charAt(0));
		}
		for (i = 1;i < n1 - 1;i++)
		{
			System.out.print(c.charAt(i));
		}
		System.out.print(c.charAt(n1 - 1));
		System.out.print("\n");
		}
		return 0;
	}

}

