package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int[] age = new int[100];
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
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
				a++;
			}
			if ((18 < age[i]) && (age[i] <= 35))
			{
				b++;
			}
			if ((35 < age[i]) && (age[i] <= 60))
			{
				c++;
			}
			if (age[i] > 60)
			{
				d++;
			}
			/*printf("%d,%d,%d,%d",a,b,c,d);*/
		}
		/*printf("%d,%d,%d,%d",a,b,c,d);*/
		double p;
		double q;
		double r;
		double s;
		p = a / n;
		q = b / n;
		r = c / n;
		s = d / n;
		System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\n60??: %.2lf%\n",p * 100,q * 100,r * 100,s * 100);


		return 0;
	}

}

