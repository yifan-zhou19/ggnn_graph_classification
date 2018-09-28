package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct tops
	//	{
	//		double x;
	//		double y;
	//	}
	//	tops[100];
		double a;
		double b;
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int i;
	   int j;
	   double dis1;
	   double dis2 = 0.0;
	   for (i = 1;i <= n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Double.parseDouble(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b = Double.parseDouble(tempVar3);
		   }
		   tops[i].x = a;
		   tops[i].y = b;

		   for (j = 1;j <= i;j++)
		   {
		   dis1 = Math.sqrt((tops[i].x - tops[j].x) * (tops[i].x - tops[j].x) + (tops[i].y - tops[j].y) * (tops[i].y - tops[j].y));
		   if (dis1 > dis2)
		   {
			  dis2 = dis1;
		   }
		   }
	   }
	   System.out.printf("%.4lf",dis2);
	   return 0;
	}


}

