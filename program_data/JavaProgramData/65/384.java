package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[200][2];
	public static int Main()
	{
		int n;
		int i;
		int win;
		int tie;
		int lose;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		win = 0;
		tie = 0;
		lose = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == 0 && a[i][1] == 1)
			{
				win += 1;
			}
			else if (a[i][0] == 1 && a[i][1] == 2)
			{
				win += 1;
			}
			else if (a[i][0] == 2 && a[i][1] == 0)
			{
				win += 1;
			}
			else if (a[i][0] == a[i][1])
			{
				tie += 1;
			}
		}
		lose = n - win - tie;
		if (win > lose)
		{
			System.out.print("A\n");
		}
		else if (win < lose)
		{
			System.out.print("B\n");
		}
		else
		{
			System.out.print("Tie\n");
		}
			return 0;
	}

}

