package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[300];
		float[] b = new float[300];
		float s = 0F;
		float ave;
		float m;
		float t;
		float r;
		int n;
		int i;
		int j;
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
				a[i] = Float.parseFloat(tempVar2);
			}
			s = s + a[i];
		}
		ave = s / n;
		for (i = 0;i < n;i++)
		{
			m = a[i] - ave;
			if (m >= 0F)
			{
				b[i] = m;
			}
			else
			{
				b[i] = -m;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b[i] < b[j])
				{
					t = b[i];
					b[i] = b[j];
					b[j] = t;
					r = a[i];
					a[i] = a[j];
					a[j] = r;
				}
			}
		}
		System.out.printf("%.0f",a[0]);
		for (i = 0;i < n - 1;i++)
		{
			if (b[i] == b[i + 1])
			{
				System.out.printf(",%.0f",a[i + 1]);
			}
			else
			{
				break;
			}
		}
	}

}

