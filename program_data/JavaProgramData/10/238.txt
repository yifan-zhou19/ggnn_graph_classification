package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[26];
		int i;
		int check = new int(int a[26],int k);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",check(a, k));
	}
	public static int check(int[] a, int k)
	{
		int i;
		int j;
		int m;
		int[] b = new int[26];
		for (i = 0;i < k;i++)
		{
			for (j = 0,m = 0;j < i;j++)
			{
				if (a[j] >= a[i])
				{
					if (b[j] > m)
					{
						m = b[j];
					}
				}
			}
			if (m == 0)
			{
				b[i] = 1;
			}
			else
			{
				b[i] = m + 1;
			}
		}
		for (i = 0,m = 0;i < k;i++)
		{
			if (b[i] > m)
			{
				m = b[i];
			}
		}
		return m;
	}


}

