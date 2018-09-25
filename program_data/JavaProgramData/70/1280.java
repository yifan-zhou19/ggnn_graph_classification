package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct v
	//	{
	//		double x;
	//		double y;
	//	}
	//	a[2005];
		double maxd = 0;
		for (int i = 0; i < n; i++)
		{
			a[i].x = ConsoleInput.readToWhiteSpace(true);
			a[i].y = ConsoleInput.readToWhiteSpace(true);
			for (int j = 0; j < i; j++)
			{
				double num = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y));
				if (num > maxd)
				{
					maxd = num;
				}
			}
		}
		System.out.printf("%.4f\n", maxd);
	}
}

