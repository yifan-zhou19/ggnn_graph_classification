package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int i = 0;
	public static int j = 0;
	public static int t = 0;
		public static char[][] a = new char[100][100];
	public static void number(int x)
	{

		if (x == 1)
		{
			t = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
					t++;
					}
				}
			}
		}
		if (x > 1)
		{
			number(x - 1);
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
				   if (a[i][j] == '@')
				   {
						if (a[i][j + 1] == '.' && j < n - 1)
						{
							a[i][j + 1] = '$';

						}
						if (a[i][j - 1] == '.' && j > 0)
						{
							a[i][j - 1] = '$';
						}
						if (a[i - 1][j] == '.' && i > 0)
						{
							  a[i - 1][j] = '$';
						}
						 if (a[i + 1][j] == '.' && i < n - 1)
						 {
							   a[i + 1][j] = '$';
						 }


				   }
				}
			}
			t = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '$')
					{
					a[i][j] = '@';
					}
					if (a[i][j] == '@' || a[i][j] == '$')
					{
					t++;
					}
				}
			}

		}
	}

	public static int Main()
	{


		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			 a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 number(m);
		 System.out.print(t);
		 System.out.print("\n");
		  return 0;
	}


}

