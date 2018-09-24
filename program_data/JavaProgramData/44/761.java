package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			l = String.valueOf(a[i]).length();
			if (a[i][0] != '-')
			{
				for (j = 0;j < l;j++)
				{
					b[i][l - 1 - j] = a[i][j];
				}
				for (j = 0;j < l;j++)
				{
					if (b[i][j] != 48)
					{
						k = j;
					break;
					}
				}
				for (j = k;j < l;j++)
				{
					System.out.printf("%c",b[i][j]);
				}
			}
			if ((a[i][0] == '-' && a[i][1] == 48) || a[i][0] == 48)
			{
				System.out.print("0");
			}
			if (a[i][0] == '-')
			{
				for (j = 1;j < l;j++)
				{
					b[i][l - j] = a[i][j];
				}
				for (j = 1;j < l;j++)
				{
					if (b[i][j] != 48)
					{
						k = j;
						break;
					}
				}
				System.out.print("-");
				for (j = k;j < l;j++)
				{
					System.out.printf("%c",b[i][j]);
				}

			}
			System.out.print("\n");
		}
		return 0;
	}
}

