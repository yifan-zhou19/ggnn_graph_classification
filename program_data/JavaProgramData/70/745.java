package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m = 0;
		int n;
		double[] b = new double[10000];
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
		point p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (point)malloc(sizeof(point) * n);
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(p + i).x = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(p + i).y = tempVar3;
		}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[m] = ((p + i).x - (p + j).x) * ((p + i).x - (p + j).x) + ((p + i).y - (p + j).y) * ((p + i).y - (p + j).y);

				b[m] = (double)Math.sqrt(b[m]);
				m++;
			}
		}
		max = b[0];
		for (i = 0;i < m;i++)
		{
			if (b[i] > max)
			{
				max = b[i];

			}
		}

		System.out.printf("%.4f\n",max);
		p = null;
	}




}

