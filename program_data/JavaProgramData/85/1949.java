package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][20];
		int n;
		int i;
		int test;
		int j;
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
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				test = 1;
				if (j == 0)
				{
					if ((a[i][j] >= 'A' && a[i][j] <= 'Z') || a[i][j] == '_' || (a[i][j] >= 'a' && a[i][j] <= 'z'))
					{
						test = 1;
					}
					else
					{
						test = 0;
						break;
					}
				}
				else if ((a[i][j] >= 'A' && a[i][j] <= 'Z') || a[i][j] == '_' || (a[i][j] >= '0' && a[i][j] <= '9') || (a[i][j] >= 'a' && a[i][j] <= 'z'))
				{
					test = 1;
				}
				else
				{
					test = 0;
					break;
				}
			}
			if (test == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}

}

