package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[6][6];
		int i;
		int j;
		int k;
		int l = 0;
		for (i = 1; i < 6; i++)
		{
			for (j = 1; j < 6; j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int max;
		int row;
		int line;
		for (i = 1; i < 6; i++)
		{
			max = num[i][1];
			line = 1;
			for (j = 1; j < 6; j++)
			{
				if (max < num[i][j])
				{
					 max = num[i][j];
					 line = j;
				}
			}
			int p = 0;
			for (k = 1; k < 6; k++)
			{
				if (max > num[k][line])
				{
					 p = 1;
					 break;
				}
			}
			if (p == 0)
			{
				 System.out.print(i);
				 System.out.print(" ");
				 System.out.print(line);
				 System.out.print(" ");
				 System.out.print(num[i][line]);
				 System.out.print("\n");
				 l = 1;
			}
		}
		if (l == 0)
		{
		   System.out.print("not found");
		   System.out.print("\n");
		}
		return 0;
	}

}

