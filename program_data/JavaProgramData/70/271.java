package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		float x;
	//		float y;
	//	}
	//	a[5000];
		int n;
		int i;
		int j;
		float q;
		double l = 0;
		double m = 0;
		double m1;
		double m2;
		double m3;
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
				a[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].y = tempVar3;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				m1 = a[i].x - a[j].x;
				m2 = a[i].y - a[j].y;
				m3 = Math.pow(m1,2) + Math.pow(m2,2);
				l = Math.pow(m3,0.5);
				if (l >= m)
				{
				m = l;
				}
			}
		}
		q = (float)m;
		System.out.printf("%.4f",q);
	}

}

