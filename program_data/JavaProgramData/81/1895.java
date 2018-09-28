package <missing>;

public class GlobalMembers
{
	public static int qq(int m,int n)
	{
		if (m < 5 && m >= 0 && n < 5 && n >= 0)
		{
	   return 1;
		}
	   else
	   {
	   return 0;
	   }

	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[][] d = new int[5][5];
		int i;
		int j;

	   for (i = 0;i < 5;i++)
	   {
					   String tempVar = ConsoleInput.scanfRead();
					   if (tempVar != null)
					   {
						   d[i][0] = Integer.parseInt(tempVar);
					   }
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   d[i][1] = Integer.parseInt(tempVar2);
					   }
					   String tempVar3 = ConsoleInput.scanfRead();
					   if (tempVar3 != null)
					   {
						   d[i][2] = Integer.parseInt(tempVar3);
					   }
					   String tempVar4 = ConsoleInput.scanfRead();
					   if (tempVar4 != null)
					   {
						   d[i][3] = Integer.parseInt(tempVar4);
					   }
					   String tempVar5 = ConsoleInput.scanfRead();
					   if (tempVar5 != null)
					   {
						   d[i][4] = Integer.parseInt(tempVar5);
					   }
	   }
	   String tempVar6 = ConsoleInput.scanfRead();
	   if (tempVar6 != null)
	   {
		   a = Integer.parseInt(tempVar6);
	   }
	   String tempVar7 = ConsoleInput.scanfRead(" ");
	   if (tempVar7 != null)
	   {
		   b = Integer.parseInt(tempVar7);
	   }
	   c = qq(a, b);
	   if (c == 0)
	   {
	   System.out.print("error");
	   }
	   else
	   {
		   for (i = 0;i < 5;i++)
		   {
						if (i == a)
						{
					   System.out.printf("%d %d %d %d %d\n",d[b][0],d[b][1],d[b][2],d[b][3],d[b][4]);
						}
					   else if (i == b)
					   {

					   System.out.printf("%d %d %d %d %d\n",d[a][0],d[a][1],d[a][2],d[a][3],d[a][4]);
					   }
					   else
					   {
					   System.out.printf("%d %d %d %d %d\n",d[i][0],d[i][1],d[i][2],d[i][3],d[i][4]);
					   }
		   }

	   }

		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
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

