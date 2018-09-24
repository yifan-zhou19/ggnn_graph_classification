package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[10002]);
	public static int[] b = new int[10001];

	public static int Main()
	{
		int N;
		int i;
		int j;
		int k;
		int t;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N == 0)
		{
			System.out.print(1);
			return 0;
		}
		for (i = 0; i < 10000; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		a = tangible.StringFunctions.changeCharacter(a, i, '2');
		for (i = 1; i < N; i++)
		{
			k = 10000;
			for (t = 0; t < 10001; t++)
			{
				b[t] = 0;
			}
			for (j = 0; j < 10001; j++)
			{
				if (a.charAt(j) != '0')
				{
					break;
				}
			}
			while (k >= j)
			{
				if ((a.charAt(k) - '0') * 2 + b[k] < 10)
				{
					a = tangible.StringFunctions.changeCharacter(a, k, (a.charAt(k) - '0') * 2 + b[k] + 48);
				}
				else
				{
					b[k - 1] = 1;
					if (k == j)
					{
						a = tangible.StringFunctions.changeCharacter(a, k - 1, b[k - 1] + 48);
					}
					a = tangible.StringFunctions.changeCharacter(a, k, (a.charAt(k) - '0') * 2 + 38 + b[k]);
				}
				k--;
			}
		}
		for (i = 0; i < 10001; i++)
		{
			if (a.charAt(i) != '0')
			{
				break;
			}
		}
		for (j = i; j < 10001; j++)
		{
			System.out.print(a.charAt(j));
		}
		return 0;
	}
}

