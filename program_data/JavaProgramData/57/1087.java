package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int n;
		char[][] str = new char[51][33];
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
				str[i] = tempVar2.charAt(0);
			}
		}
		 for (i = 0;i < n;i++)
		 {
			 l = String.valueOf(str[i]).length();
			 if ((strcmp(str[i][l - 3], "ing") == 0))
			 {
				 str[i][l - 3] = '\0';
			 }
			 if ((strcmp(str[i][l - 2], "er") == 0 || strcmp(str[i][l - 2], "ly") == 0))
			 {
				 str[i][l - 2] = '\0';
			 }
		 }
			 for (i = 0;i < n;i++)
			 {
				 System.out.println(str[i]);
			 }
		 return 0;
	}
}

