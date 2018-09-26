package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  char[][] da = new char[n][32];
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  da[i] = tempVar2.charAt(0);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  k = String.valueOf(da[i]).length();
		  if (da[i][k - 1] == 'r' && da[i][k - 2] == 'e')
		  {
			  da[i][k - 1] = '\0';
		  da[i][k - 2] = '\0';
		  }
		  if (da[i][k - 1] == 'y' && da[i][k - 2] == 'l')
		  {
			  da[i][k - 1] = '\0';
		  da[i][k - 2] = '\0';
		  }
		  if (da[i][k - 1] == 'g' && da[i][k - 2] == 'n' && da[i][k - 3] == 'i')
		  {
			  da[i][k - 1] = '\0';
			da[i][k - 2] = '\0';
			da[i][k - 3] = '\0';
		  }
		  System.out.println(da[i]);



	  }

	  return 0;




	}
}

