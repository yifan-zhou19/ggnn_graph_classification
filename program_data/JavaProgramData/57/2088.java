package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] l = new int[50];
		char[][] s = new char[50][20];
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
			if (s[i][l[i] - 2] == 'e' && s[i][l[i] - 1] == 'r')
			{
				s[i][l[i] - 2] = '\0';
				s[i][l[i] - 1] = '\0';
			}
			else if (s[i][l[i] - 2] == 'l' && s[i][l[i] - 1] == 'y')
			{
				s[i][l[i] - 2] = '\0';
				s[i][l[i] - 1] = '\0';
			}
			else if (s[i][l[i] - 2] == 'n' && s[i][l[i] - 1] == 'g' && s[i][l[i] - 3] == 'i')
			{
				s[i][l[i] - 2] = '\0';
				s[i][l[i] - 1] = '\0';
				s[i][l[i] - 3] = '\0';
			}
			System.out.printf("%s\n",s[i]);
		}
		return 0;
	}
}

