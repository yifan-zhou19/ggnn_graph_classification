package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int[][] k = new int[5][5];
	for (i = 0;i <= 4;i++)
	{
		for (j = 0;j <= 4;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				k[i][j] = Integer.parseInt(tempVar);
			}
		}
	}
	int a;
	int b;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (a >= 0 && a <= 4 && b >= 0 && b <= 4)
	{
		int[] h = new int[5];
		for (i = a;;)
		{
			for (j = 0;j <= 4;j++)
			{
				h[j] = k[i][j];
				k[i][j] = k[b][j];
				k[b][j] = h[j];
			}
			break;
		}
		for (i = 0;i <= 4;i++)
		{
		for (j = 0;j <= 4;j++)
		{
			if (j == 0)
			{
				System.out.printf("%d",k[i][j]);
			}
			else if (j == 4)
			{
				System.out.printf(" %d\n",k[i][j]);
			}
			else
			{
				System.out.printf(" %d",k[i][j]);
			}
		}
		}
	}
	else
	{
	System.out.print("error");
	}
		return 0;
	}
}

