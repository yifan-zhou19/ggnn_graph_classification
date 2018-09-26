package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] xi = new char[50][35];
		char[][] y = new char[50][35];
		int n;
		int c;
		int i;
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
				xi[i] = tempVar2.charAt(0);
			}
		}
			for (i = 0;i < n;i++)
			{
				c = String.valueOf(xi[i]).length();
				for (j = 0;xi[i][j] != '\0';j++)
				{
					y[i][j] = xi[i][j];
				}
					if (xi[i][c - 2] == 'l' && xi[i][c - 1] == 'y')
					{
						y[i][c - 2] = '\0';
					}
					if (xi[i][c - 2] == 'e' && xi[i][c - 1] == 'r')
					{
						y[i][c - 2] = '\0';
					}
					if (xi[i][c - 3] == 'i' && xi[i][c - 2] == 'n' && xi[i][c - 1] == 'g')
					{
						y[i][c - 3] = '\0';
					}
					System.out.printf("%s\n",y[i]);
			}
	return 0;
	}

}

