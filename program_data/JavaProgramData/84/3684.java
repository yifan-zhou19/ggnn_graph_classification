package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int max1 = 0;
		int min;
		int max2;
		int[] a = new int[100];
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
		for (j = 0;j < n;j++)
		{
			if (max1 < a[j])
			{
				max1 = a[j];
			}
			else
			{
				continue;
			}
		}
		min = max1;
		for (k = 0;k < n;k++)
		{
			t = max1 - a[k];
			if (t == 0)
			{
				continue;
			}
			else
			{
				if (min > t)
				{
					min = t;
				}
				else
				{
					continue;
				}
			}
		}
		max2 = max1 - min;
		System.out.printf("%d\n%d\n",max1,max2);
	}
}

