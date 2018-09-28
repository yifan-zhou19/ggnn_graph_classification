package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		   int i;
		   int j;
		   int m;
		   int n;
		   int[][] a = new int[5][5];
		   for (i = 0;i < 5;i++)
		   {
			   for (j = 0;j < 5;j++)
			   {
				   String tempVar = ConsoleInput.scanfRead();
				   if (tempVar != null)
				   {
					   a[i][j] = Integer.parseInt(tempVar);
				   }
			   }
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   n = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   m = Integer.parseInt(tempVar3);
		   }
		   if (m > 4 || n > 4)
		   {
			   System.out.print("error\n");
		   }
		   else
		   {
			   for (i = 0;i < 5;i++)
			   {
				   j = (*(a + m) + i);
				   *(*(a + m) + i) = *(*(a + n) + i);
				   *(*(a + n) + i) = j;
			   }
			   for (i = 0;i < 5;i++)
			   {
				   for (j = 0;j < 4;j++)
				   {
						 System.out.printf("%d ",*(*(a + i) + j));
				   }
				   System.out.printf("%d\n",*(*(a + i) + 4));
			   }
		   }



	}
}

