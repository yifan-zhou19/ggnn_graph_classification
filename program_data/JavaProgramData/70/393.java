package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		double l;
		double max;
		max = 0;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double a,b;
	//	}
	//	s[100];
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
				s[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].b = tempVar3;
			}
			for (j = 0;j < i;j++)
			{
				l = Math.sqrt((s[i].a - s[j].a) * (s[i].a - s[j].a) + (s[i].b - s[j].b) * (s[i].b - s[j].b));
				if (l > max)
				{
					max = l;
				}
			}
		}
		System.out.printf("%.4lf",max);
	}

}

