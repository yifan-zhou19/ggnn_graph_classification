package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] z = new int[10];
		float[] s = new float[10];
		float[] u = new float[10];
		float a = 0.0F;
		float b;
		float c = 0.0F;
		float GPA;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(z[i]) = Integer.parseInt(tempVar2);
			}
			c = c + z[i];
			i++;
		}

		i = 0;
		while (i < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(s[i]) = Float.parseFloat(tempVar3);
			}
			i++;
		}
		i = 0;
		while (i < n)
		{
			if (s[i] >= 90F && s[i] <= 100F)
			{
				b = 4.0F;
			}
			if (s[i] >= 85F && s[i] <= 89F)
			{
				b = 3.7F;
			}
			if (s[i] >= 82F && s[i] <= 84F)
			{
				b = 3.3F;
			}
			 if (s[i] >= 78F && s[i] <= 81F)
			 {
				b = 3.0F;
			 }
			if (s[i] >= 75F && s[i] <= 77F)
			{
				b = 2.7F;
			}
			if (s[i] >= 72F && s[i] <= 74F)
			{
				b = 2.3F;
			}
			if (s[i] >= 68F && s[i] <= 71F)
			{
				b = 2.0F;
			}
			if (s[i] >= 64F && s[i] <= 67F)
			{
				b = 1.5F;
			}
			if (s[i] >= 60F && s[i] <= 63F)
			{
				b = 1.0F;
			}
			if (s[i] < 60F)
			{
				b = 0.0F;
			}
			u[i] = b * z[i];
			a = a + u[i];
			i++;
		}
		GPA = a / c;
		System.out.printf("%.2f",GPA);
		//scanf("%d",&n);
		return 0;
	}
}

