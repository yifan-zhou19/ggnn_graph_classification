package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int t;
		int f;
		int ans;
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
		for (ans = 1;ans < 3000000000;ans++)
		{
			f = 0;
			t = ans;
			for (i = 1;i <= n;i++)
			{
				if (((t - k) % n == 0) && (t - k > 0))
				{
					t = t - k - (t - k) / n;
				}
				else
				{
					f++;
					break;
				}
			}
			if (f != 0)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		System.out.printf("%ld\n",ans);
		return 0;
	}

}

