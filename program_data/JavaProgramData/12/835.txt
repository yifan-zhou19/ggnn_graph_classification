package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[][] a = new int[20][16];
	 int[] s = new int[20];
	 int i;
	 int j;
	 int k;
	 int p = 0;
	 int[] n = new int[20];
	 for (i = 0;i < 20;i++)
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[i][0] = Integer.parseInt(tempVar);
		 }
		 if (a[i][0] == -1)
		 {
			 break;
		 }
		 p = p + 1;
		 for (j = 1;j < 16;j++)
		 {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar2);
		   }
		   if (a[i][j] == 0)
		   {
			   break;
		   }
		   s[i] = s[i] + 1;
		 }
	 }
	 for (i = 0;i < p;i++)
	 {
	 for (j = 0;j <= s[i];j++)
	 {
	 for (k = 0;k <= s[i];k++)
	 {
	 if (a[i][j] == 2 * a[i][k])
	 {
		 n[i] = n[i] + 1;
	 }
	 }
	 }
	 }
	 for (i = 0;i < p;i++)
	 {
	 System.out.printf("%d\n",n[i]);
	 }
	}
}

