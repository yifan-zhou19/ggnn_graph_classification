package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (a = 3;a <= n - 2;a++)
			{
			flag = 0;
			for (i = 2;i < a;i++)
			{
				if (a % i == 0)
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				for (i = 2;i < a + 2;i++)
				{
					if ((a + 2) % i == 0)
					{
						flag = 1;
					}
				}
			}
			if (flag == 0)
			{
				System.out.printf("%d %d\n",a,a + 2);
			}
			}
		}
	}

}

