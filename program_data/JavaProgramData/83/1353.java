package <missing>;

public class GlobalMembers
{
	public static void Main()

	{
		int n;
		int i;
		int b;
		float[] a = new float[200];
		float c;
		float x = 0F;
		float y = 0F;
		float z;
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
			x += a[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (b <= 100 && b >= 90)
			{
				c = 4.0F;
			}
			if (b <= 89 && b >= 85)
			{
				c = 3.7F;
			}
			if (b <= 84 && b >= 82)
			{
				c = 3.3F;
			}
			if (b <= 81 && b >= 78)
			{
				c = 3.0F;
			}
			if (b <= 77 && b >= 75)
			{
				c = 2.7F;
			}
			if (b <= 74 && b >= 72)
			{
				c = 2.3F;
			}
			if (b <= 71 && b >= 68)
			{
				c = 2.0F;
			}
			if (b <= 67 && b >= 64)
			{
				c = 1.5F;
			}
			if (b <= 63 && b >= 60)
			{
				c = 1.0F;
			}
			if (b < 60)
			{
				c = 0F;
			}
			y = y + c * a[i];

		}

	z = y / x;
	System.out.printf("%.2f",z);

	}
}

