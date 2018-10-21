package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
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
			if ((a[i][0] >= 65 && a[i][0] <= 90) || a[i][0] == 95 || (a[i][0] >= 97 && a[i][0] <= 122))
			{
				for (j = 1;j < 21 && a[i][j] != '\0';j++)
				{
					if ((a[i][j] >= 48 && a[i][j] <= 57) || (a[i][j] >= 65 && a[i][j] <= 90) || a[i][j] == 95 || (a[i][j] >= 97 && a[i][j] <= 122))
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if (a[i][j] == '\0')
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}

}

