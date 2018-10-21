package <missing>;

public class GlobalMembers
{
	public static void bb(int n, int[] b)
	{
		 int i = 0;
		 int j = 0;
		 int k;
		 for (i = 0;i < n - 1;i++)
		 {
			 for (j = 0;j < n - i - 1;j++)
			 {
				 if (b[j] > b[j + 1])
				 {
					 k = b[j];
					 b[j] = b[j + 1];
					 b[j + 1] = k;
				 }
			 }
		 }
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[200];
		int s = 0;
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
		}
		for (i = 0;i < n;i++)
		{
			s += a[i];
		}
		bb(n, a);
		if ((a[0] + a[n - 1]) * n == 2 * s)
		{
		System.out.printf("%d,%d",a[0],a[n - 1]);
		}
		else if ((s - n * a[0]) > (n * a[n - 1] - s))
		{
		System.out.printf("%d",a[0]);
		}
		else
		{
		System.out.printf("%d",a[n - 1]);
		}

	}













}

