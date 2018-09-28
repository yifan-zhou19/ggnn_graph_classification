package <missing>;

public class GlobalMembers
{
	public static int[][] andian = new int[8][8];
	public static int[] zuida = new int[8];
	public static int[] zzhzb = new int[8];
	public static int Main()
	{
		int hang;
		int lie;
		int i;
		int s = 0;
		int j;
		int t = 0;
		int f;
		int w = 0;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < hang;j++)
		{
			for (i = 0;i < lie;i++)
			{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		andian[j][i] = Integer.parseInt(tempVar3);
	}
				if (andian[j][i] > zuida[j])
				{
					zuida[j] = andian[j][i];
					zzhzb[j] = i;
				}
			}

		}
		for (h = 0;h < hang;h++)
		{
	s = 0;
			for (f = 0;f < hang;f++)
			{
				if (andian[f][zzhzb[h]] > zuida[h])
				{
	s++;
				}
			}
	if (s == hang - 1)
	{
	System.out.printf("%d+%d",h,zzhzb[h]);
	w = 1;
	}

		}
	if (w == 0)
	{
	System.out.print("No");
	}


		return 0;
	}
}

