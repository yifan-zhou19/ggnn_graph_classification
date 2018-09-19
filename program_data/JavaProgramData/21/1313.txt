package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] t = new int[300];
		int s = 0;
		int temp;
		int k = 0;
		int y = 0;
		int[] d = new int[300];
		float[] f = new float[100];
		float m;
		float av;
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
				t[i] = Integer.parseInt(tempVar2);
			}
			s = s + t[i];
		}
		av = (float)s / n;
		for (i = 0;i < n;i++)
		{
			if (av >= t[i])
			{
				f[i] = (float)(av - t[i]);
			}
			else
			{
				f[i] = (float)(t[i] - av);
			}
		}
		m = f[0];
		for (i = 0;i < n;i++)
		{
			if (m <= f[i])
			{
				m = f[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (f[i] == m)
			{
				k++;
	d[k - 1] = t[i];
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = k - 1;j > i;j--)
			{
				if (d[i] > d[j])
				{
				temp = d[i];
				d[i] = d[j];
				d[j] = temp;
				}
			}
		}
		for (i = 0;i < k;i++)
		{


				System.out.printf("%d",d[i]);
				y++;
				if (y >= 1 && y < k)
				{
					System.out.print(",");
				}

		}
		return 0;
	}
}

