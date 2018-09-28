package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x,y;
	//	}
	//	s[10];

		int j;
		int i;
		double max;
		double[] distance = new double[100];
		max = 0.0;
		for (j = 0;j < n;j++)
		{
			float a;
			float b;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			s[j].x = a;
			s[j].y = b;
		}

		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < n - 1;j++)
			{
				distance[j] = Math.sqrt((s[j].x - s[i].x) * (s[j].x - s[i].x) + (s[j].y - s[i].y) * (s[j].y - s[i].y));
				if (distance[j] > max)
				{
					max = distance[j];
				}
			}
		}
		System.out.printf("%.4f\n",max);
	}
}

