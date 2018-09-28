package <missing>;

public class GlobalMembers
{
	public static void f(int step)
	{
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
			if (b[i][j] <= step + 1 && b[i][j]>0)
			{
				if (b[i - 1][j] == -1)
				{
					b[i - 1][j] = b[i][j] + 1;
				}
				if (b[i + 1][j] == -1)
				{
					b[i + 1][j] = b[i][j] + 1;
				}
				if (b[i][j - 1] == -1)
				{
					b[i][j - 1] = b[i][j] + 1;
				}
				if (b[i][j + 1] == -1)
				{
					b[i][j + 1] = b[i][j] + 1;
				}
			}
			}
		}
			//for(int i= 1;i<=n;i++){for(int j= 1;j<=n;j++)cout<<b[i][j]<<"   ";cout<<endl;}cout<<endl;
	}
	public static int n;
	public static int m;
	public static char[][] a = new char[102][102];
	public static int[][] b = new int[102][102];
	public static int Main()
	{

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1;i <= n;i++)
	{
		for (int j = 1;j <= n;j++)
		{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					b[i][j] = 1;
				}
				if (a[i][j] == '.')
				{
					b[i][j] = -1;
				}
		}
	}
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (int i = 0;i < m - 1;i++)
	{
		f(i);
	}
		int temp = 0;
	for (int i = 1;i <= n;i++)
	{
		for (int j = 1;j <= n;j++)
		{
			if (b[i][j] > 0)
			{
				temp++;
			}
		}
	}
	System.out.print(temp);
	System.in.read();
	System.in.read();
	return 0;
	}

}

