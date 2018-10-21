package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 6;
		int j;
		int k1;
		int k2;
		int k3;
		int m;
		int p;
		int q;
		int h;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;i <= n;i = i + 2)
		{
			System.out.printf("%d=",i);
			for (m = 3;m <= (i / 2);m += 2)
			{
				k1 = Math.sqrt(m);
				h = i - m;
				k3 = Math.sqrt(h);
				if (m == 3)
				{
					if (h == 3)
					{
						System.out.print("3+3\n");
						break;
					}
					else
					{
							for (k = 2;k <= k3;k++)
							{
							if (h % k == 0)
							{
								break;
							}
							}
							if (k > k3)
							{
								System.out.printf("3+%d\n",h);
								break;
							}
					}
				}
				else
				{
						for (j = 2;j <= k1;j++)
						{
						if (m % j == 0)
						{
							break;
						}
						}
						if (j > k1)
						{
						p = i - m;
						k2 = Math.sqrt(p);
						 if (p == 3)
						 {
							 System.out.printf("%d+3\n",m);
						 }
						  else
						  {
							for (q = 2;q <= k2;q++)
							{
							  if (p % q == 0)
							  {
								  break;
							  }
							}
							  if (q > k2)
							  {
								  System.out.printf("%d+%d\n",m,p);
								  break;
							  }
						  }
						}
				}
			}
		}
	}

}

