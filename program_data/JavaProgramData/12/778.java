package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[15];
	int m = 0;
	int s;
	int h;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	while ((t + 1) != 0)
	{
	for (n = 0,s = 0;t != 0;n++)
	{
	a[n] = t,s++,scanf("%d", t);
	}
	for (n = 0;n < s;n++)
	{
		for (h = 0;h < s;h++)
		{
			if (a[n] == 2 * a[h])
			{
				m++;
			}
		}
	}
	System.out.printf("%d\n",m);
	m = 0;
	String tempVar2 = ConsoleInput.scanfRead("\n");
	if (tempVar2 != null)
	{
		t = Integer.parseInt(tempVar2);
	}
	}
	return 0;
	}
}

