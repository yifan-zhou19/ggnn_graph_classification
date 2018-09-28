package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int b;
		int c;
		int n;
		int i;
		int j;
		int k;
		char[][] a = new char[1000][30];
		String w = new String(new char[100]);
		w = new Scanner(System.in).nextLine();
		n = Integer.parseInt(w);
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			x = 1;
			if ((a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z') || a[i][0] == '_')
			{
				1;
			}
			else
			{
				x = 0;
			}
				for (j = 0;a[i][j] != '\0';j++)
				{
					if ((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || a[i][j] == '_' || (a[i][j] >= '0' && a[i][j] <= '9'))
					{
						1;
					}
					else
					{
						x = 0;
					}
				}
				if (x == 1)
				{
					System.out.print("yes\n");
				}
				else
				{
						System.out.print("no\n");
				}
		}

		return 0;
	}
}
