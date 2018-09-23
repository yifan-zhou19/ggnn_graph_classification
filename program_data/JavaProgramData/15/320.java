package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int i;
		int j;
		int k;
		int s1 = 0;
		int s2;
		int t1;
		int t2;
		int square;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}
			}
			if (s1 == 0)
			{
			   for (j = 1;j <= n;j++)
			   {
					if (a[j] == 0)
					{
					   t1 = i;
					   s1 = j;
					   for (k = j;k <= n;k++)
					   {
							if (a[k] != 0)
							{
								s2 = k - 1;
								break;
							}
					   }
					}
					if (s1 != 0)
					{
						break;
					}
			   }
			}
			else
			{
				if (a[s1] == 0 && a[s1 + 1] == 0)
				{
					t2 = i;
				}
			}
		}
		square = (s2 - s1 - 1) * (t2 - t1 - 1);
		System.out.printf("%d",square);
		return 0;
	}




}

