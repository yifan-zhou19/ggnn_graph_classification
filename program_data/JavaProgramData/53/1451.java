package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
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
		l = 0;
		for (i = 0;i < n - 1;i++)
		{
			k = a[i];
			for (j = i + 1;j < n;j++)
			{
				if (a[j] == a[i])
				{
					b[l] = j;
					l++;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			m = 0;
			for (j = 0;j < l;j++)
			{
				if (i == b[j])
				{
					m = 1;
				}
			}
			if (m == 0 && i != 0)
			{
				System.out.printf(",%d",a[i]);
			}
			else if (i == 0)
			{
				System.out.printf("%d",a[i]);
			}
		}
		return 0;
	}
}

