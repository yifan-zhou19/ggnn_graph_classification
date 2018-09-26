package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int m = 0;
		int k = 0;
		int p = 0;
		int q = 0;
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
					a[i] = Integer.parseInt(tempVar2);
				}
				if (a[i] >= 1 && a[i] <= 18)
				{
					m++;
				}
				if (a[i] >= 19 && a[i] <= 35)
				{
					k++;
				}
				if (a[i] >= 36 && a[i] <= 60)
				{
					p++;
				}
				if (a[i] > 60)
				{
					q++;
				}
			}
			System.out.print("1-18: ");
				System.out.printf("%.2lf",(double)m / n * 100);
				System.out.print("%%\n");
			System.out.print("19-35: ");
				System.out.printf("%.2lf",(double)k / n * 100);
				System.out.print("%%\n");
			System.out.print("36-60: ");
				System.out.printf("%.2lf",(double)p / n * 100);
			System.out.print("%%\n");
			System.out.print("60??: ");
				System.out.printf("%.2lf",(double)q / n * 100);
			System.out.print("%%\n");

		return 0;
	}
}

