package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int m;
		int l;
		int n;
		int k;
		int t;
		int[] p = a;
		int[] q = a[0];
		int row;
		int column;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		column = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < row;j++)
		{
				q = (a + j);
				for (l = 0;l < column;l++)
				{
					q[l] = ConsoleInput.readToWhiteSpace(true);
				}
		}
		for (i = 0;i <= row + column - 2;i++)
		{
			for (k = 0;k < row;k++)
			{
				for (t = 0;t < column;t++)
				{
					if (k + t == i)
					{
						System.out.print((p[k] + t));
						System.out.print("\n");
					} //????
				}
			}
		}
		return 0;
	}
}

