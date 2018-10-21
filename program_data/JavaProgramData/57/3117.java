package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[51][10];
		int n;
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
				str[i] = tempVar2.charAt(0);
			}
			if (str[i][String.valueOf(str[i]).length() - 1] == 'y' || str[i][String.valueOf(str[i]).length() - 1] == 'r')
			{
				str[i][String.valueOf(str[i]).length() - 2] = '\0';
			}
			else
			{
				str[i][String.valueOf(str[i]).length() - 3] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str[i]);
		}
	}

}

