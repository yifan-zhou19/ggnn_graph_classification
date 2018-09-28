package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int k;
		int e;
		int t;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2 * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < 2 * n - 2 * k;i = i + 2)
			{
				if (a[i] > a[i + 2])
				{
					e = a[i];
					a[i] = a[i + 2];
					a[i + 2] = e;
					t = a[i + 1];
					a[i + 1] = a[i + 3];
					a[i + 3] = t;
				}
			}
		}
		int p = a[0];
		int q = a[1];
		for (i = 0;i < 2 * n - 2;i = i + 2)
		{
			if (a[i + 2] > q)
			{
				r = 1;
				break;
			}
			else if (a[i + 2] <= q != 0 && a[i + 3] >= q)
			{
				q = a[i + 3];
			}
		}
		if (r == 1)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d\n",p,q);
		}
			return 0;
	}



}

