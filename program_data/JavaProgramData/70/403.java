public class dis
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static dis[] s = tangible.Arrays.initializeWithDefaultdisInstances(1000);
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k = 0;
		double[] l = new double[10000];
		double m;
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
				s[i].x = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].y = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				k++;
				l[k] = Math.sqrt((s[i].x - s[j].x) * (s[i].x - s[j].x) + (s[i].y - s[j].y) * (s[i].y - s[j].y));
			}
		}
		//for (i=1;i<k+1;i++)
	//	{
			for (j = k;j > 1;j--)
			{
				if (l[j] > l[j - 1])
				{
					m = l[j - 1];
					l[j - 1] = l[j];
					l[j] = m;
				}

			}

	//	}
		System.out.printf("%.4lf\n",l[1]);

	}
}

