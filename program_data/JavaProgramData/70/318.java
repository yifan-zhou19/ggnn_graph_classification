package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct point
	// {
	//  double x,y;
	// }
	// p[1000];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p[i].x = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  p[i].y = tempVar3;
	  }
	 }
	 double t = (p[0].x - p[1].x) * (p[0].x - p[1].x) + (p[0].y - p[1].y) * (p[0].y - p[1].y);
	 for (i = 0;i < n - 1;i++)
	 {
	  for (j = 1 + i;j < n;j++)
	  {
	   if (t < Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y)))
	   {
		t = Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y));
	   }

	  }
	 }


	 System.out.printf("%.4lf\n",t);
	 return 0;
	}


}

