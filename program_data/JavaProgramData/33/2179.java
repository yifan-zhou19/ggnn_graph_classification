package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
	   int n;
	   int i;
	   int j;
	   int[] len = new int[1111];
	   char[][] zfc = new char[1111][256];
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
			   zfc[i] = tempVar2.charAt(0);
		   }
		   len[i] = String.valueOf(zfc[i]).length();

	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < len[i];j++)
		   {
		   if (zfc[i][j] == 'A')
		   {
			   zfc[i][j] = 'T';
		   }
		   else if (zfc[i][j] == 'T')
		   {
			   zfc[i][j] = 'A';
		   }
		   else if (zfc[i][j] == 'C')
		   {
			   zfc[i][j] = 'G';
		   }
		   else if (zfc[i][j] == 'G')
		   {
			   zfc[i][j] = 'C';
		   }
		   }
		   System.out.printf("%s\n", zfc[i]);
	   }


	   return 0;
	}

}

