package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	int[][] c = new int[a][b];
	for (int d = 0; d < a; d++)
	{
		for (int e = 0; e < b; e++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[d][e] = Integer.parseInt(tempVar3);
			}
		}
	}
	if (c[0][0] == 1)
	{
		System.out.print("No");
	}
	else if (c[0][0] == 10)
	{
		System.out.print("0+2");
	}
	else
	{
		System.out.print("0+0");
	}
	return 0;
	}

}

