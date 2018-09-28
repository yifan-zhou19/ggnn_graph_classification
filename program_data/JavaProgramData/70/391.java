package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x,y;
	//	}
	//	s[20];
		double max = 0;
		int i;
		int k;
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[k].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[k].y = tempVar3;
			}
		}
		for (i = 1;i < n;i++)
		{
			for (k = 0;k < i;k++)
			{
				if (max < Math.sqrt((s[k].x - s[i].x) * (s[k].x - s[i].x) + (s[k].y - s[i].y) * (s[k].y - s[i].y)))
				{
					max = Math.sqrt((s[k].x - s[i].x) * (s[k].x - s[i].x) + (s[k].y - s[i].y) * (s[k].y - s[i].y));
				}
			}
		}
		System.out.printf("%.4lf",max);
	}

}

