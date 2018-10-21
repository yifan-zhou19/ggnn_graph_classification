package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
		for (int j = 1;j <= n;j++)
		{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = '0';
		}
		}
		int m;
		int N = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m--;
		while (m-- != 0)
		{
				  for (int i = 1;i <= n;i++)
				  {
				  for (int j = 1;j <= n;j++)
				  {
				  b[i][j] = a[i][j];
				  }
				  }
				  for (int i = 1;i <= n;i++)
				  {
				  for (int j = 1;j <= n;j++)
				  {
						  if (b[i][j] == '.' && (b[i + 1][j] == '@' || b[i - 1][j] == '@' || b[i][j + 1] == '@' || b[i][j - 1] == '@'))
						  {
						  a[i][j] = '@';
						  }
				  }
				  }
		}
		for (int i = 1;i <= n;i++)
		{
		for (int j = 1;j <= n;j++)
		{
				if (a[i][j] == '@')
				{
				N++;
				}
		}
		}
		System.out.print(N);
		System.out.print("\n");
		return 0;
	}


}

