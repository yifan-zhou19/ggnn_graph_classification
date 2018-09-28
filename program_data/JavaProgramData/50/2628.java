package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ans = (n + 12) % 7;
		if (ans == 5)
		{
			System.out.print("1\n");
		}
		for (int i = 1;i <= 11;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				ans = (ans + 31) % 7;
			}
			else if (i == 2)
			{
				ans = (ans + 28) % 7;
			}
			else
			{
				ans = (ans + 30) % 7;
			}
			if (ans == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}

	}
}

