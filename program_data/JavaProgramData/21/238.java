package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[400];
		int j = 0;
		int l = 0;
		int[] b = new int[400];
		int g;
		int c;
		float s = 0F;
		float m;
		float k = 0F;
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
			s = s + a[i];
		}
		s = s / n;
		for (i = 0;i < n;i++)
		{
			m = a[i] - s;
			if ((k >= 0F) && (m >= k != 0 || m <= -k))
			{
				k = m;
			}
			else if ((k < 0F) && (m <= k != 0 || m >= -k))
			{
				k = m;
			}
		}
		for (i = 0;i < n;i++)
		{
			m = a[i] - s;
			if (m == k || m == -k)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (g = 0;g < i;g++)
			{
				if (b[g] >= b[i])
				{
					c = b[g];
					b[g] = b[i];
					b[i] = c;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			if (i != j - 1)
			{
				System.out.printf("%d,",b[i]);
			}
			else
			{
				System.out.printf("%d",b[i]);
			}

		}
	}
}

