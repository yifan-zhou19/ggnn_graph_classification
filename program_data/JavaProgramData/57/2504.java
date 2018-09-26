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
		char[][] suoyou = new char[53][35];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				suoyou[i] = tempVar2.charAt(0);
			}
			if (suoyou[i][String.valueOf(suoyou[i]).length() - 1] == 'r')
			{
				suoyou[i][String.valueOf(suoyou[i]).length() - 2] = '\0';
			}
			else if (suoyou[i][String.valueOf(suoyou[i]).length() - 1] == 'y')
			{
				suoyou[i][String.valueOf(suoyou[i]).length() - 2] = '\0';
			}
			else if (suoyou[i][String.valueOf(suoyou[i]).length() - 1] == 'g')
			{
				suoyou[i][String.valueOf(suoyou[i]).length() - 3] = '\0';
			}
			System.out.printf("%s\n",suoyou[i]);
		}
		return 0;
	}
}

