package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 1;
		int m1;
		int m2;
		int[] a = new int[100];
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (scanf("%c", d), d == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n] = Integer.parseInt(tempVar2);
			}
			n++;
		}
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			m1 = a[0];
			m2 = a[0];
			if (a[1] >= a[0])
			{
				m1 = a[1];
			}
			else
			{
				m2 = a[1];
			}
			for (i = 2;i < n;i++)
			{
				if (m1 == m2)
				{
					if (a[i] > m1)
					{
						m1 = a[i];
					}
					else
					{
						m2 = a[i];
					}
				}
				else
				{
				if (a[i] > m1)
				{
					m2 = m1;
					m1 = a[i];
				}
				else
				{
					if (a[i] < m1 && a[i]> m2)
					{
						m2 = a[i];
					}
				}
				}
			}

		if (m1 == m2)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",m2);
		}
		}
	}

}

