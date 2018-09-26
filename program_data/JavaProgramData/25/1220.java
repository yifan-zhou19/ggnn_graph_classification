package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n > 0)
		{
		p = Math.ceil(Math.log10(2) * n);
		String a = new String(new char[p]);
		for (int i = 0;i < p;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		a = tangible.StringFunctions.changeCharacter(a, p - 1, '1');
		for (int i = 1;i <= n;i++)
		{
			for (int j = 0;j < p;j++)
			{
				if (a.charAt(j) < '5')
				{
				a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') * 2 + '0');
				}
				else if (a.charAt(j) >= '5')
				{
				a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') * 2 - 10 + '0');
					a.charAt(j - 1)++;
				}
			}
		}
		for (int i = 0;i < p;i++)
		{
		System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		}
		if (n == 0)
		{
		System.out.print(1);
		System.out.print("\n");
		}
		return 0;
	}

}

