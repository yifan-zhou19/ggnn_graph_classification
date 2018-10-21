package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		  int n;
		  int i;
		  int j;
		  int len;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  char[][] sz = new char[N][LEN];
		  for (i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  sz[i] = tempVar2.charAt(0);
				  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  len = String.valueOf(sz[i]).length();
			  for (j = 0;j < len;j++)
			  {
				  if (sz[i][j] == 'A')
				  {
					 sz[i][j] = 'T';
				  }
				  else if (sz[i][j] == 'T')
				  {
					 sz[i][j] = 'A';
				  }
				  else if (sz[i][j] == 'G')
				  {
					sz[i][j] = 'C';
				  }
				  else if (sz[i][j] == 'C')
				  {
					 sz[i][j] = 'G';
				  }
			  System.out.printf("%c",sz[i][j]);
			  }
			  System.out.print("\n");
		  }
	  return 0;
	  }


}

