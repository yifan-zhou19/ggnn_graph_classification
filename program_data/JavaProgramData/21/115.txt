package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int sum = 0;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static double ave;
	public static double max = 0;
	public static void bubble(int[] a, int n)
	{
		int i;
		int j;
		int m;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
				}
			}
		}


	}
	public static void fuc()
	{
		int i;
		int j = 0;
		ave = (double)sum / n;
		for (i = 0;i < n;i++)
		{
			max = (Math.abs(ave - a[i]) > max) ? Math.abs(ave - a[i]) : max;
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(Math.abs(ave - a[i]) - max) < 1e-6)
			{
				b[j++] = a[i];
			}
		}
		bubble(b, j);
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d%c",b[i],(i == j - 1)?'\n':',');
		}
	}
	public static void Main()
	{
		int i;
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
				a + i = tempVar2;
			}
			sum += a[i];
		}
		fuc();
	}
}

