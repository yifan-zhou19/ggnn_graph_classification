package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int r1;
		int r2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 5,k = 0;i <= n;i++)
		{
			for (j = 3,r1 = 0;j <= i - 2 - 1;j = j + 2)
			{
				if ((i - 2) % j == 0)
				{
					r1 = 1;
					break;
				}
			}
			if (r1 == 0)
			{
				for (j = 3,r2 = 0;j <= i - 1;j = j + 2)
				{
					if (i % j == 0)
					{
						r2 = 1;
						break;
					}
				}
				if (r2 == 0)
				{
					System.out.printf("%d %d\n",i - 2,i);
					k = 1;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("empty");
		}
	}




}

