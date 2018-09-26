package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int i;
	   int j;
	   int[][] c = new int[100][100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   b = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < a;i++)
	   {
		 for (j = 0;j < b;j++)
		 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   c[i][j] = Integer.parseInt(tempVar3);
		   }
		 }
	   }
	   for (i = 0;i < b;i++)
	   {
		  for (j = 0;j <= i != 0 && j < a;j++)
		  {
			 System.out.printf("%d\n",c[j][i - j]);
		  }
	   }
	   for (i = b;i < a + b - 1;i++)
	   {
		   for (j = i + 1 - b;j < a && j <= i;j++)
		   {
			  System.out.printf("%d\n",c[j][i - j]);
		   }
	   }
	}
}

