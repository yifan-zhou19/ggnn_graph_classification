package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int m;
		int num;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *dis,a;
		double dis;
		double a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//	   double x,y;
	//	};
		point dot;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		dot = (point)malloc(sizeof(point) * n);


		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				((dot + i).x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				((dot + i).y) = tempVar3;
			}
		} //?????

		num = (n * (n - 1) / 2);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		dis = (double)malloc((Double.SIZE / Byte.SIZE) * num); //????????


		for (m = 0,i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++,m++)
			{
			 dis[m] = Math.sqrt(((dot + i).x - (dot + j).x) * ((dot + i).x - (dot + j).x) + ((dot + i).y - (dot + j).y) * ((dot + i).y - (dot + j).y));
			}
		} //?????????


		for (m = 0;m < (num - 1);m++)
		{
			if (dis[m] > dis[m + 1])
			{
			 a = dis[m + 1];
			 dis[m + 1] = dis[m];
			 dis[m] = a;
			}
		} //?????????

		 System.out.printf("%.4f\n",dis[num - 1]);
		dot = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(dis);
	}

}

