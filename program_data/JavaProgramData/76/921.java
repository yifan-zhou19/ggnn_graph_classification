package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//		int a,b;
	//	}
	//	qujian[50001];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(qujian[i].a) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(qujian[i].b) = tempVar3;
			}
		}
		int max;
		int min;
		min = qujian[0].a;
		max = qujian[0].b;
		for (i = 0;i < n;i++)
		{
			if (min > qujian[i].a)
			{
				min = qujian[i].a;
			}
			if (max < qujian[i].b)
			{
				max = qujian[i].b;
			}
		}
		int m;
		double s;

		for (s = 1.0 * min;s <= max;s = s + 0.5)
		{
			for (i = 0;i < n + 1;i++)
			{
				if (i == n)
				{
					m = 0;
					break;
				}
				if (s <= qujian[i].b && s >= qujian[i].a)
				{
					break;
					m = 1;
				}
			}
			if (m == 0)
			{
				System.out.print("no");
				break;
			}
			if (s == max)
			{
				System.out.printf("%d %d",min,max);
			}
		}
		return 0;
	}

}

