package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[30][100];
		char[][] b = new char[30][100];
		char[][] c = new char[30][100];
		int n;
		int i;
		int j;
		int[] p = new int[100];
		int[] q = new int[100];
		int[][] alpha = new int[30][100];
		int[][] beta = new int[30][100];
		int[][] gama = new int[30][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			for (j = 0;a[i][j] != '\0';j++)
			{
				;
			}
			p[i] = j;
			for (j = 0;b[i][j] != '\0';j++)
			{
				;
			}
			q[i] = j;
			for (j = 0;j < p[i];j++)
			{
				alpha[i][j] = a[i][p[i] - 1 - j] - 48;
			}
			for (j = 0;j < q[i];j++)
			{
				beta[i][j] = b[i][q[i] - 1 - j] - 48;
			}
			for (j = q[i];j < p[i];j++)
			{
				beta[i][j] = 0;
			}
			for (j = 0;j < p[i];j++)
			{
				gama[i][j] = alpha[i][j] - beta[i][j];
				if (gama[i][j] < 0)
				{
					gama[i][j] += 10;
					alpha[i][j + 1] -= 1;
				}
			}
			for (j = 0;j < p[i];j++)
			{
				c[i][j] = gama[i][p[i] - 1 - j] + 48;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;c[i][j] == '0';j++)
			{
				;
			}
			for (;j < p[i];j++)
			{
				System.out.printf("%c",c[i][j]);
			}
			System.out.print("\n");
		}
	}
}

