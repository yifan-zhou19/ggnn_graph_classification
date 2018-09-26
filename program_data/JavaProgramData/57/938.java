package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
	   char[][] dc = new char[51][33];
	   int i;
	   int n;
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
		   dc[i] = tempVar2.charAt(0);
	   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   int j = String.valueOf(dc[i]).length() - 1;
		   if (dc[i][j] == 'r')
		   {
			   dc[i][j - 1] = '\0';
		   }
		   else if (dc[i][j] == 'y')
		   {
			   dc[i][j - 1] = '\0';
		   }
		   else if (dc[i][j] == 'g')
		   {
			   dc[i][j - 2] = '\0';
		   }
		   System.out.printf("%s\n",dc[i]);
	   }
		return 0;
	   }
}

