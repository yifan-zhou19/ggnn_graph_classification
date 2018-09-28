package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] s = new int[150];
		int[] a = new int[150];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = n - m,j = 0;i < n;i++,j++)
		{
			a[j] = s[i];
		}

		for (i = n - m - 1;i >= 0;i--)
		{
			s[i + m] = s[i];
		}

		for (i = 0;i < m;i++)
		{
			s[i] = a[i];
		}

		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",s[i]);
		}
		System.out.printf("%d\n",s[n - 1]);
	}
}

