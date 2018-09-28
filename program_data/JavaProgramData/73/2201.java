package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] number = new int[5][5];
		int i;
		int p;
		int[][] judge = new int[5][5];
		int name;
		int min;
		int max;
		for (i = 0;i < 5;i++)
		{
			for (p = 0;p < 5;p++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					number[i][p] = Integer.parseInt(tempVar);
				}
				judge[i][p] = 0;
			}
		}
		for (i = 0;i < 5;i++)
		{
			max = number[i][0];
			name = 0;
			for (p = 0;p < 5;p++)
			{
				if (number[i][p] > max)
				{
					name = p;
					max = number[i][p];
				}
			}
			judge[i][name]++;
		}
		for (p = 0;p < 5;p++)
		{
			min = number[0][p];
			name = 0;
			for (i = 0;i < 5;i++)
			{
				if (number[i][p] < min)
				{
					name = i;
					min = number[i][p];
				}
			}
			judge[name][p]++;
		}
		for (i = 0;i < 5;i++)
		{
			for (p = 0;p < 5;p++)
			{
				if (judge[i][p] == 2)
				{
					System.out.printf("%d %d %d",i + 1,p + 1,number[i][p]);
					return 0;
				}
			}
		}
		System.out.print("not found");



		return 0;
	}
}

