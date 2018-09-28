package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 0;
		char[][] zf = new char[N][25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			a = 0;
			if ((zf[i][0] >= '0') && (zf[i][0] <= '9'))
			{
				a = 1;
			}
			for (j = 0;j <= (String.valueOf(zf[i]).length() - 1);j++)
			{
				if ((((zf[i][j] >= 'a') && (zf[i][j] <= 'z')) || ((zf[i][j] >= 'A') && (zf[i][j] <= 'Z')) || ((zf[i][j] >= '0') && (zf[i][j] <= '9')) || (zf[i][j] == '_')) == 0)
				{
					a = 1;
				}
			}
			if (a == 0)
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

