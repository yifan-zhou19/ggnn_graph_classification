package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a; // a ????????
		int i;
		int j;
		double[] value = new double[100];
		int number = 0; //????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x;
	//		double y;
	//
	//	}
	//	point[10];
		for (i = 0;i < a;i++)
		{ //?point ??
			double m;
			double n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Double.parseDouble(tempVar3);
			}
			point[i].x = m;
			point[i].y = n;
		}

		for (i = 0;i < a - 1;i++)
		{
			for (j = a - 1;j > i;j--)
			{
		   value[number] = Math.sqrt(Math.pow((point[i].x - point[j].x),2) + Math.pow((point[i].y - point[j].y),2));
			number++;
			}
		}

		for (i = 0;i < number;i++)
		{ //???? a-1
			double turn;
			if (value[i] > value[i + 1])
			{
			turn = value[i + 1];
			value[i + 1] = value[i];
			value[i] = turn;
			}
			else
			{
				;
			}
		}

			System.out.printf("%.4lf",value[number]);


	}


}

