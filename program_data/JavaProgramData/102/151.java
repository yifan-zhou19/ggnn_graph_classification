package <missing>;

public class GlobalMembers
{
	public static int[] nan = new int[50];
	public static int[] nv = new int[50];

	public static void paixu(int[] a, int n)
	{
		int i;
		int j;
		int tmp;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] > a[j + 1])
				{
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
	}

	public static int Main()
	{
		int nannum = 0;
		int nvnum = 0;
		int n;
		int i;
		double tmp;
		int flag = 0;
		String str = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				tmp = Double.parseDouble(tempVar3);
			}
			if (str.charAt(0) == 'm')
			{
				nan[nannum++] = tmp * 1000;
			}
			else
			{
				nv[nvnum++] = tmp * 1000;
			}
		}
		paixu(nan, nannum);
		paixu(nv, nvnum);
		for (i = 0;i < nannum;i++)
		{
			tmp = (double)nan[i] / 1000;
			System.out.printf("%.2lf ",tmp);
		}
		for (i = nvnum - 1;i >= 0;i--)
		{
			tmp = (double)nv[i] / 1000;
			if (i != 0)
			{
				System.out.printf("%.2lf ",tmp);
			}
			else
			{
				System.out.printf("%.2lf",tmp);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

