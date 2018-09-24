public class info
{
	public double height;
	public String sex = new String(new char[10]);
}

package <missing>;

public class GlobalMembers
{
	public static info[] p = tangible.Arrays.initializeWithDefaultinfoInstances(41);
	public static double[] pm = new double[41];
	public static double[] pf = new double[41];

	public static int comp_m(Object a, Object b)
	{
		return ((double)a - (double)b) > 0?1:((double)a - (double)b < 0?-1:0);
	}

	public static int comp_f(Object a, Object b)
	{
		return ((double)b - (double)a) > 0?1:((double)b - (double)a < 0?-1:0);
	}

	public static int Main()
	{
		int n;
		int i;
		int index_m;
		int index_f;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			index_m = 0;
			index_f = 0;
			for (i = 0;i < n;i++)
			{
				p[i].sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
				p[i].height = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				if (!strcmp(p[i].sex,"male"))
				{
					pm[index_m++] = p[i].height;
				}
				else
				{
					pf[index_f++] = p[i].height;
				}
			}
			qsort(pm,index_m,(Double.SIZE / Byte.SIZE),comp_m);
			qsort(pf,index_f,(Double.SIZE / Byte.SIZE),comp_f);
			for (i = 0;i < index_m;i++)
			{
				System.out.printf("%.2f ",pm[i]);
			}
			for (i = 0;i < index_f - 1;i++)
			{
				System.out.printf("%.2f ",pf[i]);
			}
			System.out.printf("%.2f",pf[i]);
		}
		return 0;
	}
}

