package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] a = new char[1000][500];
	 int i;
	 int j;
	 int n;
	 int m;
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
	  m = String.valueOf(a[i]).length();
	  for (j = 0;j < m;j++)
	  {
		  if (a[i][j] == 'A')
		  {
		  a[i][j] = a[i][j] - 'A'+'T';
		  }
		  else if (a[i][j] == 'T')
		  {
		  a[i][j] = a[i][j] - 'T'+'A';
		  }
		  else if (a[i][j] == 'C')
		  {
		  a[i][j] = a[i][j] - 'C'+'G';
		  }
		  else if (a[i][j] == 'G')
		  {
		  a[i][j] = a[i][j] - 'G'+'C';
		  }
	  }
		  System.out.printf("%s\n",a[i]);
	 }
	 return 0;
	}

}

