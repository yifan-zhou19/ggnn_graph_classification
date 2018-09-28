package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] str = new int[31];
		int n;
		int m = 0;
		int i;
		int k = 0;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str[30] = 1;
		for (i = 0;i < n;i++)
		{
			for (int j = 30;j >= 0;j--)
			{
				l = 2 * str[j] + m;
				str[j] = l % 10;
				m = l / 10;
			}
		}
		while (str[k] == 0)
		{
			k++;
		}
		for (i = k;i < 31;i++)
		{
			System.out.print(str[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

