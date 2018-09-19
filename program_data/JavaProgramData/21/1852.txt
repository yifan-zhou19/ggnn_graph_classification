package <missing>;

public class GlobalMembers
{
	public static void f1(float[] a, int x)
	{
		int i;
		int j;
		float t;
		for (i = 0;i < x - 1;i++)
		{
			for (j = 0;j < x - 1;j++)
			{
				if (a[j] < a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
	public static void Main()
	{
		int n;
		float[] shuzu = new float[1000];
		float ping;
		float max;
		float min;
		float sum = 0F;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (s = 0;s < n;s++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuzu[s] = Float.parseFloat(tempVar2);
			}
		}
		f1(shuzu, n);
		for (s = 0;s < n;s++)
		{
			sum = sum + shuzu[s];
		}
		ping = sum / n;
		max = shuzu[0] - ping;
		min = ping - shuzu[n - 1];
		if (max == min)
		{
			System.out.printf("%.0f,%.0f",shuzu[n - 1],shuzu[0]);
		}
		else if (max > min)
		{
			System.out.printf("%.0f",shuzu[0]);
		}
		else
		{
			System.out.printf("%.0f",shuzu[n - 1]);
		}
	}






}

