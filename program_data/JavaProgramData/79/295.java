package <missing>;

public class GlobalMembers
{
	public static int m;
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		void sear(int a[300],int n);
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
		if (n == 0)
		{
			break;
		}
		for (i = 0;i < 300;i++)
		{
			a[i] = i + 1;
		}
		sear(a, n);
		}
	}

	public static void sear(int[] a, int n)
	{
		int i;
		int k;
		int[] b = new int[300];
		if (n > 0)
		{
			for (i = 0,k = m % n;i < n - 1;i++,k++)
			{
				b[i] = a[k % n];
			}
				sear(b, n - 1);
		}
		if (n == 1)
		{
			System.out.printf("%d\n",a[0]);
		}
	}
}

