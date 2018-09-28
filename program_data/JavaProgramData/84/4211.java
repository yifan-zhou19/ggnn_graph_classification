package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int max;
		int max2;
		int smax;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
			max = a[0],max2 = 0;
			for (j = 0;j <= n - 1;j++)
			{
				if (a[j] > max)
				{
					max = a[j],max2 = j;
				}
			}
			k = a[n - 1];
			a[n - 1] = a[max2];
			a[max2] = k;
			smax = a[0];
			for (l = 0;l <= n - 2;l++)
			{
				if (a[l] > smax)
				{
					smax = a[l];
				}
			}
			System.out.printf("%d\n%d\n",max,smax);
	}
}

