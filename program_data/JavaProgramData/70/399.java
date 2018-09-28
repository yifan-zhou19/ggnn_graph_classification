package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		float x;
	//		float y;
	//	}
	//	m[50];
		int n;
		int i;
		int j;
		double s;
		double max = 0;
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
				m[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m[i].y = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - i;j++)
			{
				s = ((double)m[i].x - (double)m[i + j].x) * ((double)m[i].x - (double)m[i + j].x) + ((double)m[i].y - (double)m[i + j].y) * ((double)m[i].y - (double)m[i + j].y);
				if (max < s)
				{
					max = s;
				}
			}
		}
		System.out.printf("%.4f\n",Math.sqrt(max));
	}
}

