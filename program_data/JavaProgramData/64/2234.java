public class Point
{
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
		public static int y = (p1.y) - (p2.y);
		public static int z = (p1.z) - (p2.z);
		public static double temp = (double)(x * x + y * y + z * z);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//	return sqrt(temp UnnamedParameter);
} //???????


	public static void Output(Point p1, Point p2)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n\n", p1.x, p1.y, p1.z, p2.x, p2.y, p2.z, Distance(p1, p2));
	} //???????


	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		Point[] p = tangible.Arrays.initializeWithDefaultPointInstances(n);
		for (i = 0; i < n; i++)
		{
			p[i] =  new Point();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].z = Integer.parseInt(tempVar4);
			}
		}

		double[] a = new double[n * (n - 1) / 2]; //??????
		int k = 0;
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				int t = 0;
				while (t < k + 1 && (a[t] - Distance(p[i], p[j]) > 0.00001 || Distance(p[i], p[j]) - a[t] > 0.00001))
				{
					//?????double????????????????????????????
					t++;
				}
				if (t == k + 1)
				{
					a[k] = Distance(p[i], p[j]);
					k++;
				}
				//Output(p[i],p[j]);
			}
		} //????????????????????
		int count = k; //??????
		for (i = 0; i < count; i++)
		{
			for (j = i + 1; j < count; j++)
			{
				if (a[i] < a[j])
				{
					double temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		} //??a[]??
		k = 0;
		while (k < count)
		{ //?????????????????????????
			for (i = 0; i < n; i++)
			{
				for (j = i + 1; j < n; j++)
				{
					if (a[k] > Distance(p[i], p[j]))
					{
						if (a[k] - Distance(p[i], p[j]) < 0.000001) //a[k]==Distance(p[i],p[j])
						{
							System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n\n", p[i].x, p[i].y, p[i].z, p[j].x, p[j].y, p[j].z, Distance(p[i], p[j]));
						}
					}
					else
					{
						if (Distance(p[i], p[j]) - a[k] < 0.000001) //a[k]==Distance(p[i],p[j])
						{
							Output(p[i], p[j]);
						}
					} //float???????????????????
				}
			}
			k++;
		}
	}

}

