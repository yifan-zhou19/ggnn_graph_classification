package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int t;
		int[] a = new int[100];
		int[] f = new int[100];
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
		t = 0;
		for (i = n;i >= 1;i--)
		{
			for (j = n;j >= i;j--)
			{
				if (a[i] >= a[j])
				{
					f[i] = (f[i] > f[j])? f[i]:f[j];
				}
			}
			f[i]++;
			t = (f[i] > t)? f[i]:t;
		}
		System.out.printf("%d\n",t);
	}
}

