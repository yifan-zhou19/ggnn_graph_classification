package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int x1;
	   int y1;
	   int x2;
	   int y2;
	   int i;
	   int j;
	   int k;
	   int s;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   x1 = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   y1 = Integer.parseInt(tempVar2);
	   }
	   int[] p = new int[x1 * y1];
	   for (i = 0;i < x1 * y1;i++)
	   {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 p[i] = Integer.parseInt(tempVar3);
		 }
	   }
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   x2 = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   y2 = Integer.parseInt(tempVar5);
	   }
	   int[] q = new int[x2 * y2];
	   for (i = 0;i < x2 * y2;i++)
	   {
		 String tempVar6 = ConsoleInput.scanfRead();
		 if (tempVar6 != null)
		 {
			 q[i] = Integer.parseInt(tempVar6);
		 }
	   }
	   for (i = 0;i < x1;i++)
	   {
		for (j = 0;j < y2;j++)
		{
		   s = 0;
		   for (k = 0;k < y1;k++)
		   {
			 s = s + p[i * y1 + k] * q[k * y2 + j];
		   }
		   if (j == 0)
		   {
			   System.out.printf("%d",s);
		   }
		   else
		   {
			   System.out.printf(" %d",s);
		   }
		   if (j == y2 - 1)
		   {
			   System.out.print("\n");
		   }
		}
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}

}

