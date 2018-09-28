package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i = 0;
	int[] bidaxiao = new int[1000];
	int a = 0;
	int b = 0;
	int c;
	int d;
	int e;
	int[] max = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (d = 0;d < n;d++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		if (c % 2 == 1)
		{
			bidaxiao[i] = c;
			i++;
		}
	}
	e = i;
	while (b < n)
	{
		for (i = 0;i < e;i++)
		{
			if (a < bidaxiao[i])
			{
			a = bidaxiao[i];
			}
		}
		for (i = 0;i < e;i++)
		{
			if (bidaxiao[i] == a)
			{
				bidaxiao[i] = 0;
			}

		}
	max[b] = a;
	a = 0;
	b++;
	}
	for (i = 0;i < e-1;i++)
	{
	System.out.printf("%d,",max[e - i - 1]);
	}
	System.out.printf("%d",max[0]);
	return 0;
	}


}

