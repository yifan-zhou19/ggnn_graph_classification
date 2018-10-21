package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[10][100];
		char[][] b = new char[10][100];
		int i;
		int j;
		int m = 0;
		int n;
		int[] lena = new int[10];
		int[] lenb = new int[10];
		int[][] a1 = new int[10][100];
		int[][] b1 = new int[10][100];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			System.out.print("\n");
			lena[i] = String.valueOf(a[i]).length();
			lenb[i] = String.valueOf(b[i]).length();
			for (j = lena[i] - 1;j >= 0;j--)
			{
				a1[i][m] = a[i][j] - '0';
				m++;
			}
			m = 0;
			for (j = lenb[i] - 1;j >= 0;j--)
			{
				b1[i][m] = b[i][j] - '0';
				m++;
			}
			m = 0;
			for (j = 0;j < lena[i];j++)
			{
				a1[i][j] = a1[i][j] - b1[i][j];
				if (a1[i][j] < 0)
				{
					a1[i][j] = a1[i][j] + 10;
					a1[i][j + 1] = a1[i][j + 1] - 1;
				}
			}

			for (j = lena[i] - 1;j >= 0;j--)
			{
				System.out.printf("%d",a1[i][j]);
			}
			System.out.print("\n");
		}
	}

}

