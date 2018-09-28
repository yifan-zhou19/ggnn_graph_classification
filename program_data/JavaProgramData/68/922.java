package <missing>;

public class GlobalMembers
{
	public static int ip(int x)
	{
		int i;
		for (i = 2;i * i <= x;i++)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int a;
		int i;
		int j;
		int t;
		int e;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}



		for (i = 6;i <= n;i += 2)
		{

			for (j = 3;j <= i / 2;j += 2)
			{
				if (ip(j) != 0 && ip(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
				j = i;
				}
			}

		}

		return 0;
	}


}

