package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[51][33];
		int n;
		int[] b = new int[51];
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			b[i] = String.valueOf(a[i]).length();

		}
		for (i = 0;i < n;i++)
		{
			m = b[i];
			if (a[i][m - 3] == 'i' && a[i][m - 2] == 'n' && a[i][m - 1] == 'g')
			{

				m = m - 3;
			}

			if (a[i][m - 2] == 'e' && a[i][m - 1] == 'r')
			{
			m = m - 2;
			}
			if (a[i][m - 2] == 'l' && a[i][m - 1] == 'y')
			{
			m = m - 2;
			}
			for (j = 0;j < m - 1;j++)
			{
					System.out.printf("%c",a[i][j]);
			}
				System.out.printf("%c\n",a[i][m - 1]);


		}

		return 0;
	}

}

