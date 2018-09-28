package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[10][100];
		char[][] b = new char[10][100];
		int i;
		int j;
		int n;
		int k;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n - 1;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			b[i] = new Scanner(System.in).nextLine();
			System.in.read();
		}
		a[n - 1] = new Scanner(System.in).nextLine();
		b[n - 1] = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			k = String.valueOf(a[i]).length();
			l = String.valueOf(b[i]).length();
			for (j = 0;j < l;j++)
			{
				if (a[i][k - j - 1] < b[i][l - j - 1])
				{
					a[i][k - j - 1] = a[i][k - j - 1] + 10 - b[i][l - j - 1] + '1' - 1;
					a[i][k - j - 2]--;
				}
				else
				{
					a[i][k - j - 1] = a[i][k - j - 1] - b[i][l - j - 1] + '1' - 1;
				}
			}
			for (j = 0;j < k;j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.print("\n");
		}
	}

}

