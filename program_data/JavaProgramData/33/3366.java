package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int[] b = new int[1000];
	 char[][] a = new char[1000][1000];
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
	   b[i] = String.valueOf(a[i]).length();
	 }
	 for (i = 0;i < n;i++)
	 {
	   for (j = 0;j < String.valueOf(a[i]).length();j++)
	   {
		 if (a[i][j] == 'A')
		 {
		   System.out.print("T");
		 }
		 if (a[i][j] == 'T')
		 {
		   System.out.print("A");
		 }
		 if (a[i][j] == 'C')
		 {
		   System.out.print("G");
		 }
		 if (a[i][j] == 'G')
		 {
		   System.out.print("C");
		 }
		 if (j == String.valueOf(a[i]).length() - 1)
		 {
		   System.out.print("\n");
		 }
	   }

	 }
	  return 0;


	}

}

