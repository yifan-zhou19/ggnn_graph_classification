package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[101];
		int i;
		int j;
		int k;
		int n;
		int max;
		int m;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		max = a[1];
		for (j = 1;j <= n;j++)
		{
			if (max < a[j])
			{
				max = a[j];
			}
		}
		m = a[1];
		for (k = 1;k <= n;k++)
		{
			if ((a[k] < max) && (m < a[k]))
			{
				m = a[k];
			}
		}
		System.out.printf("%d\n",max);
		System.out.printf("%d",m);
	}
}

