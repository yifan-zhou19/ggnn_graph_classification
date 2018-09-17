package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int n_m;
		int n_f;
		int i;
		int j;
		float[] male = new float[40];
		float[] female = new float[40];
		String s = new String(new char[10]);
		float t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		n_m = 0;
		n_f = 0;
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (s.charAt(0) == 'm')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					male[n_m] = Float.parseFloat(tempVar3);
				}
				n_m++;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					female[n_f] = Float.parseFloat(tempVar4);
				}
				n_f++;
			}
		}
		for (i = 0; i < n_m - 1; i++)
		{
			for (j = i + 1; j <= n_m - 1; j++)
			{
				if (male[i] > male[j])
				{
					t = male[i];
					male[i] = male[j];
					male[j] = t;
				}
			}
		}
		for (i = 0; i < n_f - 1; i++)
		{
			for (j = i + 1; j <= n_f - 1; j++)
			{
				if (female[i] < female[j])
				{
					t = female[i];
					female[i] = female[j];
					female[j] = t;
				}
			}
		}
		for (i = 0; i <= n_m - 1; i++)
		{
			System.out.printf("%.2f ", male[i]);
		}
		for (i = 0; i < n_f - 1; i++)
		{
			System.out.printf("%.2f ", female[i]);
		}
		System.out.printf("%.2f\n", female[n_f - 1]);
		return 0;
	}
}

