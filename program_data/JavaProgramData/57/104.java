package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int len;
		char[][] str = new char[50][15];
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
			len = String.valueOf(str[i]).length();
			if (str[i][len - 1] == 'g')
			{
				str[i][len - 3] = '\0';
			}
			else if (str[i][len - 1] == 'y' || str[i][len - 1] == 'r')
			{
				str[i][len - 2] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str[i]);
		}
	}



}

