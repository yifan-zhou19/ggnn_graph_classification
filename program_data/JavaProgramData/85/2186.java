package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int m;
	int result = 0;
	char[][] bsf = new char[1000][21];
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
		if (((bsf[i][0] >= 'a') && (bsf[i][0] <= 'z')) || ((bsf[i][0] >= 'A') && (bsf[i][0] <= 'Z')) || (bsf[i][0] == '_'))
		{
		  for (m = 1;bsf[i][m] != '\0';m++)
		  {
			if (((bsf[i][m] >= 'a') && (bsf[i][m] <= 'z')) || ((bsf[i][m] >= '0') && (bsf[i][m] <= '9')) || ((bsf[i][m] >= 'A') && (bsf[i][m] <= 'Z')) || (bsf[i][m] == '_'))
			{
			}
			else
			{
				result = 1;
			}
		  }
		}
		 else
		 {
			  result = 1;
		 }
	   if (result == 0)
	   {
		   System.out.print("yes\n");
	   }
	   else
	   {
		   System.out.print("no\n");
	   };
	  result = 0;
	  }
	 return 0;
	}



}

