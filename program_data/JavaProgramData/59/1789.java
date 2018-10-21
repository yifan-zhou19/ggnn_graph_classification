package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n][n];
		for (int i = 0;i < n;i++)
		{
		  for (int j = 0;j < n;j++)
		  {
			a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (a[i][j] == '@')
			{
			s = s + 1;
			}
		  }
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 2;k <= m;k++)
		{
		  for (int i = 0;i < n;i++)
		  {
			for (int j = 0;j < n;j++)
			{
			  if (a[i][j] == '@')
			  {
				if ((j > 0) && (a[i][j - 1] == '.'))
				{
				a[i][j - 1] = 1;
				}
				if ((j < n - 1) && (a[i][j + 1] == '.'))
				{
				a[i][j + 1] = 1;
				}
				if ((i > 0) && (a[i - 1][j] == '.'))
				{
				a[i - 1][j] = 1;
				}
				if ((i < n - 1) && (a[i + 1][j] == '.'))
				{
				a[i + 1][j] = 1; //?????????????1????
				}
			  }
			}
		  }
		  for (int i = 0;i < n;i++)
		  {
			for (int j = 0;j < n;j++)
			{
			  if (a[i][j] == 1)
			  {
				s = s + 1;
				a[i][j] = '@'; //???1?????
			  }
			}
		  }
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}

}

