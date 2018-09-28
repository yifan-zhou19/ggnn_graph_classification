package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		int j;
		int count;
		int r = 0;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				count = a[i] + a[j];

				if (count == k)
				{
					System.out.print("yes");
					break;
				}
				if (count != k)
				{
					r++;
				}
			}
				if (count == k)
				{
					  break;
				}
		}
		if (r == (n * (n - 1) / 2) && (a[n - 1] + a[n - 2]) != k)
		{
			System.out.print("no");
		}
		return 0;
	}

}

