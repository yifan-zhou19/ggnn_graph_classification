package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int[] num = new int[300];
		int sum = 0;
		int k;
		int m;
		float a;
		float[] c = new float[300];
		float mc = 0F;
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
				t = Integer.parseInt(tempVar2);
			}
			num[i] = t;
			sum += num[i];
		}
		a = (float)sum / (float)n;
		for (i = 0;i < n;i++)
		{
			if (num[i] > a)
			{
				c[i] = (float)num[i] - a;
			}
			else
			{
				c[i] = a - (float)num[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] > mc)
			{
				mc = c[i];
				k = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] >= mc)
			{
				mc = c[i];
				m = i;
			}
		}
		if (m == k)
		{
			System.out.printf("%d",num[k]);
		}
		else if (num[k] > num[m])
		{
			System.out.printf("%d,%d",num[m],num[k]);
		}
		else
		{
			System.out.printf("%d,%d",num[k],num[m]);
		}
		return 0;
	}
}

