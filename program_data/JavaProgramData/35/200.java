package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int c;
		int b;
		int i;
		int j;
		int[][] x = new int[8][8];
		int a;
		int k;
		int t = 0;
		int z = 0;
		int y = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < c;i++)
	{
	   for (j = 0;j < b;j++)
	   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   x[i][j] = Integer.parseInt(tempVar3);
	   }
	   }
	}
	for (i = 0;i < c;i++)
	{
		a = x[i][0];
	   for (j = 0;j < b;j++)
	   {
		  if (a < x[i][j])
		  {
				 a = x[i][j];
				 t = j;
		  }
	   }
	   for (k = 0;k < c;k++)
	   {
		  if (a < x[k][t])
		  {
			  z++;
		  }
	   }
	   if (z == c - 1)
	   {
		   y = 1;
		   System.out.printf("%d+%d",i,t);
		   break;
	   }
	}
	if (y == 0)
	{
		System.out.print("No");
	}
	}
}

