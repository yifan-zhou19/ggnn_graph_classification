package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i = 0;
		char[][] wod = new char[ROW][LEN];

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
				wod[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(wod[i]).length();
			if (wod[i][len - 1] == 'r')
			{
				wod[i][len - 2] = '\0';
			}
			else if (wod[i][len - 1] == 'y')
			{
				wod[i][len - 2] = '\0';
			}
			else if (wod[i][len - 1] == 'g')
			{
				wod[i][len - 3] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",wod[i]);
		}
		return 0;
	}
}

