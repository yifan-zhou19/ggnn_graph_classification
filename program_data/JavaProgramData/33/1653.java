package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
		   int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		   char[][] zfc = new char[n][256];
		   for (int i = 0;i < n;i++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   zfc[i] = tempVar2.charAt(0);
			   }
		   }
		   for (int i = 0;i < n;i++)
		   {
			   for (int m = 0;m < 256;m++)
			   {
				   if (zfc[i][m] == 'A')
				   {
					   zfc[i][m] = 'T';
				   }
				   else if (zfc[i][m] == 'T')
				   {
					   zfc[i][m] = 'A';
				   }
				   else if (zfc[i][m] == 'C')
				   {
					   zfc[i][m] = 'G';
				   }
				   else if (zfc[i][m] == 'G')
				   {
					   zfc[i][m] = 'C';
				   }
			   }
		   }
		   for (int i = 0;i < n;i++)
		   {
			   System.out.printf("%s\n",zfc[i]);
		   }
		   return 0;
	   }

}

