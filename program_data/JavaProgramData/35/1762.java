package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int[][] su = new int[8][8];
		int k = 0;
		int x = 1;
		int y = 1;
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
		for (i = 0;i < a;i++)
		{
		for (j = 0;j < b;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			su[i][j] = Integer.parseInt(tempVar3);
		}
		}
		}
		for (i = 0;i < a;i++)
		{
		for (j = 0;j < b;j++)
		{
		if (su[i][j] > su[i][k])
		{
		k = j;
		}
		}
		for (j = 0;j < a;j++)
		{
		if (su[j][k] < su[i][k])
		{
		x = 0;
		}
		}
		if (x != 0)
		{
			  System.out.printf("%d+%d",i,k);
	   y--;
		}
		}
	if (y != 0)
	{
	System.out.print("No");
	}

	return 0;
	}
}

