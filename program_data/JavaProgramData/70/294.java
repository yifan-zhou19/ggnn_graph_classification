package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x,y;
	//	};
		point pp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pp = (point)malloc(sizeof(point) * n);
		int i;
		for (i = 0;i < n;i++)
		{
			double tmp1;
			double tmp2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tmp1 = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				tmp2 = Double.parseDouble(tempVar3);
			}
			(pp + i).x = tmp1;
			(pp + i).y = tmp2;
		}
		double dis = 0;
		for (i = 0;i < n;i++)
		{
			int j;
			for (j = i + 1;j < n;j++)
			{
				double tmpdis;
				double deltax;
				double deltay;
				deltax = ((pp + i).x) - ((pp + j).x);
				deltay = ((pp + i).y) - ((pp + j).y);
				tmpdis = Math.sqrt(deltax * deltax + deltay * deltay);
				if (tmpdis > dis)
				{
					dis = tmpdis;
				}
			}
		}
		System.out.printf("%.4lf",dis);
		pp = null;
		return 0;
	}


}

