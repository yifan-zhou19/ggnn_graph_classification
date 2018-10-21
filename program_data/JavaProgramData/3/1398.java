package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i;
		int n;
		int j;
		int e;
		int l;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}


		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

			e = a[0];
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 0; j < n - i; j++)
			{
				if (a[j] > a[j + 1])
				{
						e = a[j + 1];
						a[j + 1] = a[j];
						a[j] = e;
				}
			}
		}
		l = 0;

		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					l++;
				}
			}
		}

		if (l == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}

		return 0;
	}
}

