package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] k = new int[100];
		int sum = 0;
		int t;
		int q;
		float a;
		float[] p = new float[100];
		float t1;
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
				k[i] = Integer.parseInt(tempVar2);
			}
			sum += k[i];
		}
		a = (float)sum / (float)n;
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (k[i] > k[i + 1])
				{
					t = k[i];
					k[i] = k[i + 1];
					k[i + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			p[i] = a - k[i];
			if (p[i] < 0F)
			{
				p[i] = -p[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			q = 0;
			if (p[i] > p[q])
			{
				q = i;
			}

		}
		System.out.printf("%d",k[q]);
		t1 = p[q];
		p[q] = 0F;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(p[i] - t1) <= 0.0000001)
			{
				System.out.printf(",%d",k[i]);
			}
		}


	}
}

