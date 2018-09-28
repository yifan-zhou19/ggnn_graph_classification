package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] b = new int[100];
		char[][] a = new char[100][80];
		for (i = 0;i < 100;i++)
		{
			b[i] = 80;
		}
		for (i = 0;i < 80;i++)
		{
			for (j = 0;j < 80;j++)
			{
				a[i][j] = '\0';
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 80;j++)
			{
				cin.get(a[i][j]);
				if (a[i][j] == 10)
				{
					b[i] = j;
					break;
				}
				if (j == 79)
				{
					System.in.read();
				}
			}
			if (!((a[i][0] >= 65 && a[i][0] <= 90) || (a[i][0] >= 97 && a[i][0] <= 122) || a[i][0] == 95))
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else if ((b[i] == 1) && ((a[i][0] >= 65 && a[i][0] <= 90) || (a[i][0] >= 97 && a[i][0] <= 122) || a[i][0] == 95))
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j < b[i];j++)
				{
					if (!((a[i][j] >= 48 && a[i][j] <= 57) || (a[i][j] >= 65 && a[i][j] <= 90) || (a[i][j] >= 97 && a[i][j] <= 122) || a[i][j] == 95))
					{
						System.out.print(0);
						System.out.print("\n");
						break;
					}
					if (j == b[i] - 1)
					{
						System.out.print(1);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

