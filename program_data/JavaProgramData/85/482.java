package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 1;
		int n;
		int m;
		char[][] a = new char[100][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			if ((a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z') || a[i][0] == '_')
			{
				m = 0;
				for (j = 1;a[i][j] != '\0';j++)
				{
					if ((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || a[i][j] == '_' || (a[i][j] >= '0' && a[i][j] <= '9'))
					{
						continue;
					}
					else
					{
						System.out.print("no\n");
						m = 1;
						break;
					}
				}
				if (m = 1 && j == String.valueOf(a[i]).length())
				{
					System.out.print("yes\n");
				}
			}
			else
			{
				System.out.print("no\n");
			}

		}

	}
}

