package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int t;
		int[] a = new int[10000];
		int[] f = new int[10000];
		int ans = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			t = 0;
			for (j = 1;j < i;j++)
			{
				  if (a[i] <= a[j] != 0 && f[j]> t)
				  {
					   t = f[j];
				  }
			}
			f[i] = t + 1;
			if (f[i] > ans)
			{
				ans = f[i];
			}
		}
		System.out.printf("%d\n",ans);
		return 0;
	}

}

