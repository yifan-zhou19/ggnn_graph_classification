package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		double o = 0;
		double tw = 0;
		double th = 0;
		double f = 0;
		double z = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] < 18 || a[i] == 18)
			{
				o++;
			}
			if (a[i] > 18 && a[i] < 36)
			{
				tw++;
			}
			if (a[i] > 35 && a[i] < 61)
			{
				th++;
			}
			if (a[i] > 60)
			{
				f++;
			}
			z++;
		}
		o = o / z * 100;
		tw = tw / z * 100;
		th = th / z * 100;
		f = f / z * 100;
		System.out.printf("1-18: %.2lf",o);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",tw);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf%",th);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",f);
		System.out.print("%%\n");

		return 0;
	}



}

