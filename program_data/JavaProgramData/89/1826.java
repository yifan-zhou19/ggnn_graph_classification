package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int q;
	int t;
	int i;
	int j;
	int count = 0;
	int[] x;
	int[] y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	x = new int[(n + 5)];
	y = new int[(n + 5)];
	for (q = 0;q <= n + 3;q++)
	{
	x[q] = 0;
	y[q] = 0;
	}


		for (t = 0;;t++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
		if (i == 0 && j == 0)
		{
			break;
		}
		x[j] += 1;
		y[i] += 1;
		}

		for (t = 0;t <= n - 1;t++)
		{
		if (x[t] == n - 1 && y[t] == 0)
		{
		System.out.printf("%d\n",t);
		count += 1;
		}
		}
		if (count == 0)
		{
		System.out.print("NOT FOUND");
		}
	}

}

