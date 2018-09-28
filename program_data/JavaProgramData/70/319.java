package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double d;
		double max;
		double max1;
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
				((num + i).x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				((num + i).y) = tempVar3;
			}
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
							   max = d;
						}
						else
						{
							if (d > max)
							{
							max = d;
							}
						}
				 }
				 max1 = max;
			}
			else
			{
				 for (j = i + 1;j < n;j++)
				 {
						d = Math.sqrt(((num + i).x - (num + j).x) * ((num + i).x - (num + j).x) + ((num + i).y - (num + j).y) * ((num + i).y - (num + j).y));
						if (j == i + 1)
						{
							   max = d;
						}
						else
						{
							if (d > max)
							{
							max = d;
							}
						}

				 }
				if (max > max1)
				{
				max1 = max;
				}
			}
		}
		System.out.printf("%.4lf",max1);
		return 0;
	}

}

