package <missing>;

public class GlobalMembers
{
	public static char f(char x)
	{
		if (x == '.')
		{
		return x = '&';
		}
		else
		{
			return x;
		}
	}
	public static int temp(String[] b, int m)
	{
		int i;
		int j;
		int k;
		int k1;
		int num;
		num = b[0].length();
		if (m > 1)
		{
		  for (i = 0;i < num;i++)
		  {
			  for (j = 0;j < num;j++)
			  {
				  if (b[i][j].equals('@'))
				  {
					 if (i > 0 && i < num - 1 && j>0 && j < num - 1)
					 {
						 b[i][j + 1] = f(b[i][j + 1]);
						 b[i][j - 1] = f(b[i][j - 1]);
						 b[i + 1][j] = f(b[i + 1][j]);
						 b[i - 1][j] = f(b[i - 1][j]);
					 }
					 if (i == 0 && j > 0 && j < num - 1)
					 {
						  b[i][j + 1] = f(b[i][j + 1]);
						 b[i][j - 1] = f(b[i][j - 1]);
						 b[i + 1][j] = f(b[i + 1][j]);
					 }
					 if (i == num - 1 && j > 0 && j < num - 1)
					 {
						  b[i][j + 1] = f(b[i][j + 1]);
						 b[i][j - 1] = f(b[i][j - 1]);
						 b[i - 1][j] = f(b[i - 1][j]);
					 }
					 if (j == 0 && i > 0 && i < num - 1)
					 {
						  b[i][j + 1] = f(b[i][j + 1]);
						 b[i + 1][j] = f(b[i + 1][j]);
						 b[i - 1][j] = f(b[i - 1][j]);
					 }
					 if (j == num - 1 && i > 0 && i < num - 1)
					 {
						 b[i][j - 1] = f(b[i][j - 1]);
						 b[i + 1][j] = f(b[i + 1][j]);
						 b[i - 1][j] = f(b[i - 1][j]);
					 }
					 if (i == 0 && j == 0)
					 {
						  b[i][j + 1] = f(b[i][j + 1]);
						 b[i + 1][j] = f(b[i + 1][j]);
					 }
					 if (i == 0 && j == num - 1)
					 {
						  b[i][j - 1] = f(b[i][j - 1]);
						 b[i + 1][j] = f(b[i + 1][j]);
					 }
					 if (i == num - 1 && j == 0)
					 {
						 b[i][j + 1] = f(b[i][j + 1]);
						 b[i - 1][j] = f(b[i - 1][j]);
					 }
					 if (i == num - 1 && j == num - 1)
					 {
						  b[i][j - 1] = f(b[i][j - 1]);
						 b[i - 1][j] = f(b[i - 1][j]);
					 }
				  }
			  }
		  }
		  for (k = 0;k < num;k++)
		  {
			  for (k1 = 0;k1 < num;k1++)
			  {
				  if (b[k][k1].equals('&'))
				  {
					  b[k][k1] = '@';
				  }
			  }
		  }
		}
		if (m == 1)
		{
			return 0;
		}
		temp(b, m - 1);
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int m;
		int count = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		temp(a, m);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		return 0;
	}
}

