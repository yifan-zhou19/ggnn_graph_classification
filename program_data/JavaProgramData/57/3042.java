package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		char[][] p =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = tempVar2.charAt(0);
			}
			j = String.valueOf(p[i]).length();
			if (p[i][j - 1] == 'g')
			{
				p[i][j - 1] = 0;
				p[i][j - 2] = 0;
				p[i][j - 3] = 0;
			}
			if (p[i][j - 1] == 'r')
			{
				p[i][j - 1] = 0;
				p[i][j - 2] = 0;
			}
			if (p[i][j - 1] == 'y')
			{
				p[i][j - 1] = 0;
				p[i][j - 2] = 0;
			}
		}
		for (i = 0;i < m;i++)
		{
			 System.out.printf("%s\n",p[i]);
		}
	}
}

