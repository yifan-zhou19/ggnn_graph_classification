package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int fb = int a;
		int n;
		int a;
		int m;
		int i;
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
				a = Integer.parseInt(tempVar2);
			}
		m = fb(a);
		System.out.printf("%d\n",m);
		}
	}

	public static int fb(int a)
	{
		int k;
		int[] sl = new int[20];
		int x;
		sl[1] = 1;
		sl[2] = 1;
		for (k = 3;k <= a;k++)
		{
			sl[k] = sl[k - 2] + sl[k - 1];
		}
		x = sl[a];
		return (x);
	}
}

