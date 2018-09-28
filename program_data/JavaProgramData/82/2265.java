package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		int[] c = new int[100];
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				c[i] = 1;
			}
			else
			{
				c[i] = 0;
			}
		}
		int t = 0;
		int q = 0;
		int[] d = new int[100];
		for (i = 0;i < n;i++)
		{
			if (c[i] == 1)
			{
				t++;
			}
			if ((c[i] != c[i + 1] || i == n - 1) && c[i] != 0)
			{
				d[q] = t;
				q++;
				t = 0;
			}
		}
		int w = d[0];
		for (i = 0;i < q;i++)
		{
			if (w < d[i])
			{
				w = d[i];
			}
		}
		System.out.printf("%d",w);
		return 0;
	}
}

