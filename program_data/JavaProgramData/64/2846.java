package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x,y,z,i;
	//	}
	//	points[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//		struct jieguo
	//		{
	//		struct point pointqian;
	//		struct point pointhou;
	//		double juliss;
	//	}
	//	e,jieguos[45];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				points[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				points[i].y = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				points[i].z = tempVar4;
			}
		}
		int m = 0;
		int k = 0;
		i = 0;
		for (m = 0;m < n;m++)
		{
			for (k = m + 1;k < n;k++)
			{
				jieguos[i].pointqian = points[m];
				jieguos[i].pointhou = points[k];
				jieguos[i].juliss = Math.sqrt((jieguos[i].pointqian.x - jieguos[i].pointhou.x) * (jieguos[i].pointqian.x - jieguos[i].pointhou.x) + (jieguos[i].pointqian.y - jieguos[i].pointhou.y) * (jieguos[i].pointqian.y - jieguos[i].pointhou.y) + (jieguos[i].pointqian.z - jieguos[i].pointhou.z) * (jieguos[i].pointqian.z - jieguos[i].pointhou.z));
				i++;
			}
		}
		for (k = 1;k < (n * (n - 1) / 2);k++)
		{
			for (i = 0;i < (n * (n - 1) / 2) - k;i++)
			{
				if (jieguos[i].juliss < jieguos[i + 1].juliss)
				{
					e = jieguos[i + 1];
					jieguos[i + 1] = jieguos[i];
					jieguos[i] = e;
				}
			}
		}
		for (i = 0;i < (n * (n - 1) / 2);i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",jieguos[i].pointqian.x,jieguos[i].pointqian.y,jieguos[i].pointqian.z,jieguos[i].pointhou.x,jieguos[i].pointhou.y,jieguos[i].pointhou.z,jieguos[i].juliss);
		}
		return 0;
	}
}

