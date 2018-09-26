package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000000]);
		int N;
		int i;
		int j;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 1000000;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		a = tangible.StringFunctions.changeCharacter(a, 0, '2');
		int count = 1;
		if (N == 0)
		{
			System.out.print(1);
		}
		else
		{
			for (i = 0;i < N - 1;i++)
			{
				for (j = 0;j < 1000000;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') * 2);
				}
				for (j = 0;j < 1000000;j++)
				{
					if (a.charAt(j) > 9)
					{
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - 10 + '0');
						a.charAt(j + 1)++;
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + '0');
					}
				}
			}
			int first = 0;
			for (i = 999999;i >= 0;i--)
			{
				if (a.charAt(i) != '0' || first == 1)
				{
					first = 1;
					System.out.print(a.charAt(i));
				}
			}
		}
		return 0;
	}

}

