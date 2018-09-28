package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int n;
		int i;
		int s;
		float[] c = new float[10];
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i = i + 1;
		}
		i = 1;
		while (i <= n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (b[i] >= 90 && b[i] <= 100)
			{
				c[i] = 4F;
			}
			else if (b[i] >= 85)
			{
				c[i] = 3.7F;
			}
			else if (b[i] >= 82)
			{
				c[i] = 3.3F;
			}
			else if (b[i] >= 78)
			{
				c[i] = 3F;
			}
			else if (b[i] >= 75)
			{
				c[i] = 2.7F;
			}
			else if (b[i] >= 72)
			{
				c[i] = 2.3F;
			}
			else if (b[i] >= 68)
			{
				c[i] = 2F;
			}
			else if (b[i] >= 64)
			{
				c[i] = 1.5F;
			}
			else if (b[i] >= 60)
			{
				c[i] = 1F;
			}
			else
			{
				c[i] = 0F;
			}
			i = i + 1;
		}
		i = 1;
		GPA = 0F;
		s = 0;
		while (i <= n)
		{
			GPA = GPA + a[i] * c[i];
			s = s + a[i];
			i = i + 1;
		}
		GPA = GPA / (float)s;
		System.out.printf("%.2f",GPA);
	}

}

