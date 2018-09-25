package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int m;
		int n;
		int i;
		int j;
		int t;
		int m1;
		int n1;
		int q = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		m1 = m;
		n1 = n;
		if (m == 1 || n == 1)
		{
			System.out.print("1");
			return 0;
		}
		if (m == n)
		{
			System.out.printf("%d",m);
			return 0;
		}
		a[0] = m;
		b[0] = n;
		for (i = 1;;i++)
		{
			if (m1 / 2 == 0)
			{
				break;
			}
			m1 = m1 / 2;
			a[i] = m1;
		}
		for (j = 1;;j++)
		{
			if (n1 / 2 == 0)
			{
				break;
			}
			n1 = n1 / 2;
			b[j] = n1;
		}
		if (m > n)
		{
			s = i;
			t = j;
			for (i = 0;i < s;i++)
			{
				for (j = 0;j < t;j++)
				{
					if (a[i] == b[j])
					{
						System.out.printf("%d",a[i]);
						q = 1;
						break;
					}
				}
				if (q == 1)
				{
					break;
				}
			}
		}
		if (m < n)
		{
			s = i;
			t = j;
			for (i = 0;i < t;i++)
			{
				for (j = 0;j < s;j++)
				{
					if (a[j] == b[i])
					{
						System.out.printf("%d",a[j]);
						q = 1;
						break;
					}
				}
				if (q == 1)
				{
					break;
				}
			}
		}
		return 0;
	}

}

