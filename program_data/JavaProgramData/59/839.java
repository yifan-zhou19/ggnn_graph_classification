package <missing>;

public class GlobalMembers
{
	public static void virus(String[] a, int n)
	{
		 char[][] b = new char[100][100];
		 for (int i = 1;i <= n;i++)
		 {
				 for (int j = 1;j <= n;j++)
				 {
						  b[i][j] = a[i][j];
				 }
		 } //??????????????????
		 for (int i = 1;i <= n;i++)
		 {
			   for (int j = 1;j <= n;j++)
			   {
					  if (a[i][j].equals('@') && a[i][j - 1].equals('.'))
					  {
						   b[i][j - 1] = '@';
					  }
					  if (a[i][j].equals('@') && a[i][j + 1].equals('.'))
					  {

						   b[i][j + 1] = '@';
					  }
					  if (a[i][j].equals('@') && a[i - 1][j].equals('.'))
					  {

						   b[i - 1][j] = '@';
					  }
					  if (a[i][j].equals('@') && a[i + 1][j].equals('.'))
					  {

						   b[i + 1][j] = '@';
					  } //????????????
			   }
		 }
		 for (int i = 1;i <= n;i++)
		 {
			  for (int j = 1;j <= n;j++)
			  {
					   a[i][j] = b[i][j];
			  }
		 } //????????????
	}
	public static int Main()
	{
		int n;
		int m;
		int j;
		int i;
		int sum = 0;
		char[][] a = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				 a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < m;i++)
		{
			 virus(a, n);
		} //??????
		for (i = 1;i <= n;i++)
		{
			 for (j = 1;j <= n;j++)
			 {
					if (a[i][j] == '@')
					{
						 sum++;
					}
			 }
		}
		System.out.print(sum);

		return 0;
	}

}

