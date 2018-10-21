package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][100];
		int n;
		int i;
		int j;
		int a;
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
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = String.valueOf(str[i]).length();
		if (str[i][a - 2] == 'e' && str[i][a - 1] == 'r')
		{
			for (j = 0;j < a - 2;j++)
			{
		System.out.printf("%c",str[i][j]);
			}
		}
		else if (str[i][a - 2] == 'l' && str[i][a - 1] == 'y')
		{
			for (j = 0;j < a - 2;j++)
			{
		System.out.printf("%c",str[i][j]);
			}
		}
		else
		{
			for (j = 0;j < a - 3;j++)
			{
		System.out.printf("%c",str[i][j]);
			}
		}
		System.out.print("\n");
		}
		return 0;
	}
}

