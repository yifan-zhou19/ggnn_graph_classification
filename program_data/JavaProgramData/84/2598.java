package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max1;
		int max2;
		int n;
		int i;
		int j;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max1 = 0;
		max2 = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] > max1)
			{
				max1 = a[i];
				j = i;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (i != j)
			{
				if (a[i] > max2)
				{
					max2 = a[i];
				}
			}
		}
		System.out.printf("%d\n%d\n",max1,max2);
	}
}

