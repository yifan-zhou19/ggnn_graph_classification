package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int x;
	int y;
	int[][] a = new int[7][7];
	int[] k = new int[7];
	int b;
	char c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y = Integer.parseInt(tempVar3);
	}
	for (i = 0;i <= x - 1;i++)
	{
		for (j = 0;j <= y - 1;j++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[i][j] = Integer.parseInt(tempVar4);
		}
		}
	}
	for (i = 0;i <= x - 1;i++)
	{
	b = 0;
	k[i] = 0;
	for (j = 1;j <= y - 1;j++)
	{
		if (a[i][k[i]] < a[i][j])
		{
		k[i] = j;
		}
	}
	for (j = 0;j <= x - 1;j++)
	{
		if (a[j][k[i]] < a[i][k[i]])
		{
		b = 1;
		}
	}
	if (b == 0)
	{
		System.out.printf("%d+%d",i,k[i]);
	break;
	}
	}
	if (b == 1)
	{
		System.out.print("No");
	}
	return 0;
	}
}

