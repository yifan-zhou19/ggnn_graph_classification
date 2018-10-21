package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[50][20];
		int a;
		int i;
		int j;
		int n;
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
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			a = String.valueOf(str[i]).length();
			if (str[i][a - 1] == 'r')
			{
				for (j = 0;j <= a - 3;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
			}
			else if (str[i][a - 1] == 'y')
			{
				for (j = 0;j <= a - 3;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
			}
			else
			{
				for (j = 0;j <= a - 4;j++)
				{
					System.out.printf("%c",str[i][j]);
				}
			}
			System.out.print("\n");
		}
	}
}

