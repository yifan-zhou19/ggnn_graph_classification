package <missing>;

public class GlobalMembers
{
	//???


	public static int Main()
	{
		String a = new String(new char[1001]);
		char p = null;
		a = tangible.StringFunctions.changeCharacter(a, 0, '2');
		int n;
		int i;
		int j;
		int k = 0;
		int k1 = 0;
		for (i = 1; i < 1001; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
		for (i = 1; i < n; i++)
		{
			for (j = 0; j < 1001; j++)
			{
				k1 = ((a.charAt(j) - '0') * 2 + k) / 10;
				a = tangible.StringFunctions.changeCharacter(a, j, ((a.charAt(j) - '0') * 2 + k) % 10 + '0');
				k = k1;
			}
		}
		for (i = 1000; i >= 0; i--)
		{
			if (a.charAt(i) != '0')
			{
				break;
			}
		}
		for (; i >= 0; i--)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		}
		return 0;
	}
}

