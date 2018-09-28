package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] c = new int[100][100];
		int j;
		int l1;
		int l2;
		int k;
		char l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
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
			l1 = String.valueOf(a[i]).length();
			l2 = String.valueOf(b[i]).length();
			for (j = l1 - 1;j >= l1 - l2;j--)
			{
				if (a[i][j] >= b[i][j - l1 + l2])
				{
					c[i][j] = a[i][j] - b[i][j - l1 + l2];
				}
				else
				{
					c[i][j] = a[i][j] + 10 - b[i][j - l1 + l2];
					a[i][j - 1] = a[i][j - 1] - 1;
				}
			}
			for (j = l1 - l2 - 1;j >= 0;j--)
			{
				if (a[i][j] == 47)
				{
					a[i][j] = a[i][j] + 10;
					a[i][j - 1] = a[i][j - 1] - 1;
				}
			}
			for (j = 0;j < l1 - l2;j++)
			{

				System.out.printf("%d",a[i][j] - 48);
			}
			for (j = l1 - l2;j < l1 - 1;j++)
			{
				System.out.printf("%d",c[i][j]);
			}
			System.out.printf("%d\n",c[i][l1 - 1]);
		}
		return 0;
	}
}

