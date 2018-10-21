package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k = 0;
		double[] distance = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct vertex
	//	{
	//		double x;
	//		double y;
	//	};
		vertex[] v = tangible.Arrays.initializeWithDefaultvertexInstances(100);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				v[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				v[i].y = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= i;j++)
			{
				distance[k] = Math.sqrt((v[i].x - v[j].x) * (v[i].x - v[j].x) + (v[i].y - v[j].y) * (v[i].y - v[j].y)); //?????
				k++;
			}
		}
		double max = distance[0];
		for (j = (n * (n - 1)) / 2 - 1;j > 0;j--)
		{
			if (distance[j] > max)
			{
				max = distance[j];
			}
		}
		System.out.printf("%.4lf",max);
	}


}

