package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[300];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 300;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(",");
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (a[1] < a[0])
		{
			m = a[0];
			n = a[1];
		}
		else if (a[1] > a[0])
		{
			n = a[0];
			m = a[1];
		}
		else
		{
			m = a[1];
		n = 0;
		}
		for (i = 2;i < 300;i++)
		{
			if (a[i] > m)
			{
			n = m;
		m = a[i];
			}
		else if (a[i] > n && a[i] != m)
		{
			n = a[i];
		}
		}
		if (n == 0)
		{
			System.out.print("No");
		}
		else if (m == n)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",n);
		}


		return (0);
	}
}

