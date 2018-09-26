package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int r;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct point
	//	 {
	//		 double x,y;
	//	 }
	//	 point[100];
		 double d;
		 double D;
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 point[i].x = tempVar2;
			 }
			 String tempVar3 = ConsoleInput.scanfRead("""");
			 if (tempVar3 != null)
			 {
				 point[i].y = tempVar3;
			 }
		 }
		 for (j = 0;j < n;j++)
		 {
			 for (r = 0;r < j;r++)
			 {
				 if (r == 0 && j == 1)
				 {
					 D = (point[1].x - point[0].x) * (point[1].x - point[0].x) + (point[1].y - point[0].y) * (point[1].y - point[0].y);
				 }
				 else
				 {
					 d = (point[j].x - point[r].x) * (point[j].x - point[r].x) + (point[j].y - point[r].y) * (point[j].y - point[r].y);
					 if (d > D)
					 {
						 D = d;
					 }
				 }
			 }
		 }
		 System.out.printf("%.4lf\n",Math.sqrt(D));

	}
}

