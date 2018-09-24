package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[5000][256];
	public static int Main()
	{
	  int i;
	  int n;
	  int j;
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
			  a[i] = tempVar2.charAt(0);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;j < String.valueOf(a[i]).length();j++)
		  {
			  switch (a[i][j])
			  {
			  case'A':
				  a[i][j] = 'T';
				  break;
			  case'T':
				  a[i][j] = 'A';
				  break;
			  case'C':
				  a[i][j] = 'G';
				  break;
			  default:
				  a[i][j] = 'C';
			  }
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  System.out.printf("%s\n",a[i]);
	  }
	  return 0;
	}
}

