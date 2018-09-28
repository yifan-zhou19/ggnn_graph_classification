package <missing>;

public class GlobalMembers
{
	public static float distance(float x1,float y1,float x2,float y2)
	{
		float z;
		z = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		float d;
		d = Math.sqrt(z);
		return d;
	}


	public static int Main()
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
	//		float x,y;
	//	}
	//	zuobiao[100];

		float dist;
		int i;
		int j;
		float dis = 0F;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zuobiao[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				zuobiao[i].y = tempVar3;
			}
			for (j = 0;j < i;j++)
			{
				dist = distance(zuobiao[i].x, zuobiao[i].y, zuobiao[j].x, zuobiao[j].y);
				if (dist >= dis)
				{
					dis = dist;
				}
			}
		}

		System.out.printf("%.4f\n",dis);
		return 0;
	}

}

