package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] p = new int[5];
		int[][] a = new int[5][5];
		int max;
		int max_y;
		int flag;
		int result = 0;
		p = a;

		int i;
		int j;
		int k;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}

		for (i = 0;i < 5;i++)
		{
			max = 0;
			flag = 0;
			for (j = 0;j < 5;j++)
			{
				if (*(p[i] + j) > max)
				{
					max = (p[i] + j);
					max_y = j;
				}
			}
			for (k = 0;k < 5;k++)
			{
				if (*(p[k] + max_y) < *(p[i] + max_y))
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(max_y + 1);
				System.out.print(' ');
				System.out.print((p[i] + max_y));
				System.out.print("\n");
				result++;
			}
		}

		if (result == 0)
		{
			System.out.print("not found");
		}

		return 0;
	}

}

