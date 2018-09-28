package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int m;
	 int a;
	 int b;
	 int i;
	 int j;
	 int k;
	 int sum;
	 int[][] s = new int[100][100];
	 int[] p = new int[100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	  for (k = 0;k < m;k++)
	  {
		  p = s;
		  sum = 0;
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   b = Integer.parseInt(tempVar3);
	   }
	   for (i = 0;i < a;i++)
	   {
		for (j = 0;j < b;j++)
		{
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 p[i] + j = tempVar4;
			 }
		  if (i == 0 || i == a - 1 || j == 0 || j == b - 1)
		  {
		   sum += *(p[i] + j);
		  }
		}
	   }
	   System.out.printf("%d\n",sum);
	  }
	}
}

