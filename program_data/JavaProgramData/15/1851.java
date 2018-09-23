package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int d;
	int s;
	b = 0;
	int[] sz = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n * n - 1;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		if (a == 0)
		{
			sz[b] = i;
			b++;
		}
	}
	c = (sz[b - 1] + 1) % n - (sz[0] + 1) % n + 1;
	d = (b + 2) / 2 - c + 1;
	s = (c - 2) * (d - 2);
	System.out.printf("%d",s);
	return 0;
	}

}

