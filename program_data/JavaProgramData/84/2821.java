package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int m1 = 0;
		int m2 = 0;
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
			m1 = m1 > a[i] != 0?m1:a[i];
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == m1)
			{
				continue;
			}
			else
			{
				m2 = m2 > a[i] != 0?m2:a[i];
			}
		}
		System.out.printf("%d\n%d\n",m1,m2);
	}

}

