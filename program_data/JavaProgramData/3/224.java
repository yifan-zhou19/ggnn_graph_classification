package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int n;
		int k;
		int[] a = new int[1000];
		int b = 0;
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
		for (int t = 0;t < n;t++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[t] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = n - 1; j > i;j--)
			{
				if (a[i] + a[j] == k)
				{
					b = 1;
					System.out.print("yes\n");
					return 1;
				}

			}
		}
		if (b == 0)
		{
			System.out.print("no\n");
		}

	}
}

