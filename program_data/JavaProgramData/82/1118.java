package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	int d;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] c = new int[n];
	m = 1;
	c[m] = 0;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a <= 140 && a >= 90 && b <= 90 && b >= 60)
		{
		   c[m] = c[m] + 1;
		}
		else
		{
			m = m + 1;
			c[m] = 0;
		}
	}
	for (i = 1;i < m;i++)
	{
		if (c[i] > c[i + 1])
		{
		d = c[i];
		c[i] = c[i + 1];
		c[i + 1] = d;
		}
	}
	System.out.printf("%d",c[m]);
	return 0;
	}

}

