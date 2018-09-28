package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[10000][10000];

	public static int Main()
	{
		int i;
		int j;
		int n;
		int flag = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			a[i][j] = 1;
		}
		i = 0;
		j = 1;
		while (j < n)
		{
			if (a[i][j] == 0)
			{
				j++;
			}
			else
			{
				i = j;
				j++;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (i == j)
			{
				continue;
			}
			if (a[i][j] == 1 || a[j][i] == 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		else
		{
			System.out.print(i);
			System.out.print("\n");
		}
		return 0;
	}


}

