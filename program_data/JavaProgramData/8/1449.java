package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[200];
	public static int[] y = new int[200];
	public static int m;
	public static int n;
	public static void sca()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void bubble(int[] a, int n) //&Ecirc;&yacute;��&Atilde;�&Aring;&Yacute; &pound;&not;n&Icirc;&ordf;&Ecirc;&yacute;��&sup3;�&para;&Egrave;
	{
		int i;
		int j;
		int b;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					b = a[j];
					a[j] = a[j + 1];
					a[j + 1] = b;
				}
			}
		}
	}

	public static void bing(int[] a, int l1, int[] b, int l2)
	{
		int i;
		int j;
		int[] z = new int[500];
		for (i = 0;i < l1;i++)
		{
			z[i] = a[i];
		}
		for (j = 0;i < (l1 + l2);j++,i++)
		{
			z[i] = b[j];
		}
		System.out.printf("%d",z[0]);
		for (i = 1;i < (l1 + l2);i++)
		{
			System.out.printf(" %d",z[i]);
		}

	}

	public static int Main()
	{
		sca();
		bubble(x, m);
		bubble(y, n);
		bing(x, m, y, n);
		return 0;
	}
}

