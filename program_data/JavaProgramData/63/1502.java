package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int x1;
		 int y1;
		 int x2;
		 int y2;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 x1 = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 y1 = Integer.parseInt(tempVar2);
		 }
		 int[] p1 = new int[x1 * y1];
		 for (int i = 0;i < x1 * y1;i++)
		 {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  p1[i] = Integer.parseInt(tempVar3);
			  }
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 x2 = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 y2 = Integer.parseInt(tempVar5);
		 }
		 int[] p2 = new int[x2 * y2];
		 for (int i = 0;i < x2 * y2;i++)
		 {
			  String tempVar6 = ConsoleInput.scanfRead();
			  if (tempVar6 != null)
			  {
				  p2[i] = Integer.parseInt(tempVar6);
			  }
		 }
		 int[] p3 = new int[x1 * y2];
		 for (int i = 0;i < x1;i++)
		 {
			  for (int j = 0;j < y2;j++)
			  {
				   p3[i * y2 + j] = 0;
				   for (int k = 0;k < y1;k++)
				   {
						p3[i * y2 + j] = p3[i * y2 + j] + p1[i * y1 + k] * p2[k * y2 + j];
				   }
			  } //?????????
		 }
		 for (int i = 0;i < x1;i++)
		 {
			  for (int j = 0;j < y2;j++)
			  {
				   if (j < y2 - 1)
				   {
				   System.out.printf("%d ",p3[i * y2 + j]);
				   }
				   else
				   {
				   System.out.printf("%d\n",p3[i * y2 + j]);
				   }
			  }
		 }
			return 0;
	}

}

