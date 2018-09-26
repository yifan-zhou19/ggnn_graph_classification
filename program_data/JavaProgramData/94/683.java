package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int e;
		int[] a = new int[500];
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int i = 0;
		int t = 0;
		while (i < N)
		{
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		if (a[i] % 2 != 0)
		{
		b[t] = a[i];
		t++;
		}
		i++;
		}
		int s = 1;
		while (s <= t)
		{
		int r = 0;
		while (r < t - s)
		{
		if (b[r] > b[r + 1])
		{
		e = b[r + 1];
		b[r + 1] = b[r];
		b[r] = e;
		}
		r++;
		}
		s++;
		}
		int u = 0;
		while (u < t)
		{
		if (u == 0)
		{
		System.out.printf("%d",b[0]);
		}
		else
		{
		System.out.printf(",%d",b[u]);
		}
		u++;
		}
		return 0;
	}
}

