package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int badall;
		int all;
		int[] total = {60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				badall = Integer.parseInt(tempVar2);
			}
			if (badall != 0)
			{
			for (j = 0;j < badall;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					total[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = badall - 1;j >= 0;j--)
			{
				if (total[j] + j * 3 <= 60)
				{
				all = 60 - (j + 1) * 3;
				if (all < total[j])
				{
				all = total[j];
				}
				break;
				}
			}
			}
			else
			{
				all = 60;
			}
			System.out.printf("%d\n", all);
		}
		return 0;
	}

}

