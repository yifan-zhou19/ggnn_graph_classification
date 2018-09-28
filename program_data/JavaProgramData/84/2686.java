package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int max1;
		int max2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		if (a[0] >= a[1])
		{
			max1 = a[0];
			max2 = a[1];
		}
		else
		{
			max1 = a[1];
			max2 = a[0];
		}
		for (i = 3;i <= n;i++)
		{
			if (a[i - 1] >= max1)
			{
				max2 = max1;
				max1 = a[i - 1];
			}
			else
			{
				if (a[i - 1] >= max2)
				{
					max2 = a[i - 1];
				}
			}
		}
		System.out.printf("%d\n%d\n",max1,max2);
	}

}

