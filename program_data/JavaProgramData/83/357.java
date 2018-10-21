package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int d = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		float c = 0F;
		float f = int x;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			c = c + a[i] * f(b[i]);
			d = d + a[i];
		}
		System.out.printf("%.2f",c / d);
	}
	public static float f(int x)
	{
		if (x >= 90)
		{
			return 4.0F;
		}
		else if (x >= 85)
		{
			return 3.7F;
		}
		else if (x >= 82)
		{
			return 3.3F;
		}
		else if (x >= 78)
		{
			return 3.0F;
		}
		else if (x >= 75)
		{
			return 2.7F;
		}
		else if (x >= 72)
		{
			return 2.3F;
		}
		else if (x >= 68)
		{
			return 2.0F;
		}
		else if (x >= 64)
		{
			return 1.5F;
		}
		else if (x >= 60)
		{
			return 1.0F;
		}
		else
		{
			return 0F;
		}
	}
}

