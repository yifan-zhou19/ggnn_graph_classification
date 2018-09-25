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
		int[] s = new int[20000];
		int ct = 0;
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
			c = Integer.parseInt(tempVar2);
		}
		s[b] = c;
		d = 0;
	for (e = 1;e <= b - 1;e++)
	{
		if (s[b] == s[e])
		{
			d = 1;
		}
	}
	if (d == 0)
	{
	if (ct == 1)
	{
		System.out.print(" ");
	}
	System.out.printf("%d",s[b]);
	ct = 1;
	}
	}
	return 100;
	}

}

