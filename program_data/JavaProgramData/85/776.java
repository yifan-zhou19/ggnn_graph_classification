package <missing>;

public class GlobalMembers
{
	public static int decide(char k)
	{
		if ((Character.isDigit(k) == 0) && (Character.isLetter(k) == 0) && (k != 95))
		{
			return 0;
		}
		else
		{
			if (Character.isDigit(k) == 1)
			{
				return 2;
			}
			else
			{
				return 1;
			}
		}
	}


	public static int Main()
	{
		int n;
		int j;
		int m;
		int i;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			m = String.valueOf(a[i]).length();
			if (decide(a[i][0]) != 1)
			{
				System.out.print("no\n");
				continue;
			}
			else
			{
				j = 1;
				while (j < m)
				{
					if (decide(a[i][j]) == 0)
					{
						j = m + 2;
					}
					else
					{
						j = j + 1;
					}
				}
				if (j == m)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
		}
	return 0;
	}
}

