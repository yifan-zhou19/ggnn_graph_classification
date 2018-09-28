package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double c;
		double d;
		double z;
		double max = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x,y;
	//	}
	//	a[100];
		int i;
		int n;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Double.parseDouble(tempVar3);
			}
			a[i].x = c;
			a[i].y = d;

		}
		for (i = 0;i < n;i++)
		{
			for (b = 0;b < n;b++)
			{
			   z = Math.sqrt((a[i].x - a[b].x) * (a[i].x - a[b].x) + (a[i].y - a[b].y) * (a[i].y - a[b].y));
			   if (z > max)
			   {
				   max = z;
			   }
			   else
			   {
				   max = max;
			   }
			}
		}
		System.out.printf("%.4f\n",max);
	}


}

