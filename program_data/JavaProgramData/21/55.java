package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		float ave;
		float[] b = new float[100];
		float k = 0F;
		float m = 0F;
		float t = 0F;
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
			m = m + a[i];
		}
		ave = (float)m / n;


		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs((float)(a[i] - ave));
			if (b[i] > k)
			{
				  k = b[i];
			}

		}

		for (i = 0;i < n;i++)
		{
			if (b[i] == k)
			{
				t++;
				if (t == 1F)
				{
				System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
		return 0;
	}
}

