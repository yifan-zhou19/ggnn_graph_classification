package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int len;
		char[][] dc = new char[55][35];
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
				dc[i] = tempVar2.charAt(0);
			}
			len = String.valueOf(dc[i]).length();
			if (dc[i][len - 1] - 'r' == 0 && dc[i][len - 2] - 'e' == 0)
			{
				dc[i][len - 2] = '\0';
			}
			else if (dc[i][len - 1] - 'y' == 0 && dc[i][len - 2] - 'l' == 0)
			{
				dc[i][len - 2] = '\0';
			}
			else if (dc[i][len - 1] - 'g' == 0 && dc[i][len - 2] - 'n' == 0 && dc[i][len - 3] - 'i' == 0)
			{
				dc[i][len - 3] = '\0';
			}
			System.out.printf("%s\n",dc[i]);
		}
		return 0;
	}


}

