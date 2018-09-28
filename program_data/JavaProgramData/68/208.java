package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a;
		int b;
		int c;
		int k;
		int p;
		int q;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (a = 6;a <= n;a = a + 2)
			{
				for (i = 3;i <= a / 2;i = i + 2)
				{
					k = Math.sqrt(i);
					for (j = 2;j <= k;j++)
					{
						if (i % j == 0)
						{
							break;
						}
					}
					if (j >= k + 1)
					{
						b = i;
						c = a - b;
						p = Math.sqrt(c);
						for (m = 3;m <= p;m = m + 2)
						{
							if (c % m == 0)
							{
								break;
							}
						}
						if (m >= p + 1)
						{
							q = c;
							System.out.printf("%d=%d+%d\n",a,b,q);
							break;
						}
					}
				}



			}


		return 0;
	}


}

