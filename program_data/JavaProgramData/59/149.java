package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int m = 0;
	public static final String a = "";
	public static int[][] b = new int[100][100];
	public static int[][] c = new int[100][100];
	public static void find()
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				c[i][j] = b[i][j];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i][j] == 2)
				{
					c[i][j] = 2;
					if (b[i + 1][j] == 1)
					{
						c[i + 1][j] = 2;
					}
					if (b[i - 1][j] == 1)
					{
						c[i - 1][j] = 2;
					}
					if (b[i][j + 1] == 1)
					{
						c[i][j + 1] = 2;
					}
					if (b[i][j - 1] == 1)
					{
						c[i][j - 1] = 2;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = c[i][j];
			}
		}

	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		for (i = 0;i < n;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a.charAt(i)[j] == '.')
				{
					b[i][j] = 1;
				}
				if (a.charAt(i)[j] == '@')
				{
					b[i][j] = 2;
				}
			}
		}
			//for(i=0;i<n;i++){			for(j=0;j<n;j++)cout<<b[i][j];cout<<endl;}
		int m = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < m;i++)
		{
			find();
		}
		int num = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i][j] == 2)
				{
					num++;
				}
			}
		}
		System.out.print(num);


		 return 0;
	}
}

