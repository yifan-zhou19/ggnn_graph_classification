package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int len;
		char[][] jj = new char[1000][256];
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
			  jj[i] = tempVar2.charAt(0);
		  }

		  len = String.valueOf(jj[i]).length();
		  for (k = 0;k < len;k++)
		  {
		   if (jj[i][k] == 'A')
		   {
			  jj[i][k] = 'T';
		   }
		   else if (jj[i][k] == 'T')
		   {
			  jj[i][k] = 'A';
		   }
			else if (jj[i][k] == 'C')
			{
			  jj[i][k] = 'G';
			}
			else if (jj[i][k] == 'G')
			{
			  jj[i][k] = 'C';
			}
		  }
		 }
		 for (i = 0;i < n;i++)
		 {
		   System.out.printf("%s",jj[i]);
			System.out.print("\n");
		 }
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  k = Integer.parseInt(tempVar3);
						  }
		 return 0;
	}

}

