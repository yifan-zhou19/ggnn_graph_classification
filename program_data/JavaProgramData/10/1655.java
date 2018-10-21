package <missing>;

public class GlobalMembers
{
	//????????????......by ??? 2011.11.10
	//??????????? ????
	public static int[] a = new int[max];
	public static int k;


	public static int find(int p) //???p?????????
	{
		int i;
		int temp = 0;
		int t;
		if (p == k - 1)
		{
			return 1;
		}
		for (i = p + 1;i <= k - 1;i++)
		{
			if (a[p] >= a[i])
			{
				t = find(i);
				if (temp < t)
				{
					temp = t;
				}
			}
		}
		return temp + 1;
	}
	public static int Main()
	{
		int i;
		int j;
		int p = 0;
		int t;
		int ans = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i <= k - 1;i++)
		{
			 t = find(i);
			 if (ans < t)
			 {
				 ans = t;
			 }
		}
		System.out.printf("%d",ans);

	}
}

