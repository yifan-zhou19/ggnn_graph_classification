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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		double x,y;
	//	};
		point pp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pp = (point)malloc(sizeof(point) * n);
		int i;
		int j;
		double temp = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				((pp + i).x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				((pp + i).y) = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (temp < (((pp + i).x) - ((pp + j).x)) * (((pp + i).x) - ((pp + j).x)) + (((pp + i).y) - ((pp + j).y)) * (((pp + i).y) - ((pp + j).y)))
				{
					temp = (((pp + i).x) - ((pp + j).x)) * (((pp + i).x) - ((pp + j).x)) + (((pp + i).y) - ((pp + j).y)) * (((pp + i).y) - ((pp + j).y));
				}
			}
		}
		System.out.printf("%.4f\n",Math.sqrt(temp));
	}
}

