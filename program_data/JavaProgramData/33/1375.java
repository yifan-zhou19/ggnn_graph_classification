package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] yl = new char[10000][256];
		char[][] pdl = new char[10000][256];
	 int i;
	 int j;
	 int n;
	 int t;
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
		 yl[i] = tempVar2.charAt(0);
	 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 m = String.valueOf(yl[i]).length();
	 for (j = 0;j < m;j++)
	 {
	 if (yl[i][j] == 'A')
	 {
	 pdl[i][j] = 'T';
	 }
	 if (yl[i][j] == 'T')
	 {
	 pdl[i][j] = 'A';
	 }
	 if (yl[i][j] == 'C')
	 {
		 pdl[i][j] = 'G';
	 }
	 if (yl[i][j] == 'G')
	 {
		  pdl[i][j] = 'C';
	 }
	 }
	 }
	for (i = 0;i < n;i++)
	{
		t = String.valueOf(yl[i]).length();
	for (j = 0;j < t;j++)
	{
	System.out.printf("%c",pdl[i][j]);
	}
	System.out.print("\n");
	}
	 return 0;
	}
}

