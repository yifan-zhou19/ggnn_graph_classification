package <missing>;

public class GlobalMembers
{
	public static final int maxn = 100;
	public static double[] d0 = new double[maxn];
	public static double[] d1 = new double[maxn];
	public static int cnt0;
	public static int cnt1;
	public static int n;

	public static int Main()
	{
		while (scanf("%d", n) == 1)
		{
			cnt0 = cnt1 = 0;
			for (int i = 0; i < n; i++)
			{
				String s = new String(new char[100]);
				double tmp;

				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s = tempVar.charAt(0);
				}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tmp = Double.parseDouble(tempVar2);
				}
				if (s.charAt(0) == 'm')
				{
					d0[cnt0++] = tmp;
				}
				else
				{
					d1[cnt1++] = tmp;
				}
			}

			sort(d0, d0 + cnt0);
			sort(d1, d1 + cnt1);
			char flag = 0;
			for (int i = 0; i < cnt0; i++)
			{
				if (flag != null)
				{
					System.out.print(' ');
				}
				flag = 1;
				System.out.printf("%.2lf", d0[i]);
			}

			for (int i = cnt1 - 1; i >= 0; i--)
			{
				if (flag != null)
				{
					System.out.print(' ');
				}
				flag = 1;

				System.out.printf("%.2lf", d1[i]);
			}

			System.out.println("");
		}
		return 0;
	}

}

