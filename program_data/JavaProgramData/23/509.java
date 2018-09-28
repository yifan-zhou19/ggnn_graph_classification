package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] m = new int[100];
		int n;
		int p;
		for (int i = 1;i <= 100;i++)
		{
			for (int j = 1;j <= 100;j++)
			{
				a[i][j] = System.in.read();
				if (a[i][j] == '\n' || a[i][j] == ' ')
				{
				   p = a[i][j];
				   m[i] = j - 1;
				   break;
				}
			}
			if (p == '\n')
			{
			   n = i;
			   break;
			}
		}
		for (int i = n;i >= 1;i--)
		{
			for (int j = 1;j <= m[i];j++)
			{
				System.out.print(a[i][j]);
			}
			if (i == 1)
			{
			break;
			}
			System.out.print(' ');
		}
		return 0;
	}

}
