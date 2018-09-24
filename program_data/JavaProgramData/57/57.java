package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int a;
		char[][] c = new char[20][100];
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
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = String.valueOf(c[i]).length();
			if (c[i][a - 1] == 'r' || c[i][a - 1] == 'y')
			{
				for (j = 0;j < a - 2;j++)
				{
				System.out.printf("%c",c[i][j]);
				}
			}
				System.out.print("\n");
				if (c[i][a - 1] == 'g')
				{
					for (j = 0;j < a - 3;j++)
					{
						System.out.printf("%c",c[i][j]);
					}
				}
					System.out.print("\n");
		}
	}













}

