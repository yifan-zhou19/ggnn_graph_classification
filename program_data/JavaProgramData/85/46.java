package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int leng;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[100][20];
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
			leng = String.valueOf(s[i]).length();
			for (j = 0;j < leng;j++)
			{
				if (s[i][j] != '_' && j == 0 && (s[i][j] < 'A' || (s[i][j]>'Z' && s[i][j] < 'a') || (s[i][j]>'z')))
				{
					System.out.print("no\n");
					break;
				}
				if (j != 0)
				{
				   if (s[i][j] != '_' && s[i][j] < '0' || (s[i][j]>'9' && s[i][j] < 'A') || (s[i][j]>'Z' && s[i][j] < 'a') || (s[i][j]>'z'))
				   {
					  System.out.print("no\n");
					  break;
				   }
				}
			}
			if (j == leng)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}




}

