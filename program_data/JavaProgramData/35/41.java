package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] number = new int[100][100];
		int[] max = new int[100];
		int n;
		int m;
		int[] flag = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					number[i][j] = Integer.parseInt(tempVar3);
				}
				if (temp < number[i][j])
				{
					max[i] = j;
					temp = number[i][j];
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (number[i][max[j]] < number[j][max[j]])
				{
					flag[j] = 0;
				}
			}
			if (flag[j] == 1)
			{
				System.out.printf("%d+%d",j,max[j]);
			}
		}
		temp = 0;
		for (j = 0;j < n;j++)
		{
			temp += flag[j];
		}
		if (temp == 0)
		{
			System.out.print("No");
		}
	}

}

