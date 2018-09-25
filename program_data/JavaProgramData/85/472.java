package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] l = new int[100];
		char[][] s = new char[100][20];
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
			l[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			m = 0;
			if (s[i][0] >= '0' && s[i][0] <= '9')
			{
					m = 1;
			}
			else if (s[i][0] >= 'A' && s[i][0] <= 'Z')
			{
					m = 0;
			}
			else if (s[i][0] >= 'a' && s[i][0] <= 'z')
			{
					m = 0;
			}
			else if (s[i][0] == '_')
			{
					m = 0;
			}
					  else
					  {
							 m = 1;
					  }
				if (m == 0)
				{
			  for (j = 1;j < l[i];j++)
			  {
				if (s[i][j] >= '0' && s[i][j] <= '9')
				{
					m = 0;
				}
				else if (s[i][j] >= 'A' && s[i][j] <= 'Z')
				{
					m = 0;
				}
				else if (s[i][j] >= 'a' && s[i][j] <= 'z')
				{
					m = 0;
				}
				else if (s[i][j] == '_')
				{
					m = 0;
				}
				else
				{
					m = 1;
					break;
				}
			  }
				}
			if (m == 1) //&&i!=n-1)
			{
				System.out.print("no\n");
			}
			else if (m == 0) //&&i!=n-1)
			{
				System.out.print("yes\n");
			}

		}
	}
}

