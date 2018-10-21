package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x;
	//		double y;
	//	}
	//	p[50];
		double[] dis = new double[100];
		double fdis = 0;
		int m = 0;
		int n = 0;
		int a;
		int b;
		int c;
		int i;
		do
		{
			dis[n] = 0;
			n++;
		}while (n < 100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[m].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[m].y = tempVar3;
			}
			m++;
		}while (m < n);
		a = 0;
		b = 0;
		c = 0;
		do
		{
			b = 0;
			do
			{
				dis[c] = Math.sqrt((p[a].x - p[b].x) * (p[a].x - p[b].x) + (p[a].y - p[b].y) * (p[a].y - p[b].y));
				b++;
				c++;
			}while (b < n);
			a++;
		}while (a < n);
		i = n * n + 1;
		m = 0;
		do
		{
			if (dis[m] > fdis)
			{
				fdis = dis[m];
			}
				m++;
		}while (m < i);
		System.out.printf("%.4lf\n",fdis);
		return 0;
	}
}

