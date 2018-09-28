package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int s = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		float t = 0F;
		float[] c = new float[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			s = s + a[i];
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (b[i] <= 100 && b[i] >= 90)
			{
				c[i] = 4.0F;
			}
			else if (b[i] <= 89 && b[i] >= 85)
			{
				c[i] = 3.7F;
			}
			else if (b[i] <= 84 && b[i] >= 82)
			{
				c[i] = 3.3F;
			}
			else if (b[i] <= 81 && b[i] >= 78)
			{
				c[i] = 3.0F;
			}
			else if (b[i] <= 77 && b[i] >= 75)
			{
				c[i] = 2.7F;
			}
			else if (b[i] <= 74 && b[i] >= 72)
			{
				c[i] = 2.3F;
			}
			else if (b[i] <= 71 && b[i] >= 68)
			{
				c[i] = 2.0F;
			}
			else if (b[i] <= 67 && b[i] >= 64)
			{
				c[i] = 1.5F;
			}
			else if (b[i] <= 63 && b[i] >= 60)
			{
				c[i] = 1.0F;
			}
			t += c[i] * a[i];
		}
		System.out.printf("%.2f",t / s);
	}
}

