package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] n = new int[5][5];
		int i;
		int j;
		int[] max = new int[5];
		int flag;
		int count = 0;
		for (i = 0;i < 5;i++)
		{
			n[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			max[i] = 0;
			for (j = 1;j < 5;j++)
			{
				n[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (n[i][max[i]] < n[i][j])
				{
					max[i] = j;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			flag = 0;
			for (j = 0;j < 5;j++)
			{
				if (n[j][max[i]] < n[i][max[i]])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(max[i] + 1);
				System.out.print(' ');
				System.out.print(n[i][max[i]]);
				System.out.print("\n");
				count++;
			}
		}
		if (count == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}



}

