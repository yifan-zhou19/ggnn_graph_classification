package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i <= n;i++)
		{
			j = String.valueOf(a[i]).length();
			if (a[i][j - 3] == 'i' && a[i][j - 2] == 'n' && a[i][j - 1] == 'g')
			{
				for (k = 0;k < j - 3;k++)
				{
					System.out.printf("%c",a[i][k]);
				}
			}
			else if ((a[i][j - 2] == 'e' && a[i][j - 1] == 'r') || (a[i][j - 2] == 'l' && a[i][j - 1] == 'y'))
			{
					for (k = 0;k < j - 2;k++)
					{
						 System.out.printf("%c",a[i][k]);
					}
			}
			else
			{
				System.out.println(a[i]);
			}
			System.out.print("\n");

		}
	}
}

