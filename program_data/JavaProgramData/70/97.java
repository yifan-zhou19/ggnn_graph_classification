package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int diji = 0;
		double a;
		double b;
		double distance;
		double d;
		double max = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x;
	//		double y;
	//	};
		point[] dian;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		dian = tangible.Arrays.initializeWithDefaultpointInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			dian[i].x = a;
			dian[i].y = b;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d = (dian[i].x - dian[j].x) * (dian[i].x - dian[j].x) + (dian[i].y - dian[j].y) * (dian[i].y - dian[j].y);
				distance = Math.sqrt(d);
				if (distance > max)
				{
					max = distance;
				}
			}
		}
		System.out.printf("%.4f\n",max);


	}

}

