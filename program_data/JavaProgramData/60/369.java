package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		int s;
		int j;
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
		for (i = 3;i <= n - 2;i++)
		{
			t = 0;
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					t = 1;
				}
			}
			for (j = 2;j <= Math.sqrt(i + 2);j++)
			{
				if ((i + 2) % j == 0)
				{
					t = 1;
				}
			}
			if (t == 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
			}
		}
		}
		return 0;
	}


}

