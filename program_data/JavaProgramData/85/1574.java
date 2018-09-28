package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int d;
		char[][] a = new char[100][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (int k = 0;k < n;k++)
		{
			for (int j = 0;j < ' ';j++)
			{
				d = String.valueOf(a[k]).length();
				if ((a[k][j] >= 'a' && a[k][j] <= 'z') || (a[k][j] >= '0' && a[k][j] <= '9') || (a[k][j] == '_') || (a[k][j] >= 'A' && a[k][j] <= 'Z') || a[k][j] == '0')
				{
					if (j == 0)
					{
						if (a[k][j] >= '0' && a[k][j] <= '9')
						{
							System.out.print("no\n");
							break;
						}
					}
				}
				else
				{
					System.out.print("no\n");
					break;
				}
			if (j == d - 1)
			{
				   System.out.print("yes\n");
				   break;
			}
			}
		}
		return 0;
	}
}

