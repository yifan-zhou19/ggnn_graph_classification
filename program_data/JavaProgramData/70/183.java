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
	//		float x;
	//		float y;
	//	}
	//	point[1000];
		int i = 0;
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				point[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				point[i].y = tempVar3;
			}
			i++;
		}while (i < n);
		double distance;
		double a;
		int j;
		i = j = 0;
		distance = 0;
		do
		{
			do
			{
				a = (point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y);
				if (a > distance)
				{
					distance = a;
				}
				else
				{
					distance = distance;
				}
				i++;
			}while (i < n);
			i = 0;
			j++;
		}while (j < n);
		distance = Math.sqrt(distance);
		System.out.printf("%.4f\n",distance);

	}
}

