package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int c;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  char[][] da = new char[n][256];
	  char[][] ad = new char[n][256];
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
		  for (j = 0;j < 256;j++)
		  {
		  if (da[i][j] == 'A')
		  {
			  ad[i][j] = 'T';
		  }
		  if (da[i][j] == 'T')
		  {
			  ad[i][j] = 'A';
		  }
		  if (da[i][j] == 'C')
		  {
			  ad[i][j] = 'G';
		  }
		  if (da[i][j] == 'G')
		  {
			  ad[i][j] = 'C';
		  }
		  }
	  System.out.println(ad[i]);
	  }

	  return 0;





	}
}

