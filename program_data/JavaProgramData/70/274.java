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
		double r = 0;
		double tmp = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x;
	//		double y;
	//	}
	//	*num;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		num = (point)malloc(sizeof(point) * n);
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(num + i).x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(num + i).y = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				tmp = Math.sqrt(((num + i).x - (num + j).x) * ((num + i).x - (num + j).x) + ((num + i).y - (num + j).y) * ((num + i).y - (num + j).y));
				if (tmp > r)
				{
					r = tmp;
				}
			}
		}
		System.out.printf("%.4lf\n",r);
		num = null;
		return 0;
	}

}

