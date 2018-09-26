package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s = 0;
		float t;
		float p = 0F;
		float q;
		int[] a = new int[10];
		int[] sz = new int[10];
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
			s = s + a[i];
		}
		for (int m = 0;m < n;m++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[m] = Integer.parseInt(tempVar3);
			}
			i = m;
		   if (sz[m] <= 100 && sz[m] >= 90)
		   {
					t = 4.0F;
		   }
		   if (sz[m] <= 89 && sz[m] >= 85)
		   {
					t = 3.7F;
		   }
		   if (sz[m] <= 84 && sz[m] >= 82)
		   {
					t = 3.3F;
		   }
		   if (sz[m] <= 81 && sz[m] >= 78)
		   {
					t = 3.0F;
		   }
		   if (sz[m] <= 77 && sz[m] >= 75)
		   {
					t = 2.7F;
		   }
		   if (sz[m] <= 74 && sz[m] >= 72)
		   {
					t = 2.3F;
		   }
		   if (sz[m] <= 71 && sz[m] >= 68)
		   {
					t = 2.0F;
		   }
		   if (sz[m] <= 67 && sz[m] >= 64)
		   {
					t = 1.5F;
		   }
		   if (sz[m] <= 63 && sz[m] >= 60)
		   {
					t = 1.0F;
		   }
		   if (sz[m] <= 59)
		   {
					t = 0F;
		   }
		   p = p + t * a[i];
		}
	q = p / s;
		System.out.printf("%.2f",q);
		return 0;
	}
}

