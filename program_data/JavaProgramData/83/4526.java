package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int[] m = new int[10];
		int n;
		int i;
		int c;
		float GPA;
		float b;
		float s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0F;
		c = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			c += m[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (90 <= a[i] != 0 && a[i] <= 100)
			{
				b = 4.0F;
			}
					if (85 <= a[i] != 0 && a[i] <= 89)
					{
							b = 3.7F;
					}
			if (82 <= a[i] != 0 && a[i] <= 84)
			{
				b = 3.3F;
			}
			if (78 <= a[i] != 0 && a[i] <= 81)
			{
				b = 3.0F;
			}
			if (75 <= a[i] != 0 && a[i] <= 77)
			{
							b = 2.7F;
			}
				if (72 <= a[i] != 0 && a[i] <= 74)
				{
						b = 2.3F;
				}
					if (68 <= a[i] != 0 && a[i] <= 71)
					{
				b = 2.0F;
					}
				if (64 <= a[i] != 0 && a[i] <= 67)
				{
					b = 1.5F;
				}
				if (60 <= a[i] != 0 && a[i] <= 63)
				{
					b = 1.0F;
				}
				if (a[i] < 60)
				{
						b = 0.0F;
				}
			s += b * m[i];

		}
		GPA = s / c;
		System.out.printf("%.2f",GPA);
		return 0;
	}

}

