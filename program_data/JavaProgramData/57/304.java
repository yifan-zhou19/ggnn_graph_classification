package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] string = new char[100][20];
		int i;
		int j;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				string[i] = tempVar2.charAt(0);
			}
		}
		int length;
		for (i = 0;i <= n - 1;i++)
		{
			length = String.valueOf(String[i]).length();
			if (String[i][length - 2] == 'e' && string[i][length - 1] == 'r')
			{
				for (j = 0;j <= length - 3;j++)
				{
					System.out.printf("%c",string[i][j]);
				}
				System.out.print("\n");
			}
			else if (String[i][length - 2] == 'l' && string[i][length - 1] == 'y')
			{
				for (j = 0;j <= length - 3;j++)
				{
					System.out.printf("%c",string[i][j]);
				}
				System.out.print("\n");
			}
			else
			{
				for (j = 0;j <= length - 4;j++)
				{
					System.out.printf("%c",string[i][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

