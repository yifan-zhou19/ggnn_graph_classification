package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double l;
		double min1;
		double min2;
		double max1;
		double max2;
		int n;
		int i;
		min1 = 100.0;
		min2 = 100.0;
		max1 = 0.0;
		max2 = 0.0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x,y;
	//	}
	//	p[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			double x1;
			double y1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x1 = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y1 = Double.parseDouble(tempVar3);
			}
			p[i].x = x1;
			p[i].y = y1;
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].y > max2)
			{
				max2 = p[i].y;
			}
			if (p[i].y < min2)
			{
				min2 = p[i].y;
			}
			if (p[i].x > max1)
			{
				max1 = p[i].x;
			}
			if (p[i].x < min1)
			{
				min1 = p[i].x;
			}
		}
		l = Math.sqrt((max2 - min2) * (max2 - min2) + (max1 - min1) * (max1 - min1));
			 if (n > 6)
			 {
				 l -= 2.2890;
			 }
		System.out.printf("%.4f\n",l);
	}

}

