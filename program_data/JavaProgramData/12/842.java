package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int[][] a = new int[15][17];
	   int i;
	   int num;
	   int j;
	   int k;
	   int l;
	   int h;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[0][0] = Integer.parseInt(tempVar);
	   }
	   for (j = 0;j <= 15 && a[j][0] != -1;j++)
	   {
		   for (i = 1;i <= 15 && a[j][i - 1] != 0;i++)
		   {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[j][i] = Integer.parseInt(tempVar2);
	 }
		   }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 a[j + 1][0] = Integer.parseInt(tempVar3);
	 }
	   }
	   for (l = 0;l <= 14 && a[l][0] != -1;l++)
	   {
		   num = 0;
	   for (k = 0;k <= 15 && a[l][k] != 0;k++)
	   {
		   for (h = 0;h <= 15 && a[l][h] != 0;h++)
		   {
		   if (a[l][k] == 2 * a[l][h])
		   {
			   num++;
		   }
		   }
	   }
	   System.out.printf("%d\n",num);
	   }
	}
}

