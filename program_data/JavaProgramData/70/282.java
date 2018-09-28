package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double a;
		double b;
		double d;
		double maxd;
		double maxd1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		double x,y;
	//	}
	//	*num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		num = (distance)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			(num + i).x = a;
			(num + i).y = b;
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				 for (j = i + 1;j < n;j++)
				 {

						d = Math.sqrt(((num + i).x - (num + j).x) * ((num + i).x - (num + j).x) + ((num + i).y - (num + j).y) * ((num + i).y - (num + j).y));
						if (j == i + 1)
						{
							   maxd = d;
						}
						else
						{
							if (d > maxd)
							{
							maxd = d;
							}
						}
				 }
				 maxd1 = maxd;
			}
			else
			{
				 for (j = i + 1;j < n;j++)
				 {
						d = Math.sqrt(((num + i).x - (num + j).x) * ((num + i).x - (num + j).x) + ((num + i).y - (num + j).y) * ((num + i).y - (num + j).y));
						if (j == i + 1)
						{
							   maxd = d;
						}
						else
						{
							if (d > maxd)
							{
							maxd = d;
							}
						}

				 }
				if (maxd > maxd1)
				{
				maxd1 = maxd;
				}
			}
		}
		System.out.printf("%.4lf",maxd1);
		return 0;
	}

}

