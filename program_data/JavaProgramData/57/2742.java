package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			char[][] str = new char[50][30];
			int n;
			int i;
			int len;
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
				   len = String.valueOf(str[i]).length();
				   if (str[i][len - 2] == 'e')
				   {
					   str[i][len - 2] = '\0';
				   }
				   else if (str[i][len - 2] == 'l')
				   {
					   str[i][len - 2] = '\0';
				   }
				   else if (str[i][len - 2] == 'n')
				   {
					   str[i][len - 3] = '\0';
				   }
				   System.out.printf("%s\n",str[i]);
			}
			return 0;
	}

}

