package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[51][33];
		int i;
		int n;
		int j;
		int s;
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
			s = String.valueOf(a[i]).length();
			for (j = s - 1;j > 0;j--)
			{
				if (a[i][s - 1] == 'r' && a[i][s - 2] == 'e')
				{
					a[i][j - 1] = '\0';
				}
				else if (a[i][j] == 'y' && a[i][j - 1] == 'l')
				{
					a[i][j - 1] = '\0';
				}
				else if (a[i][j] == 'g' && a[i][j - 1] == 'n' && a[i][j - 2] == 'i')
				{
					a[i][j - 2] = '\0';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
				System.out.printf("%s\n",a[i]);
		}
		return 0;
	}
}

