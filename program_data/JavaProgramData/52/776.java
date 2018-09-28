package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[200];
		int k;
		int l;
		int o;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i] = Integer.parseInt(tempVar3);
		   }
		}
		for (k = n - 1;k >= 0;k--)
		{
			a[k + m] = a[k];
		}
		for (l = 0;l < m;l++)
		{
			a[l] = a[n + l];
		}
		for (o = 0;o < n - 1;o++)
		{
			System.out.printf("%d ",a[o]);
		}
		System.out.printf("%d\n",a[n - 1]);
	}
}

