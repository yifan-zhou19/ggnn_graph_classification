package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[10000];
		int sum;
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
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			if (m != 0)
			{
				sum = 0;
				for (j = 0;j < m;j++)
				{
					 String tempVar3 = ConsoleInput.scanfRead();
					 if (tempVar3 != null)
					 {
						 a[j] = Integer.parseInt(tempVar3);
					 }
				}
					 sum = a[m - 1] + 3 * m;
				if (sum <= 60)
				{
					System.out.printf("%d\n",(60 - 3 * m));
				}
				if (sum > 60)
				{
					for (j = 0;j < m;j++)
					{
						if ((a[j] + 3 * (j + 1)) < 60 && (a[j + 1] + 3 * (j + 1)) >= 60)
						{
							 System.out.printf("%d\n",(60 - 3 * (j + 1)));
							 break;
						}
						if ((a[j] + 3 * (j + 1)) >= 60 && (a[j] + 3 * (j + 1)) <= 63)
						{
							 System.out.printf("%d\n",a[j]);
							 break;
						}
					}
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			1 = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

