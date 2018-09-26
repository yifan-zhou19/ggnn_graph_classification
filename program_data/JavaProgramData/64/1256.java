package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	Point[10];
		int n;
		int i;
		int j;
		int k = 0;
		int[] f = new int[45];
		int[] b = new int[45];
		int temp;
		double[] d = new double[45];
		double num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				Point[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				Point[i].y = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				Point[i].z = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k] = Math.sqrt((Point[i].x - Point[j].x) * (Point[i].x - Point[j].x) + (Point[i].y - Point[j].y) * (Point[i].y - Point[j].y) + (Point[i].z - Point[j].z) * (Point[i].z - Point[j].z));
				f[k] = i;
				b[k] = j;
				k = k + 1;
			}

		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (d[j] < d[j + 1])
				{
					temp = f[j];
					f[j] = f[j + 1];
					f[j + 1] = temp;
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
					num = d[j];
					d[j] = d[j + 1];
					d[j + 1] = num;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",Point[f[i]].x,Point[f[i]].y,Point[f[i]].z,Point[b[i]].x,Point[b[i]].y,Point[b[i]].z,d[i]);
		}
		return 0;
	}
}

