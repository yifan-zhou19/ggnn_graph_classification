package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] a = new char[50][20];
		int[] b = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 50;i++)
		{
			for (j = 0;j < 20;j++)
			{
				a[i][j] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a[i][j] = tempVar2.charAt(0);
				}
				if (a[i][j] == '\n')
				{
					break;
				}
			}
			b[i] = j;
		}

		for (i = 0;i < n;i++)
		{
				if (a[i][b[i] - 1] == 'r')
				{
					for (j = 0;j < b[i] - 2;j++)
					{
					  System.out.printf("%c",a[i][j]);
					}
					System.out.print("\n");
				}
				else
				{
					if (a[i][b[i] - 1] == 'y')
					{
						for (j = 0;j < b[i] - 2;j++)
						{
						   System.out.printf("%c",a[i][j]);
						}
						System.out.print("\n");
					}
					else
					{
						  if (a[i][b[i] - 1] == 'g')
						  {
								for (j = 0;j < b[i] - 3;j++)
								{
								  System.out.printf("%c",a[i][j]);
								}
								System.out.print("\n");
						  }
					}
				}
		}
		return 0;
	}
}

