package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int k;
		int l;
			 double x0;
			 double y0;
			 double s = 0;
			 double w;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct dian
	//	{
	//		double x,y;
	//	}
	//	*d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		d = (dian) malloc(sizeof(dian) * n);
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x0 = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y0 = Double.parseDouble(tempVar3);
			}
					  (d + j).x = x0;
			(d + j).y = y0;

		}
		for (l = 0;l < n;l++)
		{
			for (k = l + 1;k < n;k++)
			{
				w = ((d + l).x - (d + k).x) * ((d + l).x - (d + k).x) + ((d + l).y - (d + k).y) * ((d + l).y - (d + k).y);
				if (s < Math.sqrt(w))
				{
					s = Math.sqrt(w);
				}

			}
		}
		System.out.printf("%.4f",s);

		return 0;
	}

}

