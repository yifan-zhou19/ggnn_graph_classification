package <missing>;

public class GlobalMembers
{
	public static int ys(int x,int min)
	{
		int r = 1;
		if (x < min)
		{
		return 0;
		}
		for (int i = min;i < x;i++)
		{
				if (x % i == 0)
				{
				  r += ys(x / i, i);
				}
		}
		return r;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
		}
		for (int i = 0;i < n;i++)
		{
				System.out.printf("%d\n",ys(a[i], 2));
		}
		return 0;
	}

}

