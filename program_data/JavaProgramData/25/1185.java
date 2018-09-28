package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len = 1;
		int n;
		int[] ans = new int[50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ans[0] = 1;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < len; j++)
			{
				ans[j] = ans[j] * 2;
			}
			for (j = 0; j < len; j++)
			{
				if (ans[j] > 9)
				{
					ans[j] -= 10;
					ans[j + 1] += 1;
					if (j == len - 1)
					{
						len++;
						break;
					}
				}
			}
		}
		for (i = 0; i < len; i++)
		{
			System.out.print(ans[len - i - 1]);
		}
		return 0;
	}
}

