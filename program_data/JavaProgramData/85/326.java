package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int l;
		int len;
		char[][] c = new char[100][100];
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
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = 0;
			len = String.valueOf(c[i]).length();
			if (c[i][0] >= 'a' && c[i][0] <= 'z')
			{
				l = l;
			}
			else if (c[i][0] >= 'A' && c[i][0] <= 'Z')
			{
				l = l;
			}
			else if (c[i][0] == '_')
			{
				l = l;
			}
			else
			{
				l++;
			}
			for (j = 1;j < len;j++)
			{
				if (c[i][j] >= 'a' && c[i][j] <= 'z')
				{
					l = l;
				}
				else if (c[i][j] >= 'A' && c[i][j] <= 'Z')
				{
					l = l;
				}
				else if (c[i][j] == '_')
				{
					l = l;
				}
				else if (c[i][j] >= '0' && c[i][j] <= '9')
				{
					l = l;
				}
				else
				{
					l++;
				}
			}
			if (l != 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
	}


}

