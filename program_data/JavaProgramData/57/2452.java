package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int l;
		int pd = 1;
		char[][] jj = new char[51][33];
		char[][] jjsc = new char[51][33];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
	for (i = 0;i < a;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jj[i] = tempVar2.charAt(0);
			}
			l = String.valueOf(jj[i]).length();
			if (jj[i][l - 1] == 'g')
			{
				for (j = 0;j < l - 3;j++)
				{
					jjsc[i][j] = jj[i][j];
				}
				jjsc[i][l - 3] = '\0';
			}
			else if (jj[i][l - 1] == 'r')
			{
				for (j = 0;j < l - 2;j++)
				{
					jjsc[i][j] = jj[i][j];
				}
				jjsc[i][l - 2] = '\0';
			}
			else if (jj[i][l - 1] == 'y')
			{
				for (j = 0;j < l - 2;j++)
				{
					jjsc[i][j] = jj[i][j];
				}
				jjsc[i][l - 2] = '\0';
			}
	}
	for (i = 0;i < a;i++)
	{
		System.out.printf("%s\n",jjsc[i]);
	}
		return 0;
	}
}

