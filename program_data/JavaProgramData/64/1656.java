package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		   int x,y,z;
	//		   }
	//		   points[10];
		double[] d = new double[45];
		double e;
		double a;
		int n;
		int i;
		int j;
		int k = 0;
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
					points[i].x = tempVar2;
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					points[i].y = tempVar3;
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					points[i].z = tempVar4;
				}
		}
		for (i = 0;i < n;i++)
		{
						 for (j = i + 1;j < n;j++)
						 {
											a = 1.0 * (points[i].x - points[j].x) * (points[i].x - points[j].x) + 1.0 * (points[i].y - points[j].y) * (points[i].y - points[j].y) + 1.0 * (points[i].z - points[j].z) * (points[i].z - points[j].z);
											d[k] = Math.sqrt(a);
											k++;
						 }
		}
		for (k = 0;k < n * (n - 1) / 2;k++)
		{
				for (i = 0;i < n * (n - 1) / 2 - 1 - k;i++)
				{
										if (d[i] < d[i + 1])
										{
															e = d[i + 1];
															d[i + 1] = d[i];
															d[i] = e;
										}
				}
		}
		for (k = 1;k < n * (n - 1) / 2;k++)
		{
						 if (d[k] == d[k - 1])
						 {
										  d[k - 1] = 0;
						 }
		}
		for (int b = 0;b < n * (n - 1) / 2;b++)
		{
				 for (i = 0;i < n;i++)
				 {
						 for (j = i + 1;j < n;j++)
						 {
											a = 1.0 * (points[i].x - points[j].x) * (points[i].x - points[j].x) + 1.0 * (points[i].y - points[j].y) * (points[i].y - points[j].y) + 1.0 * (points[i].z - points[j].z) * (points[i].z - points[j].z);
											e = Math.sqrt(a);
											if (d[b] == e)
											{
														System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",points[i].x,points[i].y,points[i].z,points[j].x,points[j].y,points[j].z,d[b]);
											}

						 }
				 }
		}
		return 0;
	}

}

