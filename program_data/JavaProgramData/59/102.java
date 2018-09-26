package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[128][128];
		char[][] b = new char[128][128];
		int n;
		int i;
		int j;
		int day;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		   for (j = 1;j <= n;j++)
		   {
		   a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   }
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day--;
		while (day != 0)
		{
		  day--;
		  for (i = 1;i <= n;i++)
		  {
			for (j = 1;j <= n;j++)
			{
			if (a[i][j] == '@')
			{
			  if (a[i - 1][j] == '.')
			  {
				  b[i - 1][j] = '@';
			  }
			  if (a[i + 1][j] == '.')
			  {
				  b[i + 1][j] = '@';
			  }
			  if (a[i][j - 1] == '.')
			  {
				  b[i][j - 1] = '@';
			  }
			  if (a[i][j + 1] == '.')
			  {
				  b[i][j + 1] = '@';
			  }
			}
			}
		  }
		  for (i = 1;i <= n;i++)
		  {
			for (j = 1;j <= n;j++)
			{
			if (b[i][j] == '@')
			{
				a[i][j] = '@';
			}
			}
		  }
		}
		for (i = 1;i <= n;i++)
		{
		   for (j = 1;j <= n;j++)
		   {
		   if (a[i][j] == '@')
		   {
			   count++;
		   }
		   }
		}
		System.out.print(count);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

