package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		char[][] s = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			s[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (s[i][j] == '.')
		{
			a[i][j] = 1;
		}
		if (s[i][j] == '#')
		{
			a[i][j] = 0;
		}
		if (s[i][j] == '@')
		{
			a[i][j] = -1;
		}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < m;i++)
		{
			for (j = 1;j <= n;j++)
			{
			for (k = 1;k <= n;k++)
			{
			if (a[k][j] == -1)
			{
				b[k][j] = 1;
			}
			}
			}
		 for (j = 1;j <= n;j++)
		 {
			for (k = 1;k <= n;k++)
			{
			if (b[k][j] == 1)
			{
			if (a[k][j - 1] == 1)
			{
				a[k][j - 1] = -1;
			}
		  if (a[k][j + 1] == 1)
		  {
			  a[k][j + 1] = -1;
		  }
		  if (a[k + 1][j] == 1)
		  {
			  a[k + 1][j] = -1;
		  }
		  if (a[k - 1][j] == 1)
		  {
			  a[k - 1][j] = -1;
		  }
			}
			}
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		}
		m = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			if (a[i][j] == -1)
			{
				m++;
			}
			}
		}
		System.out.print(m);
		return 0;
	}

}

