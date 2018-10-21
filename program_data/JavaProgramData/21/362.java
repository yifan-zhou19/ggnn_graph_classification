package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] a = new float[300];
		float[] c = new float[300];
		float pingjun;
		float s = 0F;
		float t;
		float max = 0F;
		float m;
		float x;
		int n;
		int i;
		int j;
		int jishuqi = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			s = s + a[i];
		}
		pingjun = s / n;
		for (j = 0;j <= n - 1;j++)
		{
			if (Math.abs(a[j] - pingjun) > max)
			{
				max = Math.abs(a[j] - pingjun);
			}
		}
		m = pingjun - max;
		x = pingjun + max;
		for (j = 0;j <= n - 1;j++)
		{
			if (a[j] <= m != 0 || a[j] >= x)
			{

				c[jishuqi] = a[j];
				jishuqi = jishuqi + 1;
			}
		}
		if (jishuqi == 1)
		{

			System.out.printf("%d",(int)(c[jishuqi - 1]));
		}
		if (jishuqi >= 2)
		{
			for (i = 0;i <= jishuqi - 2;i++)
			{
				for (j = 0;j <= jishuqi - 2 - i;j++)
				{
					if (c[j] > c[j + 1])
					{
						t = c[j];
						c[j] = c[j + 1];
						c[j + 1] = t;
					}
				}
			}
			System.out.printf("%d",(int)(c[0]));
			for (i = 1;i <= jishuqi - 1;i++)
			{
				System.out.printf(",%d",(int)(c[i]));
			}
		}
	}
}

