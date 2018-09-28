package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static trans(int[] a, int m, int n)
	{
		int temp;
		int i;
		if (m == 1)
		{
			temp = a[n - 1];
			for (i = n - 1;i > 0;i--)
			{
				a[i] = a[i - 1];
			}
			a[0] = temp;
		}
		else
		{
			trans(a, 1, n);
			trans(a, m - 1, n);
		}
		return 0;
	}



	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[110];
		int i;

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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		trans(a, m, n);

		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}
}

