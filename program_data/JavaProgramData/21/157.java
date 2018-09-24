package <missing>;

public class GlobalMembers
{
	public static float jue(float t)
	{
		if (t < 0F)
		{
			t = -t;
		}
		return t;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int[] shu = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		float s = 0F;
		float ave;
		float max;
		float tem;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			s = s + a[i];
		}
		ave = s / n;
		max = jue(a[0] - ave);
		int k = 0; //k??
		for (i = 1;i < n;i++)
		{
			tem = jue(a[i] - ave);
			if (tem > max)
			{
				max = tem;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (jue(a[i] - ave) == max)
			{
				shu[k] = a[i];
				k++;
			}
		}
		int j;
		int t;
		for (i = 0;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				if (shu[i] > shu[j])
				{
					t = shu[i];
					shu[i] = shu[j];
					shu[j] = t;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",shu[i]);
		}
		System.out.printf("%d",shu[k - 1]);
		return 0;
	}


}

