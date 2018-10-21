package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		double f = 0.0;
		double[][] b = new double[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct S
	//	{
	//		double x,y;
	//
	//	}
	//	s[1000];
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
				s[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].y = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (t = 0;t < n;t++)
			{
				b[i][t] = Math.sqrt((s[i].x - s[t].x) * (s[i].x - s[t].x) + (s[i].y - s[t].y) * (s[i].y - s[t].y));
				if (b[i][t] >= f)
				{
					f = b[i][t];
				}
			}
		}
		System.out.printf("%.4lf",f);


		return 0;
	}
}

