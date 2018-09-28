package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[50][20];
		final String b = "er";
		final String c = "ly";
		final String d = "ing";
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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 20;j++)
			{
			if (a[i][j] == '\0')
			{
				if (strcmp(a[i][j - 2], b) == 0 || strcmp(a[i][j - 2], c) == 0)
				{
					a[i][j - 2] = '\0';
					System.out.printf("%s\n",a[i]);
				}
				else if (strcmp(a[i][j - 3], d) == 0)
				{
					a[i][j - 3] = '\0';
					System.out.printf("%s\n",a[i]);
				}
			}
			}
		}
	}





}

