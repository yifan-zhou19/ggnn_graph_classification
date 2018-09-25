package <missing>;

public class GlobalMembers
{
	public static int mat(int[][] a, int m, int n)
	{
		int i;
		int e;
		if (n <= 4 && n >= 0 && m <= 4 && m >= 0)
		{

			for (i = 0;i <= 4;i++)
			{
				e = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = e;


			}
				return 1;
		}
		else
		{
			return 0;
		}

	}
	public static void Main(String[] args)
	{
		int[][] b = new int[5][5];
		int k;
		int l;
		int c;
		int m;
		int n;

		for (k = 0;k <= 4;k++)
		{
			for (l = 0;l <= 4;l++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b[k][l] = Integer.parseInt(tempVar);
				}
			}

		}


		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		c = mat(b, m, n);

		if (c == 0)
		{
			System.out.print("error");
		}

		else if (c == 1)
		{
			for (k = 0;k <= 4;k++)
			{
				for (l = 0;l <= 3;l++)
				{
					System.out.printf("%d ",b[k][l]);
				}

			System.out.printf("%d",b[k][4]);

				System.out.print("\n");
			}
		}

	}

}

