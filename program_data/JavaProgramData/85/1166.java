package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int panduan = 1;
		char[][] s = new char[100][100];
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
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
		panduan = 1;
	int m = String.valueOf(s[i]).length();
			for (j = 0;j < m;j++)
			{
				if (j == 0)
				{
					if ((s[i][j] >= 'a') && (s[i][j] <= 'z'))
					{
					   continue;
					}
					else if ((s[i][j] >= 'A') && (s[i][j] <= 'Z'))
					{
					   continue;
					}
					else if (s[i][j] == '_')
					{
					   continue;
					}
					else
					{
						panduan = 0;
						break;
					}
				}
				else
				{
					 if ((s[i][j] >= '0') && (s[i][j] <= '9'))
					 {
						continue;
					 }
					 else if ((s[i][j] >= 'a') && (s[i][j] <= 'z'))
					 {
						   continue;
					 }
					 else if ((s[i][j] >= 'A') && (s[i][j] <= 'Z'))
					 {
						continue;
					 }
					 else if (s[i][j] == '_')
					 {
						continue;
					 }
					 else
					 {
						 panduan = 0;
						 break;
					 }
				}
			}

			if (panduan == 1)
			{
				   System.out.print("yes\n");
			}
			else if (panduan == 0)
			{
				   System.out.print("no\n");
			}

		}


		return 0;
	}

}

