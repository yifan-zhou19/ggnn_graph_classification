package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] cases = new int[100][3];
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
				cases[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				cases[i][1] = Integer.parseInt(tempVar3);
			}
			cases[i][2] = 100 * cases[i][1] / cases[i][0];
		}
		for (i = 1;i < n;i++)
		{
			if (cases[i][2] - cases[0][2] >= 5)
			{
				System.out.print("better\n");
			}
			else if (cases[0][2] - cases[i][2] >= 5)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

