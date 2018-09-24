package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	int i;
	int j;
	int a;
	int b = 3;
	int k;
	int s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 2;i <= n;i++)
	{
		k = 0;
		for (j = 2;j <= Math.sqrt(i);j++)
		{
			if (i % j == 0)
			{
				k = 1;
			}
		}
		if (k == 0)
		{
			a = b;
			b = i;
			if (b - a == 2)
			{
			System.out.printf("%d %d\n",a,b);
		s = 1;
			}
		}
	}
	if (s == 0)
	{
	System.out.print("empty\n");
	}
	return 0;
	}


}

