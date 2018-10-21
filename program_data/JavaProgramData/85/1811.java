package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[20][21];
		int j;
		int i;
		int n;
		int b;
		int m;
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
			m = 0;
			for (j = 0;a[i][j];j++)
			{
		if (!((a[i][j] == '_') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= '0' && a[i][j] <= '9' && j>0)))
		{
						m = 1;
		}
			}
				if (m == 0)
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

