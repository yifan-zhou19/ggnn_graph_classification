package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int n;
		   int i;
		   int j;
		   char[][] zf = new char[60][40];
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
				   zf[i] = tempVar2.charAt(0);
			   }
			   j = String.valueOf(zf[i]).length() - 1;
				   if (((zf[i][j - 1] == 'e') && (zf[i][j] == 'r')) || ((zf[i][j - 1] == 'l') && (zf[i][j] == 'y')))
				   {
					   zf[i][j - 1] = '\0';
				   }
				   else
				   {
					   zf[i][j - 2] = '\0';
				   }
		   }
		   for (i = 0;i < n;i++)
		   {
			   System.out.printf("%s\n",zf[i]);
		   }
		return 0;
	}
}

