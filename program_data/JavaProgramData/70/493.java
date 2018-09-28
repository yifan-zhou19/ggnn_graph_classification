package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		double[] a = new double[1000];
		double[] b = new double[1000];
		double len;
		double dis = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		int x;
		int y;
		for (x = 0;x < n - 1;x++)
		{
			for (y = x + 1;y < n;y++)
			{
				len = Math.sqrt((a[y] - a[x]) * (a[y] - a[x]) + (b[y] - b[x]) * (b[y] - b[x]));
				if (len > dis)
				{
					dis = len;
				}
			}
		}
		System.out.printf("%.4lf\n",dis);
	}
}

