package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  char[][] c = new char[N][L];
	  char[][] d = new char[N][L];
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
			  c[i] = tempVar2.charAt(0);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (int j = 0;j < String.valueOf(c[i]).length();j++)
		  {
			  if (c[i][j] == 'A')
			  {
				  d[i][j] = 'T';
			  }
			  else
			  {
			  if (c[i][j] == 'G')
			  {
				  d[i][j] = 'C';
			  }
			  else
			  {
			  if (c[i][j] == 'C')
			  {
				  d[i][j] = 'G';
			  }
			  else
			  {
			  if (c[i][j] == 'T')
			  {
				  d[i][j] = 'A';
			  }
			  }
			  }
			  }
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
	  System.out.printf("%s\n",d[i]);

	  }
	}

}

