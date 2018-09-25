package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
		int max = 0;
		int i;
		int j;
		int flag = 1;
		int tag = 1;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				if (a[i][j] > a[i][max])
				{
					max = j;
				}
			}
			for (int k = 0; k < 5; k++)
			{
				if (a[i][max] > a[k][max])
				{
					flag = 0;
				}
			}
			if (flag != 0)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(max + 1);
				System.out.print(" ");
				System.out.print(a[i][max]);
				tag = 0;
			}
			max = 0;
			flag = 1;
		}
		if (tag != 0)
		{
			System.out.print("not found");
		}
	return 0;
	}
}

