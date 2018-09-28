package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[20][20];
		int n;
		int i;
		int j;
		int l;
		int[] result = new int[20];
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
			l = String.valueOf(a[i]).length();
			if ((a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] == '_'))
			{
				for (j = 1;j < l;j++)
				{
					 if (!((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= '0' && a[i][j] <= '9') || (a[i][j] == '_')))
					 {
						result[i] = 0;
						break;
					 }
					if (j == l - 1)
					{
						if ((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= '0' && a[i][j] <= '9') || (a[i][j] == '_'))
						{
							result[i] = 1;
						}
						else
						{
							result[i] = 0;
						}
					}
				}
			}
			else
			{
				result[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (result[i] == 0)
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

