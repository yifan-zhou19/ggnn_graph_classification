package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] dc = new char[51][32];
		int n;
		int i;
		int j;
		int[] p = new int[100];
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
				dc[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			j = String.valueOf(dc[i]).length();
				if (dc[i][j - 1] == 'g')
				{
					if (dc[i][j - 2] == 'n')
					{
						if (dc[i][j - 3] == 'i')
						{
						  p[i] = 1;
						}
					}
				}
				else if (dc[i][j - 1] == 'r')
				{
						 if (dc[i][j - 2] == 'e')
						 {
						  p[i] = 2;
						 }
				}
				else if (dc[i][j - 1] == 'y')
				{
						   if (dc[i][j - 2] == 'l')
						   {
							  p[i] = 3;
						   }
				}
				else
				{
					p[i] = 4;
				}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] == 1)
			{
				for (j = 0;j < String.valueOf(dc[i]).length() - 3;j++)
				{
					System.out.printf("%c",dc[i][j]);
				}
				System.out.print("\n");
			}
				else if (p[i] == 2 || p[i] == 3)
				{
				for (j = 0;j < String.valueOf(dc[i]).length() - 2;j++)
				{
					System.out.printf("%c",dc[i][j]);
				}
				System.out.print("\n");
				}
				else if (p[i] == 4)
				{
				for (j = 0;j < String.valueOf(dc[i]).length();j++)
				{
					System.out.printf("%c",dc[i][j]);
				}
				System.out.print("\n");
				}
		}
		return 0;
	}
}

