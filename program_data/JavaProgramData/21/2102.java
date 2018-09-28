package <missing>;

public class GlobalMembers
{
	public static float abss(float m)
	{
		if (m < 0F)
		{
			return (-m);
		}
		else
		{
			return (m);
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		float ave = 0F;
		float max = 0F;
		float[] num = new float[301];
		float[] t = new float[300];
		float te;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Float.parseFloat(tempVar2);
			}
			ave += num[i];
		}
		ave /= n;
		for (i = 1;i <= n;i++)
		{
			if (abss(num[i] - ave) > max)
			{
				max = abss(num[i] - ave);
			}
		}
		for (i = 1,j = 0;i <= n;i++)
		{
			if (abss(num[i] - ave) == max)
			{
				j++;
				t[j] = num[i];
			}
		}
		m = j;
		for (i = 1;i < m;i++)
		{
			for (j = 1;j < m - i;j++)
			{
				if (t[j] > t[j + 1])
				{
					te = t[j];
					t[j] = t[j + 1];
					t[j + 1] = te;
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			printf((i == 1)?"%.0f":",%.0f",t[i]);
		}
	}
}

