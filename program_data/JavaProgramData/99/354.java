package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		int i;
		char j = 0;
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] <= 18)
			{
				a++;
			}
			else
			{
				if (sz[i] <= 35)
				{
					b++;
				}
				else
				{
					if (sz[i] <= 60)
					{
						c++;
					}
					else
					{
						d++;
					}
				}
			}
		}
		System.out.printf("1-18:%c%.2lf%%\n",32,a * 100 / n);
			System.out.printf("19-35:%c%.2lf%%\n",32,b * 100 / n);
				System.out.printf("36-60:%c%.2lf%%\n",32,c * 100 / n);
					System.out.printf("60??:%c%.2lf%%\n",32,d * 100 / n);
					return 0;
	}
}

