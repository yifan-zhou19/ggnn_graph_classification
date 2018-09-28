package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int i;
	int j;
	int max;
	int min;
	int col1;
	int andian;
	int k;
	for (i = 0;i < 5;i++)
	{
	for (j = 0;j < 5;j++)
	{
	a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}

	for (i = 0;i < 5;i++)
	{
		max = a[i][0];
		col1 = 0;
	for (j = 0;j < 5;j++)
	{
		if (a[i][j] > max)
		{
				max = a[i][j];

	col1 = j;
		}
	}
	andian = 1;
	for (k = 0;k < 5;k++)
	{
	if (max > a[k][col1])
	{
			andian = 0;
	continue;
	}
	}
	if (andian == 1)
	{
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(col1 + 1);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
	break;
	}
	}
	if (andian != 1)
	{
	System.out.print("not found");
	System.out.print("\n");
	}
	return 0;
	}






}

