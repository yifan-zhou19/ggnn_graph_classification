package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			System.out.print("\n");
		}
		for (i = 0;i < n;i++)
		{
			t = String.valueOf(a[i]).length();
			if (a[i][t - 1] == 'r' && a[i][t - 2] == 'e')
			{
		for (j = 0;j < t - 2;j++)
		{
			System.out.printf("%c",a[i][j]);
		}
		System.out.print("\n");
			}
			else if (a[i][t - 1] == 'y' && a[i][t - 2] == 'l')
			{
			for (j = 0;j < t - 2;j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.print("\n");
			}
			else if (a[i][t - 1] == 'g' && a[i][t - 2] == 'n' && a[i][t - 3] == 'i')
			{
			for (j = 0;j < t - 3;j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.print("\n");
			}
			else
			{
				for (j = 0;j < t;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
			}
				System.out.print("\n");
		}

		return 0;
	}
}

