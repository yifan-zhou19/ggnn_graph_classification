package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] len = new int[1000];
		int[] m = new int[1000];
		int j;
		int l = 0;
		char[][] s = new char[1000][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			l = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(s[i]).length();
			if ((s[i][0] >= 'A' && s[i][0] <= 'Z') || (s[i][0] >= 'a' && s[i][0] <= 'z') || (s[i][0] == '_'))
			{
			  m[i] = 0;
			}
					   else
					   {
						   m[i] = 1;
					   }
					for (j = 1;j < len[i];j++)
					{


			   if ((s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] == '_') || (s[i][j] <= '9' && s[i][j] >= '0'))
			   {
				  l++;
			   }
					}
					if (l == len[i] - 1 && m[i] == 0)
					{
				  System.out.print("yes\n");
					}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

