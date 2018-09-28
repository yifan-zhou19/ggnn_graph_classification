package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int i;
			int j;
			int k;
			int l;
			int tem;
		char[][] a = new char[100][1000];
		char[][] b = new char[100][1000];
		int[][] c = new int[100][1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			System.in.read();
			cin.get(a[i],900);
			System.in.read();
			cin.get(b[i],900);
			System.in.read();
			for (j = String.valueOf(a[i]).length() - 1;j >= String.valueOf(a[i]).length() - String.valueOf(b[i]).length();j--)
			{
				c[i][j] = a[i][j] - b[i][j - String.valueOf(a[i]).length() + String.valueOf(b[i]).length()];
				if (c[i][j] < 0)
				{
					c[i][j] = c[i][j] + 10;
					a[i][j - 1] = a[i][j - 1] - 1;
				}
			}
			for (j >= String.valueOf(a[i]).length() - String.valueOf(b[i]).length() - 1;j >= 0;j--)
			{
				c[i][j] = a[i][j] - '0';
			}
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				if (c[i][j] != 0)
				{
					tem = j;
					break;
				}
			}
			for (j = tem;j < String.valueOf(a[i]).length();j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
	}

}

