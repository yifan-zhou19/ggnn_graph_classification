package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int l;
		int count = 0;
		char[][] a = new char[100][100];
		int[][] flag = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1;l < k;l++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					flag[i][j] = 0;
				}
			}
			for (i = 0;i < n;i++)
			{
				 for (j = 0;j < n;j++)
				 {
					 if (a[i][j] == '@' && flag[i][j] == 0)
					 {
						 if (j + 1 < n && a[i][j + 1] == '.')
						 {
							 a[i][j + 1] = '@';
							 flag[i][j + 1] = 1;
							 count++;
						 }
						 if (i + 1 < n && a[i + 1][j] == '.')
						 {
							 a[i + 1][j] = '@';
							 flag[i + 1][j] = 1;
							 count++;
						 }
						 if (j - 1 >= 0 && a[i][j - 1] == '.')
						 {
							 a[i][j - 1] = '@';
							 flag[i][j - 1] = 1;
							 count++;
						 }
						 if (i - 1 < n && a[i - 1][j] == '.')
						 {
							 a[i - 1][j] = '@';
							 flag[i - 1][j] = 1;
							 count++;
						 }
					 }
				 }
			}
		}
		System.out.print(count);
		return 0;
	}
}

