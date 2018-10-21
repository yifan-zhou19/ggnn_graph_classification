package <missing>;

public class GlobalMembers
{
	public static int min(int a,int b,int c,int d,int e)
	{
		int min;
		min = a < b != 0?a:b;
		min = min < c != 0?min:c;
		min = min < d != 0?min:d;
		min = min < e != 0?min:e;
		return (min);
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
		j = a[i][0] > a[i][1] != 0?0:1;
		j = a[i][j] > a[i][2] != 0?j:2;
		j = a[i][j] > a[i][3] != 0?j:3;
		j = a[i][j] > a[i][4] != 0?j:4;
		if (a[i][j] == min(a[0][j], a[1][j], a[2][j], a[3][j], a[4][j]))
		{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(j + 1);
				System.out.print(" ");
				System.out.print(a[i][j]);
				System.out.print("\n");
				break;
		}
		if (i == 4)
		{
					System.out.print("not found");
					System.out.print("\n");
		}
		}
		return 0;
	}
}

