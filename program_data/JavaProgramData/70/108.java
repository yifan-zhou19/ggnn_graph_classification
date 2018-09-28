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
	//		float x;
	//		float y;
	//	}
	//	point[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				point[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				point[i].y = tempVar3;
			}
		}
		int m;
		int num = 0;
		double[] b = new double[100];
		double c;
		double d;
		for (i = 0;i < (n - 1);i++)
		{
			for (m = (i + 1);m < n;m++)
			{
				c = (point[i].x - point[m].x) * (point[i].x - point[m].x);
				d = (point[i].y - point[m].y) * (point[i].y - point[m].y);
				b[num] = Math.sqrt(c + d);
				num++;
			}
		}
		double max = b[0];
		for (i = 0;i < (num - 1);i++)
		{
			if (b[i + 1] > max)
			{
				max = b[i + 1];
			}
		}
		System.out.printf("%.4f\n",max);
		return 0;
	}






}

