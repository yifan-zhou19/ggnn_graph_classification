package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[10];
		int[] c = new int[10];
		int i;
		int j;
		int n;
		int k;
		float sum;
		float[] g = new float[10];
		float ave;
		i = 0;
		j = 0;
		k = 0;
		sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		while (j < n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[j] = Integer.parseInt(tempVar3);
			}
			j++;
		}
		i = 0;
		while (i < n)
		{
			k += c[i];
			i++;
		}
		j = 0;
		while (j < n)
		{
			if (s[j] >= 90)
			{
				g[j] = 4.0F;
			}
			if (s[j] >= 85 && s[j] <= 89)
			{
				g[j] = 3.7F;
			}
			if (s[j] >= 82 && s[j] <= 84)
			{
				g[j] = 3.3F;
			}
			if (s[j] >= 78 && s[j] <= 81)
			{
				g[j] = 3.0F;
			}
			if (s[j] >= 75 && s[j] <= 77)
			{
				g[j] = 2.7F;
			}
			if (s[j] >= 72 && s[j] <= 74)
			{
				g[j] = 2.3F;
			}
			if (s[j] >= 68 && s[j] <= 71)
			{
				g[j] = 2.0F;
			}
			if (s[j] >= 64 && s[j] <= 67)
			{
				g[j] = 1.5F;
			}
			if (s[j] >= 60 && s[j] <= 63)
			{
				g[j] = 1.0F;
			}
			if (s[j] <= 60)
			{
				g[j] = 0F;
			}
			j++;
		}
		j = 0;
		i = 0;
		while (j < n)
		{
			sum += g[j] * c[i];
			i++;
			j++;
		}
		ave = sum / k;
		System.out.printf("%.2f",ave);
		return 0;
	}
}

