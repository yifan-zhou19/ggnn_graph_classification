package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 char[][] jj = new char[1000][255];
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  jj[i] = tempVar2.charAt(0);
	  }

	  for (k = 0;jj[i][k];k++)
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
	   System.out.printf("%s\n",jj[i]);
	 }
	 return 0;
	}

}

