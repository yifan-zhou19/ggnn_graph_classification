package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[150][80];
		int n;
		int i;
		int j;
		int len_a;
		int g;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			if ((a[i][0] == '_') || (a[i][0] >= 'A') && (a[i][0] <= 'Z') || (a[i][0] >= 'a') && (a[i][0] <= 'z'))
			{
				g = 0;
				len_a = String.valueOf(a[i]).length();
				for (j = 1;j < len_a;j++)
				{
					if ((a[i][j] == '_') || (a[i][j] >= 'A') && (a[i][j] <= 'Z') || (a[i][j] >= 'a') && (a[i][j] <= 'z') || (a[i][j] >= '0') && (a[i][j] <= '9'))
					{
						continue;
					}
					else
					{
						g = 1;
						break;
					}
				}
				if (g == 0)
				{
					System.out.print(1);
					System.out.print("\n");
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

