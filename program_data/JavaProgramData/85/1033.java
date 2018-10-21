package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[100][100];
		int m;
		int i;
		int[] a = new int[100];
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			a[i] = 1;
		}
		for (i = 0;i < m;i++)
		{
			c[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(c[i]).length();j++)
			{
				if (c[i][0] != '_' && (c[i][0] < 'A' || c[i][0]>'z' || c[i][0] > 'Z' && c[i][0] < 'a'))
				{
					a[i] = 0;
					break;
				}
				if (c[i][j] != '_' && (c[i][j] < 'A' || c[i][j]>'z' || c[i][j] > 'Z' && c[i][j] < 'a') && (c[i][j] < '0' || c[i][j]>'9'))
				{
					a[i] = 0;
					break;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (a[i] == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print("yes");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

