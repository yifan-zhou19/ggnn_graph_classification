package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int n;
		int l;
		int i;
		int k;
		int jin;
		for (i = 0; i < 100; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		a = tangible.StringFunctions.changeCharacter(a, 0, '1');
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
		}
		else
		{
			for (i = 0; i < n; i++)
			{
				jin = 0;
				for (int j = 0; j < 99; j++)
				{
					k = a.charAt(j) - '0';
					k = k * 2 + jin;
					jin = k / 10;
					k = k % 10;
					a = tangible.StringFunctions.changeCharacter(a, j, '0' + k);
				}
			}
			l = 99;
			while (a.charAt(l) == '0')
			{
				l--;
			}
			for (i = l; i > -1; i--)
			{
				System.out.print(a.charAt(i));
			}
		}
		return 0;
	}

}

