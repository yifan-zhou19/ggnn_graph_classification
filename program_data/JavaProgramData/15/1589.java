package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int s = 0;
	int i;
	int j;
	int a = 0;
	int b = 0;
	int[][] sz = new int[100][100];
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
				sz[i][j] = Integer.parseInt(tempVar2);
			}
		}
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			if (sz[i][j] == 0)
			{
				a++;
			}
		}
			if (a != 0)
			{
				break;
			}

	}
	for (j = 0;j < n;j++)
	{
		for (i = 0;i < n;i++)
		{
			if (sz[i][j] == 0)
			{
				b++;
			}
		}
		if (b != 0)
		{
			break;
		}
	}
	s = a * b - 2 * a - 2 * b + 4;
	System.out.printf("%d",s);
	return 0;
	}

}

