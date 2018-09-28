package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[MAX][20];
		int i;
		int length;
		int n;
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
			length = String.valueOf(str[i]).length();
			if (str[i][length - 1] == 'g')
			{
				str[i][length - 3] = '\0';
			}
			else
			{
				str[i][length - 2] = '\0';
			}

			System.out.printf("%s\n",str[i]);
		}
		return 0;
	}


}

