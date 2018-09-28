package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x,y;
	//	}
	//	zb[number];
			int n;
			double dis;
			double max = 0.0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			double x1;
			double y1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x1 = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead("" "");
			if (tempVar3 != null)
			{
				y1 = Double.parseDouble(tempVar3);
			}
				zb[i].x = x1;
				zb[i].y = y1;
		}
				for (i = 0;i < n;i++)
				{
			for (j = 0;j < n;j++)
			{
				dis = Math.sqrt(Math.pow(zb[i].x - zb[j].x,2) + Math.pow(zb[i].y - zb[j].y,2));
				if (dis > max)
				{
				max = dis;
				}
			}
				}
		System.out.printf("%.4f",max);
	}
}

