package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t = 0;
		int i;
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		float sum;
		float aver;
		float[] c = new float[10];
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
		sum = 0F;
		aver = 0F;
		for (i = 0;i < n;i++)
		{
			if (90 <= b[i] != 0 && b[i] <= 100)
			{
				c[i] = 4.0F;
			}
			else
			{
				if (85 <= b[i] != 0 && b[i] <= 89)
				{
					c[i] = 3.7F;
				}
			else
			{
				if (82 <= b[i] != 0 && b[i] <= 84)
				{
					c[i] = 3.3F;
				}
			else
			{
				if (78 <= b[i] != 0 && b[i] <= 81)
				{
					c[i] = 3.0F;
				}
			else
			{
				if (75 <= b[i] != 0 && b[i] <= 77)
				{
					c[i] = 2.7F;
				}
			else
			{
				if (72 <= b[i] != 0 && b[i] <= 74)
				{
					c[i] = 2.3F;
				}
			else
			{
				if (68 <= b[i] != 0 && b[i] <= 71)
				{
					c[i] = 2.0F;
				}
			else
			{
				if (64 <= b[i] != 0 && b[i] <= 67)
				{
					c[i] = 1.5F;
				}
			else
			{
				if (60 <= b[i] != 0 && b[i] <= 63)
				{
					c[i] = 1.0F;
				}
			else
			{
				c[i] = 0F;
			}
			}
			}
			}
			}
			}
			}
			}
			}
			sum = sum + a[i] * c[i];
			t = t + a[i];
		}
		aver = sum / t;
		System.out.printf("%.2f",aver);
	}


}

