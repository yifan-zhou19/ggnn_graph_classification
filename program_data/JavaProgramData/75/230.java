package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int j;
		int n = 0;
		int m;
		int[] a = new int[1001];
		int[] b = new int[1001];
	char e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[0] = Integer.parseInt(tempVar);
	}
	m = 1;
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		e = tempVar2.charAt(0);
	}
	while (e == ',')
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[m] = Integer.parseInt(tempVar3);
		}
		m++;
		String tempVar4 = ConsoleInput.scanfRead(null, 1);
		if (tempVar4 != null)
		{
			e = tempVar4.charAt(0);
		}
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		b[0] = Integer.parseInt(tempVar5);
	}
	m = 1;
	String tempVar6 = ConsoleInput.scanfRead(null, 1);
	if (tempVar6 != null)
	{
		e = tempVar6.charAt(0);
	}
	while (e == ',')
	{
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			b[m] = Integer.parseInt(tempVar7);
		}
		m++;
		String tempVar8 = ConsoleInput.scanfRead(null, 1);
		if (tempVar8 != null)
		{
			e = tempVar8.charAt(0);
		}
	}
	for (i = 0;i < 1000;i++)
	{
		t = 0;
		for (j = 0;j < m;j++)
		{
			if (i >= a[j] != 0 && i < b[j])
			{
				t++;
			}
		}
		if (t > n)
		{
			n = t;
		}
	}
	System.out.printf("%d %d",m,n);
	return 0;
	}

}

