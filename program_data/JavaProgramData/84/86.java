package <missing>;

public class GlobalMembers
{
	public static void change(int[] a, int n)
	{
		int i;
		int m1 = 0;
		int m2 = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > m1)
			{
				m1 = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > m2 && a[i] < m1)
			{
				m2 = a[i];
			}
		}
		a[0] = m1;
		a[1] = m2;
	}

	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int t;
		int n;
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
		change(a, n);
		System.out.printf("%d\n%d\n",a[0],a[1]);
	}

}

