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
		int i;
		int j;
		float dis = 0F;
		float x = 0F;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x,y;
	//	};
		point pt;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pt = (point) malloc(sizeof(point) * n);
		for (i = 0;i < n;i++)
		{
			float x1;
			float y1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x1 = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y1 = Float.parseFloat(tempVar3);
			}
			(pt + i).x = x1;
			(pt + i).y = y1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				x = Math.sqrt(((pt + i).x - (pt + j).x) * ((pt + i).x - (pt + j).x) + ((pt + i).y - (pt + j).y) * ((pt + i).y - (pt + j).y));
				if (x > dis)
				{
					dis = x;
				}
				else
				{
					dis = dis;
				}
			}
		}
		System.out.printf("%.4f",dis);
	}

}

