package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int flag;
		int t;
		int ans;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ans = 0;
		for (i = 1;i <= num;i++)
		{
			flag = 0;
			if (i % 7 == 0)
			{
				flag = 1;
			}
			else
			{
				t = i;
				while (t >= 1)
				{
					if (t % 10 == 7)
					{
						flag = 1;
					}
					t = t / 10;
				}
			}
			if (flag == 0)
			{
				ans = ans + i * i;
			}
		}
		System.out.print(ans);
		return 0;
	}
}

