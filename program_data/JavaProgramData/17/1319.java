package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int c;
		int d;
		int e;
		int f;
		int g;
		int k;
		int j;
		int l;
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[1000][150];
		char[][] h = new char[1000][150];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			b[i] = String.valueOf(a[i]).length();
			e = 0;
			for (j = 0;j < b[i];j++)
			{
				if (a[i][j] == '(')
				{
					h[i][j] = '$';
					e++;
				}
				if (a[i][j] == ')')
				{
					h[i][j] = '?';
				}
				if (a[i][j] != '(' && a[i][j] != ')')
				{
					h[i][j] = ' ';
				}
			}
			for (l = 0;l < e;l++)
			{
				for (j = 0;j < b[i];j++)
				{
					c = f = d = -1;
					if (h[i][j] == '$')
					{
						c = j;
						g = c;
						for (g = c;g < b[i];g++)
						{
							if (h[i][g] == '?')
							{
								f = g;
								break;
							}
						}
						for (k = f - 1;k >= c;k--)
						{
							if (h[i][k] == '$')
							{
								d = k;
								break;
							}
						}
						if (d != -1 && f != -1)
						{
							h[i][d] = ' ';
							h[i][f] = ' ';
						}
						break;
					}
				}
			}
			for (j = 0;j < b[i];j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.print("\n");
			for (j = 0;j < b[i];j++)
			{
				System.out.printf("%c",h[i][j]);
			}
			System.out.print("\n");

		}
		return 0;
	}
}

