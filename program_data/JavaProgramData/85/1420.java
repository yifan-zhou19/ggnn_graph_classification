package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][21];
		int i;
		int n;
		int j;
		int b;
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
			b = String.valueOf(a[i]).length();
			for (j = 0;j < b;j++)
			{
				if (!((a[i][j] == '_') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= '0' && a[i][j] <= '9' && j != 0)))
				{
					a[i][0] = 'n';
					a[i][1] = 'o';
					a[i][2] = '\0';
					break;
				}

			}


		}
		for (i = 0;i < n;i++)
		{
		if (strcmp(a[i],"no") != 0)
		{
			a[i][0] = 'y';
			a[i][1] = 'e';
			a[i][2] = 's';
			a[i][3] = '\0';
		}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
		return 0;
	}


}

