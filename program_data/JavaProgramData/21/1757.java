package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] num = new int[300];
		int s = 0;
		int u = 0;
		int m;
		float aver;
		float[] t = new float[300];
		float max;
		float sum = 0F;
		float min;
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
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + (float)(num[i]);
		}
		aver = sum / (float)(n);

		for (i = 0;i < n;i++)
		{

		t[i] = aver - (float)(num[i]);
		}

		min = t[0];
		for (i = 0;i < n;i++)
		{
			if (t[i] > min)
			{
			min = t[i];
		s = i;
			}
		max = t[0];
		for (m = 0;m < n;m++)
		{
			if (t[m] < max)
			{
			max = t[m];
		u = m;
			}
		}

		}
		if (t[s] + t[u] < 0F)
		{
			System.out.printf("%d",num[u]);
		}
		else if (t[s] + t[u] > 0F)
		{
			System.out.printf("%d",num[s]);
		}
		else
		{
			System.out.printf("%d,%d",num[s],num[u]);
		}


	}
}

