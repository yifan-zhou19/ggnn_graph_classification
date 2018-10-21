package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0;l < k;l++)
		{
			int[][] a = new int[100][100];
			int m;
			int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
			int p;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
			 for (j = 0;j < n;j++)
			 {
			 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
			}
			int sum = 0;
			for (i = 0;i < n;i++)
			{
				p = a[0][i];
				sum += p;
			}
			if (m != 1)
			{
			for (i = 0;i < n;i++)
			{
				p = a[m - 1][i];
				sum += p;
			}
			}
			for (i = 1;i < m - 1;i++)
			{
				p = a[i];
				sum += p;
			}
			for (i = 1;i < m - 1;i++)
			{
				p = a[i][n - 1];
				sum += p;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

