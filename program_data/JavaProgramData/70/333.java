package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct point
	//   {
	//	double x,y;
	//   }
	//	tope[80];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double s;
		double a = 0.0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tope[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				tope[i].y = tempVar3;
			}
		}
	   for (i = 0;i < n - 1;i++)
	   {
		for (j = i + 1;j < n;j++)
		{
		  s = 0.0;
		 s = (tope[i].x - tope[j].x) * (tope[i].x - tope[j].x) + (tope[i].y - tope[j].y) * (tope[i].y - tope[j].y);
		 if (s > a || s == a)
		 {
			 a = s;
		 }
		}
	   }
		System.out.printf("%.4f\n",Math.sqrt(a));
		return 0;
	}
}

