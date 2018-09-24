package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int tmp;
		int[] a = new int[10000];
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
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 1;i < n;i++)
		{
			t = i;
			for (j = t;j <= n;j++)
			{
				if (a[j] < a[t])
				{
					t = j;
				}
			}
			if (t != i)
			{
				tmp = a[t];
				a[t] = a[i];
				a[i] = tmp;
			}

		}
		t = 0;

		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[i] + a[j] == k && t == 0)
				{
					System.out.print("yes");
					t = 1;
				}
				else if (a[i] + a[j] > k)
				{
					break;
				}
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		return 0;
	}




}

