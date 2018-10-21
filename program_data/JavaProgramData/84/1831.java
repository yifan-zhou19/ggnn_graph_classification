package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		int p;
		int q;
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
		for (k = 1;k <= n - 1;k++)
		{
			if (a[0] < a[k])
			{
				p = a[k];
				a[k] = a[0];
				a[0] = p;
			}
		}
		System.out.printf("%d\n",a[0]);
		for (l = 2;l <= k;l++)
		{
			if (a[1] < a[l])
			{
				q = a[l];
				a[l] = a[1];
				a[1] = q;
			}
		}
		System.out.printf("%d\n",a[1]);
		return 0;
	}
}

