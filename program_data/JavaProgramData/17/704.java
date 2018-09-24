package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][101];
		char[][] b = new char[100][101];
		char c = '(';
		char d = ')';
		int i;
		int j;
		int k;
		for (k = 0;k <= 20;k++)
		{
			for (i = 0;i < 101;i++)
			{
				a[k][i] = 0;
			}
			a[k] = new Scanner(System.in).nextLine();
			b[k] = a[k];
			for (i = 0;i < 101 && a[k][i] != 0;i++)
			{
				 if (a[k][i] == d)
				 {
					 for (j = i - 1;j >= 0;j--)
					 {
						 if (a[k][j] == c)
						 {
						 a[k][i] = a[k][j] = 1;
						 break;
						 }
					 }
				 }
			}
			for (i = 0;i < 101 && b[k][i] != 0;i++)
			{
				System.out.printf("%c",b[k][i]);
			}
			System.out.print("\n");
			for (i = 0;i < 101 && a[k][i] != 0;i++)
			{
				if (a[k][i] == c)
				{
					System.out.print("$");
				}
				else if (a[k][i] == d)
				{
					System.out.print("?");
				}
					 else
					 {
						 System.out.print(" ");
					 }
			}
			System.out.print("\n");
		}
		return 0;
	}

}
