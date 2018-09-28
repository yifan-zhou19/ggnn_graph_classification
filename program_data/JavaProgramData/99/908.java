package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		int i;
		int f;
		double b;
		double c;
		double d;
		double e;
		int w = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		int[] age = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			f = Integer.parseInt(tempVar);
		}
		for (i = 0;i < f;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(age[i]) = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < f;i++)
		{
		if (age[i] < 19 && 0 < age[i])
		{
		w = w + 1;
		}
		if (age[i] < 36 && 18 < age[i])
		{
		x = x + 1;
		}
		if (age[i] < 61 && 35 < age[i])
		{
		y = y + 1;
		}
		if (age[i] > 60)
		{
		z = z + 1;
		}
		}
		b = 1.0 * w / f * 100;
		c = 1.0 * x / f * 100;
		d = 1.0 * y / f * 100;
		e = 1.0 * z / f * 100;
		System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\n60??: %.2lf%",b,c,d,e);
		return 0;
		}
}

