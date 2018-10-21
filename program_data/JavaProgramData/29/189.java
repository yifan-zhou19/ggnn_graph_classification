package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] sz = new float[100];
		int x;
		int y;
		int z;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] sc = new int[100];

		sz[0] = (float)2 / 1;
		a[0] = 2;
		b[0] = 1;
		int i = 1;
		while (i < 100)
		{
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1];
			sz[i] = sz[i - 1] + (float)(a[i]) / (b[i]);
			i++;
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int o;
		int j = 0;
		while (j < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sc[j] = Integer.parseInt(tempVar2);
			}
			o = sc[j] - 1;
			System.out.printf("%.3f\n",sz[o]);
			j++;
		}

		return 0;

	}
}

