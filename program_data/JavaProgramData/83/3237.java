package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float c = 0F;
		float f = 0F;
		float d;
		float e;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = new int[10];
		int[] q = new int[10];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p[i]) = Integer.parseInt(tempVar2);
			}
			c += p[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(q[i]) = Integer.parseInt(tempVar3);
			}
			d = q[i];
			if (d >= 90F && d <= 100F)
			{
				e = 4.0F;
			}
			else if (d >= 85F && d <= 89F)
			{
				e = 3.7F;
			}
			else if (d >= 82F && d <= 84F)
			{
				e = 3.3F;
			}
			else if (d >= 78F && d <= 81F)
			{
				e = 3.0F;
			}
			else if (d >= 75F && d <= 77F)
			{
				e = 2.7F;
			}
			else if (d >= 72F && d <= 74F)
			{
				e = 2.3F;
			}
			else if (d >= 68F && d <= 71F)
			{
				e = 2.0F;
			}
			else if (d >= 64F && d <= 67F)
			{
				e = 1.5F;
			}
			else if (d >= 60F && d <= 63F)
			{
				e = 1.0F;
			}
			else if (d < 60F)
			{
				e = 0F;
			}
			f += e * p[i];
		}
		System.out.printf("%.2f",GPA = f / c);
		return 0;
	}


}

