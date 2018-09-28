package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int n;
		int i;
		int j;
		char[][] a = new char[100][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
			for (i = 0;i < t;i++)
			{
				n = String.valueOf(a[i]).length();
			if ((a[i][n - 2] == 'e' && a[i][n - 1] == 'r') || (a[i][n - 2] == 'l' && a[i][n - 1] == 'y'))
			{
				for (j = 0;j < n - 2;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
			}
			if (a[i][n - 3] == 'i' && a[i][n - 2] == 'n' && a[i][n - 1] == 'g')
			{
				for (j = 0;j < n - 3;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
			}
			System.out.print("\n");
			}

	}


}

