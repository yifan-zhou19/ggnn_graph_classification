package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double large = 0;
		double dis;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//	double x;
	//	double y;
	//	}
	//	a[10000];

		int j;
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].y = tempVar3;
			}
		}




			for (i = 0;i < n;i++)
			{
				for (j = 0;j < i;j++)
				{
					dis = Math.sqrt(Math.pow(a[i].x - a[j].x,2) + Math.pow(a[i].y - a[j].y,2));

			if (dis > large)
			{
				large = dis;
			}
				}
			}

		System.out.printf("%.4f\n",large);

		return 0;


	}


}

