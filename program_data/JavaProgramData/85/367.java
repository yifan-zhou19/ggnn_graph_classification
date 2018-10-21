package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int n;
		int k = 0;
		int x = 0;
	   char[][] s = new char[100][21];
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
		   k = 0;
		   x = 0;
		   l = String.valueOf(s[i]).length();
		   for (j = 0;j < l;j++)
		   {
			   if (s[i][j] >= 'a' && s[i][j] <= 'z')
			   {
			   k++;
			   }
			   else if (s[i][j] >= 'A' && s[i][j] <= 'Z')
			   {
			   k++;
			   }
			   else if (s[i][j] == '_')
			   {
			   k++;
			   }
			   else if (s[i][j] >= '0' && s[i][j] <= '9')
			   {
			   k++;
			   }
		   }
			if (s[i][0] == '_')
			{
			x++;
			}
			else if (s[i][0] >= 'a' && s[i][0] <= 'z')
			{
			x++;
			}
			else if (s[i][0] >= 'A' && s[i][0] <= 'Z')
			{
			x++;
			}
			else if (s[i][0] == '_')
			{
			x++;
			}
			if (x == 1 && k == l)
			{
			System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
	   }
	}

}

