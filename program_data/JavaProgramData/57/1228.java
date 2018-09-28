package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] first = new char[50][33];
		for (int a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				first[a] = tempVar2.charAt(0);
			}
			len = String.valueOf(first[a]).length();
			if (first[a][len - 1] == 'r')
			{
				first[a][len - 2] = '\0';
			}
			else
			{
			if (first[a][len - 1] == 'g')
			{
			first[a][len - 3] = '\0';
			}
		else
		{
			if (first[a][len - 1] == 'y')
			{
			first[a][len - 2] = '\0';
			}
		}
			}
			System.out.printf("%s\n",first[a]);
		}
		return 0;
	}

}

