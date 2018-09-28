package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //?????????
		int j;
		int n;
		int[] num = new int[1000];
		int sum = 0;
		int[][] g = new int[1001][2];
		char[][] s = new char[1001][2];
		for (i = 1;i < 1001;i++) //?????????????
		{
			n = i;
			g[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(s[i][0]);
			if (s[i][0] == '\n')
			{
				break;
			}
		}
		for (i = 1;i <= n;i++) //??????
		{
			g[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(s[i][1]);
			if (s[i][1] == '\n')
			{
				break;
			}
		}
		System.out.print(n);
		System.out.print(" ");
		for (i = 0;i < 1000;i++) //???????????
		{
			for (j = 1;j <= n;j++)
			{
				if (g[j][0] <= i != 0 && g[j][1]> i)
				{
					num[i] = num[i] + 1;
				}
			}
		}
		for (i = 0;i < 1000;i++) //????????
		{
			if (sum <= num[i])
			{
				sum = num[i];
			}
		}
		System.out.print(sum);

		return 0;
	}



}

