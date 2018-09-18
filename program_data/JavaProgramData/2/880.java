package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][27];
		char x;
		int m;
		int i;
		int j;
		int k;
		int[] b = new int[1000];
		int[] c = new int[26];
		int max = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len = String.valueOf(a[i]).length();
			for (j = 0;j < len;j++)
			{
				c[a[i][j] - 'A']++;
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (max < c[j])
			{
				max = c[j];
				x = 'A' + j;
			}
		}

		System.out.print(x);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (i = 0;i < m;i++)
		{
			int len = String.valueOf(a[i]).length();
			for (k = 0;k < len;k++)
			{
				if (a[i][k] == x)
				{
					System.out.print(b[i]);
					System.out.print("\n");
					break;
				}
			}
		}

	return 0;
	}

}

