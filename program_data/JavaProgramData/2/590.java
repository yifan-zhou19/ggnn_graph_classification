package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] book = new int[1000];
		int i;
		int j;
		int[] countt = new int[26];
		int len;
		int max = -1;
		int maxauthor;
		char[][] peo = new char[1000][27];
		final String sum = "\0";
		char ch;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			book[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			peo[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			sum += peo[i];
		}
		len = sum.length();
		for (i = 0;i < len;i++)
		{
			countt[sum.charAt(i) - 65]++;
		}
		for (i = 0;i < 26;i++)
		{
			if (countt[i] > max)
			{
				max = countt[i];
				maxauthor = i;
			}
		}

		ch = maxauthor + 65;
		int p = 0;
		int t = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < String.valueOf(peo[i]).length();j++)
			{
				if (peo[i][j] == ch)
				{
					p++;
				}
			}
			if (p > 0)
			{
				book[i - t] = book[i];
			}
			else
			{
				t++;
			}
			p = 0;
		}
		System.out.print(ch);
		System.out.print("\n");
		System.out.print(n - t);
		System.out.print("\n");
		for (i = 1;i <= n - t;i++)
		{
			System.out.print(book[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

