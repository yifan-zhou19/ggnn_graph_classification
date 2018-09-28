package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double t;
		double[][] s = new double[1000][1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x;
	//		double y;
	//
	//	}
	//	place[10000];
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
				place[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				place[i].y = tempVar3;
			}

		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				s[i][j] = Math.sqrt((place[j].x - place[i].x) * (place[j].x - place[i].x) + (place[j].y - place[i].y) * (place[j].y - place[i].y));
				if (s[i][j] > s[0][0])
				{
					t = s[0][0];
					s[0][0] = s[i][j];
					s[i][j] = t;
				}
			}
		}


		System.out.printf("%.4lf\n", s[0][0]);
		return 0;
	}
}

