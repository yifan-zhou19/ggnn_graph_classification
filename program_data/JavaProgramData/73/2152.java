package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] max = {0, 0, 0, 0, 0};
		int[] k = {0, 0, 0, 0, 0};
		int[] r = {0, 0, 0, 0, 0};
		int i = 0;
		int j = 0;
		int flag = 0;
		int t = 0;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (max[i] < a[i][j])
				{
					max[i] = a[i][j];
					k[i] = j;
				}
			}
		}
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				flag = 1;
				if (max[i] > a[j][k[i]])
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				t++;
				r[t] = max[i];
				break;
			}
		}
		if (flag == 1)
		{
			System.out.print(i + 1);
			System.out.print(" ");
			System.out.print(k[i] + 1);
			System.out.print(" ");
			System.out.print(r[1]);
			System.out.print("\n");
		}
		else
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

