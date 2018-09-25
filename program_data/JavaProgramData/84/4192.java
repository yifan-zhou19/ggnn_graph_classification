package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		int max1;
		int max2;
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
		max1 = a[0];

		for (i = 1;i < n;i++)
		{
			if (a[i] > max1)
			{
				max1 = a[i];
			continue;
			}
			else
			{
					continue;
			}
		}
		max2 = a[0];
			for (i = 1;i < n;i++)
			{
				if (a[i] < max1 && a[i]> max2)
				{
					max2 = a[i];
				continue;
				}
				else
				{
					continue;
				}
			}
			System.out.printf("%d\n%d\n",max1,max2);
	}
}

