package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x = 0;
		float y = 0F;
		int[] sz1 = new int[10];
		int[] sz2 = new int[10];
		float[] sz3 = new float[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz2[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
		x += sz2[i];
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz1[i] = Integer.parseInt(tempVar3);
		}
		if (sz1[i] >= 90 && sz1[i] <= 100)
		{
		sz3[i] = 4.0 * sz2[i];
		}
		else if (sz1[i] >= 85 && sz1[i] <= 89)
		{
		sz3[i] = 3.7 * sz2[i];
		}
		else if (sz1[i] >= 82 && sz1[i] <= 84)
		{
		sz3[i] = 3.3 * sz2[i];
		}
		else if (sz1[i] >= 78 && sz1[i] <= 81)
		{
		sz3[i] = 3.0 * sz2[i];
		}
		else if (sz1[i] >= 75 && sz1[i] <= 77)
		{
		sz3[i] = 2.7 * sz2[i];
		}
		else if (sz1[i] >= 72 && sz1[i] <= 74)
		{
		sz3[i] = 2.3 * sz2[i];
		}
		else if (sz1[i] >= 68 && sz1[i] <= 71)
		{
		sz3[i] = 2.0 * sz2[i];
		}
		else if (sz1[i] >= 64 && sz1[i] <= 67)
		{
		sz3[i] = 1.5 * sz2[i];
		}
		else if (sz1[i] >= 60 && sz1[i] <= 63)
		{
		sz3[i] = 1.0 * sz2[i];
		}
		else if (sz1[i] < 60)
		{
		sz3[i] = 0.0 * sz2[i];
		}
		}
		for (i = 0;i < n;i++)
		{
		y += sz3[i];
		}
		System.out.printf("%.2f",y / x);
		return 0;
	}
}

