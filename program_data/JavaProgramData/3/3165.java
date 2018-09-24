package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int i;
		int j;
		int m;
		int t;
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
		for (i = 0;i < n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[n - 1] = Integer.parseInt(tempVar4);
		}
		m = 0;
		t = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					System.out.print("yes");
					t = 1;
					break;
				}
				m++;
			}
			if (t == 1)
			{
				break;
			}
		}
		if (m == n * (n - 1) / 2)
		{
			System.out.print("no");
		}
		return 0;
	}

}

