package <missing>;

public class GlobalMembers
{
	public static int[] q = new int[5];
	public static int cmp(int x, int y, int[][] a)
	{
		int[] p = new int[5];
		int i;
		int temp;
		  p = a;
		if (x >= 0 && x < 5 && y >= 0 && y < 5)
		{
			for (i = 0;i < 5;i++)
			{
			   temp = (p[x] + i);
			   *(p[x] + i) = *(p[y] + i);
				*(p[y] + i) = temp;
			}
			q = p;
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[5][5];
		int i;
		int j;
		q = a;
		 for (i = 0;i < 5;i++)
		 {
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		 }
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (cmp(n, m, q) == 0)
		{
			System.out.print("error");
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				if (j == 4)
				{
				System.out.print((q[i] + j));
				}
			else
			{
				System.out.print((q[i] + j));
				System.out.print(" ");
			}
			}
			System.out.print("\n");
			}
		}
			return 0;
	}

}

