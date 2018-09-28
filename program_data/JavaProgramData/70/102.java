package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		float x,y;
	//	}
	//	p[num];
		int n;
		int i;
		int m;
		float max = 0F;
		float d;
		float c;
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
				(p[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(p[i].y) = tempVar3;
			}
			for (m = 0;m < i;m++)
			{
				d = (p[i].x - p[m].x) * (p[i].x - p[m].x) + (p[i].y - p[m].y) * (p[i].y - p[m].y);
				c = (float)Math.pow(d,0.5);

		if (c > max)
		{
			max = c;
		}
			}
		}
		System.out.printf("%.4f",max);
	}
}

