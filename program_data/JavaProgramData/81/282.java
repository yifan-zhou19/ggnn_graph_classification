package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static judge(int x,int y)
	{
		return (((x >= 0) && (x <= 4) && (y <= 4) && (y >= 0))? 1:0);
	}
	public static void move(int[][] a, int p, int q)
	{
	   int c = judge(p,q);
		int[][] t = new int[1][5];
		int i;
		int j;
	   if (c == 1)
	   {

		   for (j = 0;j < 5;j++)
		   {
			  t[0][j] = a[p][j];
			  a[p][j] = a[q][j];
			  a[q][j] = t[0][j];
		   }
			for (i = 0;i < 5;i++)
			{
		   for (j = 0;j < 5;j++)
		   {
			   if (j < 4)
			   {
			   System.out.printf("%d ",a[i][j]);
			   }
			 else
			 {
				 System.out.printf("%d\n",a[i][j]);
			 }
		   }
			}
	   }
		else
		{
		System.out.print("error");
		}
	}
	public static void Main()
	{
	  int[][] a = new int[5][5];
	  int i;
	  int j;
	  int u;
	  int v;
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
			u = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			v = Integer.parseInt(tempVar3);
		}
		move(a, u, v);
	}
}

