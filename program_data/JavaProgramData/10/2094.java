package <missing>;

public class GlobalMembers
{
	public static int[] h = new int[25];
	public static int n;
	public static int Main()
	{
	int max = new int(int a,int b);
	int k;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			h[i] = Integer.parseInt(tempVar2);
		}
	}
	k = max(50000, 0);
	System.out.printf("%d",k);
	return 0;
	}
	public static int max(int hmax,int b)
	{
	int x;
	int y;
	int z;
	while (h[b] > hmax)
	{
		b = b + 1;
	}
	if (b == n)
	{
		return 0;
	}
	x = max(hmax, b + 1);
	hmax = h[b];
	y = 1 + max(hmax, b + 1);
	z = x > y != 0?x:y;
	return z;
	}

}

