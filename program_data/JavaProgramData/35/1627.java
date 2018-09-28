package <missing>;

public class GlobalMembers
{
	public static int[][] s = new int[10][10];
	public static int[][] tag = new int[10][10];

	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < a; i++)
		{
			for (j = 0; j < b; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
				tag[i][j] = 0;
			}
		}

		for (i = 0; i < a; i++)
		{
			int cur_max = s[i][0];
			int cur_b = 0;
			for (j = 1; j < b; j++)
			{
				if (s[i][j] > cur_max)
				{
					cur_max = s[i][j];
					cur_b = j;
				}
			}
			tag[i][cur_b] = 1;
		}

		for (i = 0; i < b; i++)
		{
			int cur_min = s[0][i];
			int cur_a = 0;
			for (j = 1; j < a; j++)
			{
				if (s[j][i] < cur_min)
				{
					cur_min = s[j][i];
					cur_a = j;
				}
			}
			if (tag[cur_a][i] == 1)
			{
				System.out.printf("%d+%d\n", cur_a, i);
				break;
			}
		}
		if (i == b)
		{
			System.out.print("No\n");
		}
		return 0;
	}








}

