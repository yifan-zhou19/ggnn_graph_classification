package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] x = new double[1000];
		double[] a = new double[100];
		double h;
		double[] p = new double[100];
		int[] m = new int[100];
		for (int i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			double h = 0;
			for (int j = 0;j < m[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				h += x[j];
			}
			a[i] = h / m[i];
			p[i] = 0;
			for (int c = 0;c < m[i];c++)
			{

				p[i] += (x[c] - a[i]) * (x[c] - a[i]);
			}
		}
		double[] S = new double[100];
		for (int v = 0;v < n;v++)
		{
		S[v] = Math.sqrt(p[v] / m[v]);
		System.out.printf("%.5f\n", S[v]);
		}
		return 0;
	}
}

