package <missing>;

public class GlobalMembers
{
	public static final int maxn = 105;
	public static double[] a = new double[maxn];
	public static double[] b = new double[maxn];

	public static int Main()
	{
		String str = new String(new char[20]);
		char n;
		char m;
		char i;
		char j;
		char T;
		while (scanf("%d", T) != EOF)
		{
			n = 0;
			m = 0;
			while (T-- != null)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					str = tempVar.charAt(0);
				}
				if (str.charAt(0) == 'm')
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a + n = tempVar2;
					}
					n++;
				}
				else
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b + m = tempVar3;
					}
					m++;
				}
			}
			sort(a, a + n);
			sort(b, b + m);
			for (i = 0; i < n; i++)
			{
				System.out.printf("%.2lf ", a[i]);
			}
			for (i = m - 1; i >= 0; i--)
			{
				System.out.printf("%.2lf", b[i]);
				if (i != null)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

