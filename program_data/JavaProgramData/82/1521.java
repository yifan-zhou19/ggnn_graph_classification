package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		int j;
		int max;
		int e;
		int f;
		t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		for (j = 0;j <= 99;j++)
		{
			a[j] = 0,b[j] = 0,c[j] = 0;
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}

			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				t++;
			}
			else
			{
				c[i] = t;
		t = 0;
			}
		c[n] = t;
		}
		for (i = 0;i <= n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}

}

