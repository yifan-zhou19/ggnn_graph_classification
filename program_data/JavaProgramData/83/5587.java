package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s1 = 0;
		float s2 = 0.00F;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xf = new int[10];
		int[] fs = new int[10];
	   float[] jd = new float[10];
	   float[] xfjd = new float[10];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
			for (i = 0;i < n;i++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				fs[i] = Integer.parseInt(tempVar3);
			}
			}
		for (i = 0;i < n;i++)
		{
			if (fs[i] >= 90 && fs[i] <= 100)
			{
			xfjd[i] = 4.0 * xf[i];
			}
			else if (fs[i] >= 85 && fs[i] <= 89)
			{
			xfjd[i] = 3.7 * xf[i];
			}
			 else if (fs[i] >= 82 && fs[i] <= 84)
			 {
			xfjd[i] = 3.3 * xf[i];
			 }
			 else if (fs[i] >= 78 && fs[i] <= 81)
			 {
			xfjd[i] = 3.0 * xf[i];
			 }
			 else if (fs[i] >= 75 && fs[i] <= 77)
			 {
			xfjd[i] = 2.7 * xf[i];
			 }
			 else if (fs[i] >= 72 && fs[i] <= 74)
			 {
			xfjd[i] = 2.3 * xf[i];
			 }
			 else if (fs[i] >= 68 && fs[i] <= 71)
			 {
			xfjd[i] = 2.0 * xf[i];
			 }
			 else if (fs[i] >= 64 && fs[i] <= 67)
			 {
			xfjd[i] = 1.5 * xf[i];
			 }
			 else if (fs[i] >= 60 && fs[i] <= 63)
			 {
			xfjd[i] = 1.0 * xf[i];
			 }
			 else if (fs[i] < 60)
			 {
			xfjd[i] = 0 * xf[i];
			 }
		}
		for (i = 0;i < n;i++)
		{
			s1 = s1 + xf[i];
			s2 = s2 + xfjd[i];
		}
		GPA = s2 / s1;
		System.out.printf("%.2f",GPA);
		return 0;
	}

}

