package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int t;
	 int[][] c = new int[8][8];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(",");
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
	 for (i = 0;i < a;i++)
	 {
		   k = 0;
		for (j = 1;j < b;j++)
		{
		  if (c[i][j] > c[i][k])
		  {
			 k = j;
		  }
		}
		for (t = 0;t < a;t++)
		{
		   if (c[t][k] < c[i][k])
		   {
			  break;
		   }
		}
		 if (t >= a)
		 {
			   System.out.printf("%d+%d",i,k);
			   break;
		 }
	 }
	 if (i >= a)
	 {
		 System.out.print("No");
	 }
	}
}

