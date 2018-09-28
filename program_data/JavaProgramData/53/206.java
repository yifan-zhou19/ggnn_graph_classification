package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int s;
		int k;
		int[] a = new int[300];
		int[] b = new int[300];
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

		b[0] = a[0];
		s = 1;
		for (i = 1;i < n;i++)
		{
			k = 0;
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					k = k + 1;
				}
			}
			if (k == 0)
			{
				b[s] = a[i];
				s = s + 1;
			}
		}

		for (i = 0;i < s;i++)
		{
			if (i == (s - 1))
			{
				System.out.printf("%d",b[i]);
			}
			else
			{
				System.out.printf("%d,",b[i]);
			}
		}
	}
}

