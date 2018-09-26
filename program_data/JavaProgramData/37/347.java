package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t;
		int len;
		int[][] b = new int[100][26];
	   char[][] a = new char[100][10000];
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
		   t = 0;
		   len = String.valueOf(a[i]).length();
		   for (j = 0;j < len;j++)
		   {
			 b[i][a[i][j] - 48]++;
		   }
		   for (j = 0;j < len;j++)
		   {
			 if (b[i][a[i][j] - 48] == 1)
			 {
			   System.out.printf("%c\n",a[i][j]);
			   t++;
			   break;
			 }
		   }
		   if (t == 0)
		   {
			   System.out.print("no\n");
		   }
	   }
	}
}

