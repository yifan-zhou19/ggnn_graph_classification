package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] age = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double x;
		double y;
		double z;
		double w;
		int i;
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
				age[i] = Integer.parseInt(tempVar2);
			}
			if (age[i] < 19)
			{
				a += 1;
			}
			else if (18 < age[i] && age[i] < 36)
			{
				b += 1;
			}
			else if (35 < age[i] && age[i] < 61)
			{
				c += 1;
			}
			else if (60 < age[i])
			{
				d += 1;
			}
		}
		x = (double)a / n * 100;
		y = (double)b / n * 100;
		z = (double)c / n * 100;
		w = (double)d / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",x,y,z,w);

	}


}

