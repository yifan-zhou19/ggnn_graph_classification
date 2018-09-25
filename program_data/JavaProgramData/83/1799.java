package <missing>;

public class GlobalMembers
{
	public static float jd(int x)
	{
		if (90 <= x != 0 && x <= 100)
		{
			return 4.0F;
		}
		if (85 <= x != 0 && x <= 89)
		{
			return 3.7F;
		}
		if (82 <= x != 0 && x <= 84)
		{
			return 3.3F;
		}
		if (78 <= x != 0 && x <= 81)
		{
			return 3.0F;
		}
		if (75 <= x != 0 && x <= 77)
		{
			return 2.7F;
		}
		if (72 <= x != 0 && x <= 74)
		{
			return 2.3F;
		}
		if (68 <= x != 0 && x <= 71)
		{
			return 2.0F;
		}
		if (64 <= x != 0 && x <= 67)
		{
			return 1.5F;
		}
		if (60 <= x != 0 && x <= 63)
		{
			return 1.0F;
		}
		else
		{
			return 0F;
		}
	}
	public static int Main()
	{
		int x;
		int n;
		int zxf = 0;
		float zjd = 0F;
		float a;
		int[] cj = new int[10];
		int[] xf = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		i = 0;
		while (i < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cj[i] = Integer.parseInt(tempVar3);
			}
			i++;
		}
		i = 0;
		while (i < n)
		{
			zxf += xf[i];
			i++;
		}
		i = 0;
		while (i < n)
		{
			zjd += (jd(cj[i]) * xf[i]);
			i++;
		}
	a = 1.0 * zjd / zxf;
	System.out.printf("%.2f",a);
	}
}

