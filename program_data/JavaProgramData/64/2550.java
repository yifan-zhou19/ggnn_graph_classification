package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		float a[2], b[2], c[2];
	//		float d;
	//	}
	//	dis[55];
		int n;
		int i;
		int j;
		int k = 0;
		int[] r = new int[55];
		int t;
		float[] x = new float[11];
		float[] y = new float[11];
		float[] z = new float[11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				dis[k].d = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
				dis[k].a[0] = x[i];
				dis[k].a[1] = x[j];
				dis[k].b[0] = y[i];
				dis[k].b[1] = y[j];
				dis[k].c[0] = z[i];
				dis[k].c[1] = z[j];
				r[k] = k;
				k++;
			}
		}
		for (i = 0; i < k - 1; i++)
		{
			for (j = 0; j < k - 1 - i; j++)
			{
				if (dis[r[j]].d < dis[r[j + 1]].d)
				{
					t = r[j];
					r[j] = r[j + 1];
					r[j + 1] = t;
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n", (int)dis[r[i]].a[0], (int)dis[r[i]].b[0], (int)dis[r[i]].c[0], (int)dis[r[i]].a[1], (int)dis[r[i]].b[1], (int)dis[r[i]].c[1], Math.sqrt(dis[r[i]].d));
		}
	}
}

