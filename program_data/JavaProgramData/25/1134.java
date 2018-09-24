package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = tangible.StringFunctions.changeCharacter(a, 0, '1');
		int flag = 0;
		int n;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			for (int j = m; j >= 0; j--)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') + (a.charAt(j) - '0') + '0' + flag);
				if (a.charAt(j) > '9')
				{
					flag = 1;
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - 10);
				}
				else
				{
					flag = 0;
				}
			}
			if (flag == 1)
			{
				for (int k = m + 1; k > 0; k--)
				{
					a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k - 1));
				}
				a = tangible.StringFunctions.changeCharacter(a, 0, '1');
				flag = 0;
				m++;
			}
		}
		for (int l = 0; l <= m; l++)
		{
			System.out.print(a.charAt(l));
		}
		return 0;
	}
}

