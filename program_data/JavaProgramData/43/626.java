package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a;
		double b;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		for (i = 3;i <= 2 * n - 1;i = i + 2)
		{
			b = i;
			a = (int)Math.sqrt(b) + 1;
			for (k = 2;k < a;k++)
			{
				if (i % k == 0)
				{
					break;
				}
			}
			if (a == k)
			{
				for (j = i;j <= n - i;j = j + 2)
				{
					b = j;
					a = (int)Math.sqrt(b) + 1;
					for (k = 2;k < a;k++)
					{
						if (j % k == 0)
						{
							break;
						}
					}
					if (a == k)
					{
						if (n == i + j)
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
				}
			}
		}




		return 0;
	}


}

