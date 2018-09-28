package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[100][100];
		int j;
		int i;
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			c[i] = new Scanner(System.in).nextLine();
		a[i] = String.valueOf(c[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (c[i][a[i] - 1] == 'r' || c[i][a[i] - 1] == 'y')
			{
				for (j = 0;j < a[i] - 2;j++)
				{
					System.out.printf("%c",c[i][j]);
				}
			System.out.print("\n");
			}
			else if (c[i][a[i] - 1] == 'g')
			{
				for (j = 0;j < a[i] - 3;j++)
				{
				System.out.printf("%c",c[i][j]);
				}
			System.out.print("\n");
			}
		}

	}
}

