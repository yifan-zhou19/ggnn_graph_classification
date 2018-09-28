package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int m1 = 0;
		int m2 = 0;
		int j;
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
			if (a[i] > m1)
			{
			m1 = a[i];
			j = i;
			}
		}
		a[j] = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > m2)
			{
				m2 = a[i];
			}
		}
		System.out.printf("%d\n%d\n",m1,m2);
	}

}

