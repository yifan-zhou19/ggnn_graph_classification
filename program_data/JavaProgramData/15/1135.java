package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int s;
	int b = 0;
	int c1 = 0;
	int c2 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
	if (k == 0)
	{
		c2++;
	}
	if (k == 0 && b == 0)
	{
		c1++;
	}
	else if (k == 255 && b == 0 && c1 > 0)
	{
		b = 1;
	}
		}
	}
	s = (c1 - 2) * (c2 - c1 * 2) / 2;
	System.out.printf("%d",s);
	return 0;
	}
}

