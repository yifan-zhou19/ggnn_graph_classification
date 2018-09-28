package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void shuru(int array[100],int x);
		void paixu(int array[100],int x);
		int i;
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
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
		shuru(a, m);
		shuru(b, n);
		paixu(a, m);
		paixu(b, n);

		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[n - 1]);
	}
	public static void shuru(int[] array, int x)
	{
		int i;
		for (i = 0;i < x;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				array[i] = Integer.parseInt(tempVar);
			}
		}
	}
	public static void paixu(int[] array, int x)
	{
		int i;
		int j;
		int b;
		for (j = 1;j < x;j++)
		{
			for (i = 0;i < x - j;i++)
			{
				if (array[i] > array[i + 1])
				{
					b = array[i];
					array[i] = array[i + 1];
					array[i + 1] = b;
				}
			}
		}
	}

}

