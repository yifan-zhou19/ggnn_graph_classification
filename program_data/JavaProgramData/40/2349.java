package <missing>;

public class GlobalMembers
{
	public static double MyComputeArea()
	{
		double MyQuadrangleArea = 0;

		double side1 = 0;
		double side2 = 0;
		double side3 = 0;
		double side4 = 0;
		double angle = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			side1 = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			side2 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			side3 = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			side4 = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			angle = Double.parseDouble(tempVar5);
		}

		double MyAngle = angle * PI / 180.0;
		//printf("%.4lf\n",MyAngle);
		double s = 0;
		s = (side1 + side2 + side3 + side4) / 2.0;
		//S = sqrt((s-a)*(s-b)*(s-c)*(s-d) - a*b*c*d*cos2?);
		if ((s - side1) * (s - side2) * (s - side3) * (s - side4) - side1 * side2 * side3 * side4 * (1 + Math.cos(MyAngle)) / 2 >= 0)
		{
			MyQuadrangleArea = Math.sqrt((s - side1) * (s - side2) * (s - side3) * (s - side4) - side1 * side2 * side3 * side4 * (1 + Math.cos(MyAngle)) / 2);
		}
		else
		{
			return -1;
		}
		return MyQuadrangleArea;
	}
	public static int Main()
	{
		double MyQuadrangleArea = 0;
		MyQuadrangleArea = MyComputeArea();
		if (MyQuadrangleArea < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",MyQuadrangleArea);
		}
		return 0;
	}
}

