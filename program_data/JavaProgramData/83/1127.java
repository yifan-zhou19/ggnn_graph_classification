package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] xf = new int[10];
		int[] df = new int[10];
		int zxf = 0;
		float[] xfjd = new float[10];
		float zxfjd = 0F;
		float gpa;
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
				xf[i] = Integer.parseInt(tempVar2);
			}
			zxf = zxf + xf[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df[i] = Integer.parseInt(tempVar3);
			}
			if (df[i] <= 100 && df[i]>89)
			{
				xfjd[i] = 4.0F;
			}
			if (df[i] <= 89 && df[i]>84)
			{
				xfjd[i] = 3.7F;
			}
			if (df[i] <= 84 && df[i]>81)
			{
				xfjd[i] = 3.3F;
			}
			if (df[i] <= 81 && df[i]>77)
			{
				xfjd[i] = 3.0F;
			}
			if (df[i] <= 77 && df[i]>74)
			{
				xfjd[i] = 2.7F;
			}
			if (df[i] <= 74 && df[i]>71)
			{
				xfjd[i] = 2.3F;
			}
			if (df[i] <= 71 && df[i]>67)
			{
				xfjd[i] = 2.0F;
			}
			if (df[i] <= 67 && df[i]>63)
			{
				xfjd[i] = 1.5F;
			}
			if (df[i] <= 63 && df[i]>59)
			{
				xfjd[i] = 1.0F;
			}
			if (df[i] <= 59)
			{
				xfjd[i] = 0F;
			}
			zxfjd = zxfjd + xfjd[i] * xf[i];
		}
		gpa = zxfjd / zxf;
		System.out.printf("%.2f\n",gpa);
	}
}

