package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int max1;
		int max2;
		int t;
		int i;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		max1 = 0;
		max2 = 1;
		for (i = 1;i < n;i++)
		{
			if (a[i] > a[max1])
			{
				max1 = i;
			}
		}
			t = a[0];
			a[0] = a[max1];
			a[max1] = t;
			for (i = 2;i < n;i++)
			{
				if (a[i] > a[max2])
				{
					max2 = i;
				}
			}
			System.out.printf("%d\n%d\n",a[0],a[max2]);
	}
}

