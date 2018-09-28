package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int sum = 0;
		int tie = 0;
		int[][] cai = new int[200][2];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					cai[i][j] = Integer.parseInt(tempVar2);
				}
			}
			if ((cai[i][0] == 0 && cai[i][1] == 1) || (cai[i][0] == 1 && cai[i][1] == 2) || (cai[i][0] == 2 && cai[i][1] == 0))
			{
				sum = sum + 1;
			}
			if (cai[i][0] == cai[i][1])
			{
				tie = tie+1;
			}
		}
		if (n % 2 == 0)
		{
			if (sum > (n - tie) / 2)
			{
				System.out.print("A");
			}
			if (sum < (n - tie) / 2)
			{
				System.out.print("B");
			}
			if (sum == (n - tie) / 2)
			{
				System.out.print("Tie");
			}
		}
		if (n % 2 == 1)
		{
			if (sum > (n - tie - sum))
			{
				System.out.print("A");
			}
			if (sum < (n - tie - sum))
			{
				System.out.print("B");
			}
			if (sum == (n - tie - sum))
			{
				System.out.print("Tie");
			}
		}

		return 0;
	}







}

