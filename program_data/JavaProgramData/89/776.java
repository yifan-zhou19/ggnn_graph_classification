package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int num;
	int a;
	int ml = 0;
	int[][] sz = new int[100000][2];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;;i++)
	{
		for (int j = 0;j < 2;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][j] = Integer.parseInt(tempVar2);
			}
		}
		if (sz[i][0] == 0 && sz[i][1] == 0)
		{
			break;
		}
	}
	for (int k = 0;k < n;k++)
	{
		num = n - 1;
		a = 0;
		for (int t = 0;;t++)
		{
			if (sz[t][0] == k)
			{
				if (sz[t][1] == 0 && sz[t][0] == 0)
				{
					break;
				}
				else
				{
				a = 1;
				break;
				}
			}
			if (sz[t][1] == k)
			{
				num--;
			}
			if (sz[t][0] == 0 && sz[t][1] == 0)
			{
				break;
			}
		}
		if (num == 0 && a == 0)
		{
			ml = 1;
			System.out.printf("%d",k);
			break;
		}
	}
		if (ml == 0)
		{
			System.out.print("NOT FOUND");
		}
	return 0;
	}
}

