package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int nn;
	int ii;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		nn = Integer.parseInt(tempVar);
	}
	for (ii = 1;ii <= nn;ii++)
	{
		int n;
		int m;
		int t;
		int i;
		int j;
		int x;
		int y;
		int sum = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			x = Integer.parseInt(tempVar3);
		}
		for (i = 1;i <= y;i++)
		{
			for (j = 1;j <= x;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					t = Integer.parseInt(tempVar4);
				}
				if (i == 1 || i == y || j == x || j == 1)
				{
					sum += t;
				}
			}
		}
		System.out.printf("%d\n",sum);
	}
	}

}

