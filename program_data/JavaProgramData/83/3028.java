package <missing>;

public class GlobalMembers
{
	public static float gpoint(int gr)
	{
		if (gr <= 100 && gr >= 90)
		{
			return 4.0F;
		}
		else if (gr <= 89 && gr >= 85)
		{
			return 3.7F;
		}
		else if (gr <= 84 && gr >= 82)
		{
			return 3.3F;
		}
		else if (gr <= 81 && gr >= 78)
		{
			return 3.0F;
		}
		else if (gr <= 77 && gr >= 75)
		{
			return 2.7F;
		}
		else if (gr <= 74 && gr >= 72)
		{
			return 2.3F;
		}
		else if (gr <= 71 && gr >= 68)
		{
			return 2.0F;
		}
		else if (gr <= 67 && gr >= 64)
		{
			return 1.5F;
		}
		else if (gr <= 63 && gr >= 60)
		{
			return 1.0F;
		}
		return 0.0F;
	}
	public static int Main()
	{
		int n;
		float total_g = 0F;
		float total_f = 0F;
		int[] a = new int[11];
		int[] b = new int[11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
			total_f += a[i];
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b + i = tempVar3;
			}
			total_g += gpoint(b[i]) * ((float)a[i]);
		}
		System.out.printf("%.2f\n", total_g / total_f);
		return 0;
	}
}

