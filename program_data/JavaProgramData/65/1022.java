package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] x = new int[199][2];
		int i;
		int a;
		int b;
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
				x[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (a = b = 0,i = 0;i < n;i++)
		{
			if ((x[i][0] == 0 && x[i][1] == 1) || (x[i][0] == 1 && x[i][1] == 2) || (x[i][0] == 2 && x[i][1] == 0))
			{
				a++;
			}
			else
			{
				if ((x[i][01] == 0 && x[i][0] == 1) || (x[i][1] == 1 && x[i][0] == 2) || (x[i][1] == 2 && x[i][0] == 0))
				{
					b++;
				}
			}
		}
		if (a > b)
		{
			System.out.print("A\n");
		}
		else
		{
			if (a < b)
			{
				System.out.print("B\n");
			}
			else
			{
				System.out.print("Tie\n");
			}
		}
		return 0;
	}

}

