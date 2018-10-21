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
	public static void Input(Point[] p, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			p[i] = new Point();
			p[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	} //??n?????
	public static void Output(Point p1, Point p2)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n\n",p1.x,p1.y,p1.z,p2.x,p2.y,p2.z,Distance(p1,p2));
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Point[] p = tangible.Arrays.initializeWithDefaultPointInstances(15);
		Input(p, n);
		double[] a = new double[60];
		int k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				int t = 0;
				while (t < k + 1 && (a[t] - Distance(p[i],p[j])>0.00001 || Distance(p[i],p[j]) - a[t] > 0.00001))
				{
					t++;
				}
				if (t == k + 1)
				{
					a[k] = Distance(p[i],p[j]);
					k++;
				}
			}
		} //??????????????a?
		int count = k; //??a????
		for (i = 0;i < count;i++)
		{
			for (j = i + 1;j < count;j++)
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
		{
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[k] > Distance(p[i],p[j]))
					{
						if (a[k] - Distance(p[i],p[j]) < 0.000001)
						{
							Output(p[i], p[j]);
						}
					}
					else
					{
						if (Distance(p[i],p[j]) - a[k] < 0.000001)
						{
							Output(p[i], p[j]);
						}
					}
				}
			}
			k++;
		} //?????????????????????????
		return 0;
	}
}

