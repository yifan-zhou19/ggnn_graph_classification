package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k = 0;
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		float c;
		float m = 0F;
		float GPA;
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
			if (b[i] >= 90 && b[i] <= 100)
			{
				c = 4.0F;
			}
			else if (b[i] >= 85)
			{
				c = 3.7F;
			}
			else if (b[i] >= 82)
			{
				c = 3.3F;
			}
			else if (b[i] >= 78)
			{
				c = 3.0F;
			}
			else if (b[i] >= 75)
			{
				c = 2.7F;
			}
			else if (b[i] >= 72)
			{
				c = 2.3F;
			}
			else if (b[i] >= 68)
			{
				c = 2.0F;
			}
			else if (b[i] >= 64)
			{
				c = 1.5F;
			}
			else if (b[i] >= 60)
			{
				c = 1.0F;
			}
			else if (b[i] >= 0)
			{
				c = 0F;
			}
			m = m + a[i] * c;
			k = k + a[i];
		}
		GPA = m / k;
		System.out.printf("%.2f\n",GPA);
	}
}

