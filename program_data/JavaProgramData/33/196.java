package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 char[][] a = new char[1000][255];
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
	for (j = 0;a[i][j] != '\0';j++)
	{
	  if (a[i][j] == 'A')
	  {
	  System.out.printf("%c",'T');
	  }
	if (a[i][j] == 'T')
	{
	  System.out.printf("%c",'A');
	}
	  else if (a[i][j] == 'G')
	  {
	  System.out.printf("%c",'C');
	  }
	 else if (a[i][j] == 'C')
	 {
	  System.out.printf("%c",'G');
	 }

	}
	System.out.print("\n");
	 }
	return 0;
	}






}

