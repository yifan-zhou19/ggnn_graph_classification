package <missing>;

public class GlobalMembers
{
	public static int[][] m = new int[1000][1000];
	public static int Main()
	{
	int n;
	int i;
	int j = 0;
	int p;
	int x = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[j][i] = Integer.parseInt(tempVar2);
		}
		}
	}

	for (i = 0;i < n;i++)
	{
		p = 0;
		j = 0;
		while (m[j][i] != 0 && j < n)
		{
			j++;
		}
		j = j + 1;
		while (m[j][i] != 0 && j < n)
		{
			p++;
			j++;
		}
		x = x + p;
	}

	System.out.printf("%d\n",x);
	return 0;
	}

}

