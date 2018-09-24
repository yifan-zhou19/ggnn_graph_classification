package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int flag = 0;
		int j = 0;
		int[] d = new int[100];
		float sum = 0F;
		float aver = 0F;
		float max = 0F;
		float t = 0F;
		float m = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		aver = sum / n;
		for (i = 0;i < n;i++)
		{
			m = a[i] - aver;
			if (m > 0F)
			{
				b[i] = m;
			}
			if (m < 0F)
			{
				b[i] = -m;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				flag++;
				c[j] = a[i];
				j++;
			}
		}
		for (j = 0;j < flag - 1;j++)
		{
			for (i = 0;i < flag - 1 - j;i++)
			{
				if (c[i] > c[i + 1])
				{
					t = c[i];
					c[i] = c[i + 1];
					c[i + 1] = t;
				}
			}
		}
		for (i = 0;i < flag;i++)
		{
			d[i] = (int)c[i];
		}

		System.out.printf("%d",d[0]);
				for (j = 1;j < flag;j++)
				{
				System.out.printf(",%d",d[j]);
				}
		return 0;
	}
}

