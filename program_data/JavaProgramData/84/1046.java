package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int[] f = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 1;b <= a;b++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				f[b] = Integer.parseInt(tempVar2);
			}
			if (c < f[b])
			{
				e = c;
				c = f[b];
				d = e;
			}
			if ((f[b] > d) && (f[b] < c))
			{
				d = f[b];
			}
		}
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		return 0;
	}
}

