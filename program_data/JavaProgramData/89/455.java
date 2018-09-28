package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int k;
		int cnt = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = 10 * n;
		int[] a = new int[t];
		int[] b = new int[t];
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if ((a[i] == 0) && (b[i] == 0))
			{
				break;
			}
			else
			{
				cnt++;
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0,k = 0;i < cnt,k < cnt;i++,k++)
			{
				if (a[i] == j)
				{
					cnt1++;
				}
				if (b[k] == j)
				{
					cnt2++;
				}
			}
			if ((cnt1 == 0) && (cnt2 == n - 1))
			{
				System.out.printf("%d\n",j);
				break;
			}
			cnt1 = 0;
			cnt2 = 0;
		}
		if ((cnt1 == 0) && (cnt2 == 0))
		{
		System.out.print("NOT FOUND\n");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

