package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[10000][2];
		int n;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			x[i - 1][1] = 0;
			x[i - 1][2] = 0;
		}
		for (;;)
		{
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
			if (a == 0 && b == 0)
			{
			break;
			}
			x[b][1] = x[b][1] + 1;
			x[a][2] = x[a][2] + 1;
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (x[i][1] == n - 1 && x[i][2] == 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		if (i == n)
		{
		System.out.print("NOT FOUND");
		}
	}

}

