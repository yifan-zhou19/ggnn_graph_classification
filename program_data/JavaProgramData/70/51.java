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
		float[][] dist = new float[100][100];

		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zuobiao[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				zuobiao[i].y = tempVar3;
			}

		}


		float dis = dist[0][0];
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dist[i][j] = distance(zuobiao[i].x, zuobiao[i].y, zuobiao[j].x, zuobiao[j].y);
				if (dist[i][j] >= dis)
				{
					dis = dist[i][j];
				}
			}
		}



		System.out.printf("%.4f\n",dis);
		return 0;
	}
}

