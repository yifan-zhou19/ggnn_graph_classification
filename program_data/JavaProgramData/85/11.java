package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][20];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < 100; i++)
		{
			for (j = 0; j < 20; j++)
			{
				s[i][j] = 0;
			}
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0; i < n; i++)
		{
			String p = s[i];
			for (; * p != 0; p++)
			{
				if (s[i][0] >= 48 && s[i][0] <= 57)
				{
					break;
				}
				if (!((*p >= 48 && *p <= 57) || (*p >= 65 && *p <= 90) || (*p >= 97 && *p <= 122) || *p == '_'))
				{
					break;
				}
			}
			if (*p != 0)
			{
				System.out.print("no\n");
			}
			else if (*p == 0)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

