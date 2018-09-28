package <missing>;

public class GlobalMembers
{
	public static int m(int p,int q)
	{
		int z;
	z = (p > q)? p:q;
	return z;
	}
	public static int Main()
	{
		int i;
		int x;
		int j;
		int y;
		int n;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] t = new int[n];
		for (i = 1;i <= n;i++)
		{
			t[i - 1] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (x >= 90 && x <= 140 && y <= 90 && y >= 60)
			{
				a[i - 1] = 1;
			}
			else
			{
				a[i - 1] = 0;
			}
		}
		for (i = 1,j = 0;i <= n;i++)
		{
			if (a[i - 1] == 1)
			{
				t[j]++;
			}
			else
			{
				j++;
			}
		}
		for (i = 1,r = t[0];i <= n - 1;i++)
		{
		r = m(r, t[i]);
		}
		System.out.printf("%d",r);

		return 0;
	}

}

