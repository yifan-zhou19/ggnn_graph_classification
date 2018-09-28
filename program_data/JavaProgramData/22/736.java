package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int m1 = 0;
		int m2 = 0;
		int i;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		m1 = a[0];
		for (i = 1;i < 300;i++)
		{
			if (a[i] == m1)
			{
				continue;
			}
			else if (a[i] > m2)
			{
				if (a[i] > m1)
				{
					m2 = m1;
					m1 = a[i];
				}
				else
				{
					m2 = a[i];
				}
			}
		}
		if (m2 == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",m2);
		}
		return 0;
	}
}

