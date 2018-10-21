package <missing>;

public class GlobalMembers
{
	public static int matf(int[] mat, int n, int m)
	{
		int temp;
		int i;

		 if (!(n >= 0 && n <= 4 && m >= 0 && m <= 4))
		 {
			return 0;
		 }
		else
		{
			for (i = 0;i < 5;i++)
			{
				temp = (mat[n] + i);
				*(mat[n] + i) = *(mat[m] + i);
				*(mat[m] + i) = temp;
			}
			return 1;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int[][] mat = new int[5][5];
		int n;
		int m;
		int p;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(mat + i) + j = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		p = matf(mat, n, m);
		if (p == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d%c",*(*(mat + i) + j),(j != 4)?' ':'\n');
				}
			}
		}
		return 0;
	}
}

