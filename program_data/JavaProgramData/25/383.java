package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] ans = new int[100];
		int flag = 0;
		ans[0] = 1;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < 100;i++)
			{
				ans[i] = ans[i] * 2 + flag;
				if (ans[i] >= 10)
				{
					flag = 1;
					ans[i] = ans[i] % 10;
				}
				else
				{
					flag = 0;
				}
			}
		}
		for (i = 99;i >= 0;i--)
		{
			if (ans[i] != 0)
			{
				break;
			}
		}
		for (j = i;j >= 0;j--)
		{
			System.out.print(ans[j]);
		}
		System.out.print("\n");
		return 0;
	}
}

