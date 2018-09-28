package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] ans = new int[4];
		int i;
		int all;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 3;i++)
		{
			ans[i] = 0;
		}
		all = 0;
		if ((a % 3) == 0)
		{
			ans[1] = 3;
		}
		if ((a % 5) == 0)
		{
			ans[2] = 5;
		}
		if ((a % 7) == 0)
		{
			ans[3] = 7;
		}
		for (i = 1;i <= 3;i++)
		{
			if ((ans[i] != 0) && (all != 0))
			{
				System.out.printf(" %d",ans[i]);
						all++;
			}
			if ((ans[i] != 0) && (all == 0))
			{
				System.out.printf("%d",ans[i]);
						all++;
			}


		}
		if (all == 0)
		{
			System.out.print("n");
		}
		return 0;
	}

}

