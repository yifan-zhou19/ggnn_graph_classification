package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[10];
		float[] b = new float[10];
		float s;
		float t;
		float GPA;
		s = 0.0F;
		t = 0.0F;
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
				a[i] = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90F)
			{
				b[i] = 4.0F;
			}
			else if (b[i] >= 85F)
			{
				b[i] = 3.7F;
			}
			else if (b[i] >= 82F)
			{
				b[i] = 3.3F;
			}
			else if (b[i] >= 78F)
			{
				b[i] = 3.0F;
			}
			else if (b[i] >= 75F)
			{
				b[i] = 2.7F;
			}
			else if (b[i] >= 72F)
			{
				b[i] = 2.3F;
			}
			else if (b[i] >= 68F)
			{
				b[i] = 2.0F;
			}
			else if (b[i] >= 64F)
			{
				b[i] = 1.5F;
			}
			else if (b[i] >= 60F)
			{
				b[i] = 1.0F;
			}
			else
			{
				b[i] = 0.0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			s = s + a[i] * b[i];
			t = t + a[i];
		}
		GPA = s / t;
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

