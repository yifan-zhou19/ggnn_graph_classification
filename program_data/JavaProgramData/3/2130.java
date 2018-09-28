package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int l;
		int w;
		int[] a = new int[1000];
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
		if (n <= 0)
		{
			System.out.print("no");
		}
		l = 0;
		i = 0;
		while (l <= n - 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[l] = Integer.parseInt(tempVar3);
			}
			l++;
		}
		while (i < n - 1)
		{
			j = n - 1;
			while (j > i)
			{
				w = a[i] + a[j];
				j--;
				if (w == k)
				{
					System.out.print("yes");
					break;
				}
			}
			if (w == k)
			{
				break;
			}
			i++;
		}
		if (i == n - 1)
		{
			System.out.print("no");
		}

		return 0;
	}

}

