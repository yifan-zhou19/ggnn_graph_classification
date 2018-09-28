package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int x;
	 int[] la = new int[100];
	 int[] lb = new int[100];
	 char[][] a = new char[100][100];
	 char[][] b = new char[100][100];
	 char[][] c = new char[100][100];
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
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i] = tempVar3.charAt(0);
	  }
	  System.out.print("\n");
	 }
	 for (i = 0;i < n;i++)
	 {
	  la[i] = String.valueOf(a[i]).length();
	  lb[i] = String.valueOf(b[i]).length();
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = la[i] - 1,k = lb[i] - 1;j > (la[i] - lb[i]),k >= 0;j--,k--)
	  {
	   if (a[i][j] < b[i][k])
	   {
		   c[i][j] = 58 + a[i][j] - b[i][k];
		   a[i][j - 1] = a[i][j - 1] - 1;
	   }
	   else
	   {
		   c[i][j] = a[i][j] - b[i][k] + 48;
	   }
	  }
	  for (j = 0;j < la[i] - lb[i];j++)
	  {
	  c[i][j] = a[i][j];
	  }
	 }
	 for (x = 0;x < n;x++)
	 {
	 System.out.printf("%s\n",c[x]);
	 }
	}
}

