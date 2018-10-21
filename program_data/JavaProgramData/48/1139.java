package <missing>;

public class GlobalMembers
{
	//***************************
	//*???????????  **
	//*?????? 1300012965 **
	//*???20131204          **
	//***************************
	public static int[][] a = new int[10][10];
	public static int[][] biaoji = new int[10][10];
	public static void f(int n)
	{
		int p;
		int q;
		int u;
		int v;
		if (n == 0)
		{
			return;
		}
		for (p = 1; p <= 9; p++)
		{
			for (q = 1; q <= 9; q++)
			{
				if (a[p][q] != 0)
				{
					biaoji[p][q] += 2 * a[p][q]; //???????
					biaoji[p - 1][q + 1] += a[p][q];
					biaoji[p - 1][q] += a[p][q];
					biaoji[p - 1][q - 1] += a[p][q];
					biaoji[p][q - 1] += a[p][q];
					biaoji[p][q + 1] += a[p][q];
					biaoji[p + 1][q - 1] += a[p][q];
					biaoji[p + 1][q] += a[p][q];
					biaoji[p + 1][q + 1] += a[p][q];
				}
			}
		}
		for (u = 1; u <= 9; u++)
		{
			for (v = 1; v <= 9; v++)
			{
				a[u][v] = biaoji[u][v]; //????????
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(biaoji,0,(Integer.SIZE / Byte.SIZE)); //????
		f(n - 1); //??
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m; //??????
		f(n);
		for (i = 1; i <= 9; i++)
		{
			System.out.print(a[i][1]);
			for (j = 2; j <= 9; j++)
			{
				System.out.print(" ");
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

