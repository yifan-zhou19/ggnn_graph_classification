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
		char[][] suoyou = new char[1000][256];
		int i = 0;
		for (i = 0;i < n + 1;i++)
		{
			suoyou[i] = new Scanner(System.in).nextLine();
		}
		int k = 0;
		for (i = 0;i < n + 1;i++)
		{
			for (k = 0;k < String.valueOf(suoyou[i]).length();k++)
			{
				if (suoyou[i][k] == 65)
				{
					suoyou[i][k] = 84;
				}
				else if (suoyou[i][k] == 84)
				{
					suoyou[i][k] = 65;
				}
				else if (suoyou[i][k] == 67)
				{
					suoyou[i][k] = 71;
				}
				else
				{
					suoyou[i][k] = 67;
				}
			}
		}
		for (i = 0;i < n + 1;i++)
		{
			System.out.printf("%s\n",suoyou[i]);
		}
		return 0;
	}
}

