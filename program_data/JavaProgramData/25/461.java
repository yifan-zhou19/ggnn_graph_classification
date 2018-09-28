package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String str = new String(new char[102]);
		str = tangible.StringFunctions.changeCharacter(str, 1, '1');
		for (int i = 2; i < 102; i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '0');
		}
		int[] num = new int[102];
		for (int i = 1; i < 102; i++)
		{
			num[i] = str.charAt(i) - '0';
		}
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= 101; j++)
			{
				num[j] *= 2;
			}
			for (int j = 1; j <= 101; j++)
			{
				if (num[j] >= 10)
				{
					 num[j] = num[j] - 10;
					 num[j + 1]++;
				}
			}
		}
		int j = 101;
		while (num[j] == 0)
		{
			  j--;
		}
		for (; j >= 1; j--)
		{
			System.out.print(num[j]);
		}
		System.out.print("\n");
		return 0;
	}

}

