package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		int c = 0;
		int i;
		int n;
		float g = 0F;
		float b;
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
			c = a[i] + c;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			if (b >= 60F && b < 64F)
			{
				b = 1F;
			}
			else if (b > 63F && b < 68F)
			{
				b = 1.5F;
			}
			else if (b > 67F && b < 72F)
			{
				b = 2F;
			}
			else if (b > 71F && b < 75F)
			{
				b = 2.3F;
			}
			else if (b > 74F && b < 78F)
			{
				b = 2.7F;
			}
			else if (b > 77F && b < 82F)
			{
				b = 3.0F;
			}
			else if (b > 81F && b < 85F)
			{
				b = 3.3F;
			}
			else if (b > 84F && b < 90F)
			{
				b = 3.7F;
			}
			else if (b > 89F && b <= 100F)
			{
				b = 4F;
			}
			else
			{
				b = 0F;
			}
			g = g + b * a[i];
		}
		g = g / c;
		System.out.printf("%.2f\n",g);
	}
}

