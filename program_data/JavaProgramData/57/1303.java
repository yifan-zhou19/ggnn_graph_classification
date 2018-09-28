package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] a = new char[50][33];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();
		for (i = 0 ; i < n ; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0 ; i < n ; i++)
		{
			j = String.valueOf(a[i]).length();
			if (a[i][j - 2] == 'e')
			{
				if (a[i][j - 1] == 'r')
				{
					a[i][j - 2] = '\0';
				}
			}
			if (a[i][j - 2] == 'l')
			{
				if (a[i][j - 1] == 'y')
				{
					a[i][j - 2] = '\0';
				}
			}
			if (a[i][j - 3] == 'i')
			{
				if (a[i][j - 2] == 'n' && a[i][j - 1] == 'g')
				{
					a[i][j - 3] = '\0';
				}
			}
			System.out.print(a[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

