package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int m = 0;
		int a = 1;
		double max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		float x;
	//		float y;
	//	};
		double[] dis = new double[1000];
		point[] p = tangible.Arrays.initializeWithDefaultpointInstances(1000);
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[m] = Math.sqrt(Math.pow((p[i].x - p[j].x),2) + Math.pow((p[i].y - p[j].y),2));
				m++;
			}
		}
		 max = dis[0];
		 for (;a < n * (n - 1) / 2;a++)
		 {
		 if (dis[a] > max)
		 {
			 max = dis[a];
		 }
		 }
		 System.out.printf("%.4f\n",max);


	}


}

