package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b = 0;
	 int b1 = 0;
	 int c;
	 int d;
	 int e;
	 int f;
	 int g;
	 int i;
	 int k;
	 int t;
	 int raw;
	 int col;
	 int x;
	 int y;
	 int[][] array = new int[100][100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 raw = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 col = Integer.parseInt(tempVar2);
	 }
	 c = raw * col;
	 for (i = 0;i < raw;i++)
	 {
	   for (t = 0;t < col;t++)
	   {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a = Integer.parseInt(tempVar3);
		 }
		 array[i][t] = a;
	   }
	 }
	 for (i = 0;b < c;i++)
	 {
		 for (t = i;t < col - i;t++)
		 {
		   if (b < c)
		   {
		   System.out.printf("%d\n",array[i][t]);
		   }
		   b = b + 1;
		 }

		   for (e = i + 1;e < raw - i;e++)
		   {
			 if (b < c)
			 {
			 System.out.printf("%d\n",array[e][col - i - 1]);
			 }
			 b = b + 1;
		   }

		   for (f = col - 2 - i;f >= i;f--)
		   {
			 if (b < c)
			 {
			 System.out.printf("%d\n",array[raw - 1 - i][f]);
			 }
			 b = b + 1;
		   }

		   for (g = raw - 2 - i;g > i;g--)
		   {
			 if (b < c)
			 {
			 System.out.printf("%d\n",array[g][i]);
			 }
			 b = b + 1;

		   }
	 }

	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 array[x][y] = Integer.parseInt(tempVar4);
	 }
	 return 0;
	}

}

