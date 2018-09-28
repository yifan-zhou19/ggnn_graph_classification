package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int d;
	int i;
	int j;
	int x;
	int[][] m = new int[102][102];
	int[][] n = new int[102][102];
	int[][] r = new int[102][102];
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
	   for (int i = 1;i <= a;i++)
	   {
		   for (int j = 1;j <= b - 1;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   m[i][j] = Integer.parseInt(tempVar3);
			   }
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   m[i][b] = Integer.parseInt(tempVar4);
		   }

	   }


	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		b = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		d = Integer.parseInt(tempVar6);
	}
	   for (int i = 1;i <= b;i++)
	   {
		   for (int j = 1;j <= d - 1;j++)
		   {
			   String tempVar7 = ConsoleInput.scanfRead();
			   if (tempVar7 != null)
			   {
				   n[i][j] = Integer.parseInt(tempVar7);
			   }
		   }
		   String tempVar8 = ConsoleInput.scanfRead();
		   if (tempVar8 != null)
		   {
			   n[i][d] = Integer.parseInt(tempVar8);
		   }

	   }


	for (int i = 1;i <= a;i++)
	{
	  for (int j = 1;j <= d;j++)
	  {
		r[i][j] = m[i][0] * n[0][j];
		for (int x = 1;x <= b;x++)
		{
			r[i][j] = r[i][j] + m[i][x] * n[x][j];
		}
	  }
	}

	for (int i = 1;i <= a - 1;i++)
	{
	   for (int j = 1;j <= d - 1;j++)
	   {
		System.out.printf("%d ",r[i][j]);
	   }
		System.out.printf("%d",r[i][d]);
		System.out.print("\n");
	}
	for (int j = 1;j <= d - 1;j++)
	{
		System.out.printf("%d ",r[a][j]);
	}
	System.out.printf("%d",r[a][d]);
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}


}

