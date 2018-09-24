package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int i;
		int j;
		int[] length = new int[60];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j < 50;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a[i][j] = tempVar2.charAt(0);
				}
				if (a[i][j] == '\n')
				{
					a[i][j] = 0;
					length[i] = j - 1;
					break;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i][length[i]] == 'r' && a[i][length[i] - 1] == 'e')
			{
				for (j = 0;j <= length[i] - 2;j++)
				{
					System.out.printf("%c", a[i][j]);
				}
				System.out.print("\n");
				continue;
			}
			if (a[i][length[i]] == 'y' && a[i][length[i] - 1] == 'l')
			{
				for (j = 0;j <= length[i] - 2;j++)
				{
					System.out.printf("%c", a[i][j]);
				}
				System.out.print("\n");
				continue;
			}
			if (a[i][length[i]] == 'g' && a[i][length[i] - 1] == 'n' && a[i][length[i] - 2] == 'i')
			{
				for (j = 0;j <= length[i] - 3;j++)
				{
					System.out.printf("%c", a[i][j]);
				}
				System.out.print("\n");
				continue;
			}
		}
		return 0;
	}

}

