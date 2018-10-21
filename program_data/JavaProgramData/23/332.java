package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int n;
		char[][] a = new char[150][150];
		char b;
		while ((b = System.in.read()) != '\n')
		{
			if (b == ' ')
			{
				a[i][j] = '\0';
				i = i + 1;
				j = 0;
			}

			else
			{
				a[i][j] = b;
				j++;
			}
		}
		a[i][j] = '\0';
		n = i;
		for (i = n; i >= 1; i--)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
			System.out.print(a[0]);
			System.out.print("\n");
		return 0;
	}

}
