package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int j;
	char[][] bsf = new char[100][21];
	 k = 1;
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
		  bsf[i] = tempVar2.charAt(0);
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (bsf[i][0] == '_' || (bsf[i][0] >= 'A' && bsf[i][0] <= 'Z') || (bsf[i][0] >= 'a' && bsf[i][0] <= 'z'))
	  {
		  k *= 1;
	  }
	  else
	  {
		  k *= 0;
	  }
	   for (j = 1;j < String.valueOf(bsf[i]).length();j++)
	   {
		if (bsf[i][j] == '_' || (bsf[i][j] >= 'A' && bsf[i][j] <= 'Z') || (bsf[i][j] >= 'a' && bsf[i][j] <= 'z') || (bsf[i][j] >= '0' && bsf[i][j] <= '9'))
		{
			k *= 1;
		}
		else
		{
			k *= 0;
		}
	   }
	  if (k != 0)
	  {
		  System.out.print("yes\n");
	  }
	   else
	   {
		   System.out.print("no\n");
	   }
	   k = 1;
	 }
	 return 0;
	}

}

