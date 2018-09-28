package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int times = 0;
	public static int[] ex = new int[100];

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print('1');
			return 0;
		}
		for (i = 0; i != 100; i++)
		{
			if (i == 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '1');
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
		} //???a???1
		for (i = 1; i != n + 1; i++)
		{
			for (j = 0; j != i; j++)
			{
				if (a.charAt(j) <= '4')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') * 2 + '0');
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') * 2 + '0' - 10);
					ex[j + 1] = 1;
				}
			}
			for (k = 0; k != n; k++)
			{
				if (ex[k] == 1)
				{
					a.charAt(k)++;
					ex[k] = 0;
				}
			}
		}
		for (i = n - 1; i != -1; i--)
		{
			if (a.charAt(i) == '0' && times == 0)
			{
				continue;
			}
			else
			{
				System.out.print(a.charAt(i));
				times++;
			}
		}
		System.out.print("\n");

		return 0;
	}

}

