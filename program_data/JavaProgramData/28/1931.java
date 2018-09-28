package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int t;
		String zfc1 = new String(new char[1500]);
		int[] sz = new int[1500];
		int[] hz = new int[1500];
		t = 0;
		zfc1 = new Scanner(System.in).nextLine();
		m = zfc1.length();
		for (i = 0;i < m;i++)
		{
			if (zfc1.charAt(i) == ' ')
			{
				sz[t] = i;
				t++;
			}
		}
		if (t != 0)
		{
		for (i = 0;i < t;i++)
		{
			if (i == 0)
			{
				hz[i] = sz[0];
			}
			else
			{
				hz[i] = sz[i] - sz[i - 1];
			}
		}
		hz[t] = m - 1 - sz[t - 1];
		for (i = 0;i <= t;i++)
		{
			if ((hz[i] == 1) && (i != 0))
			{
				continue;
			}
			else if (i == t)
			{
				System.out.printf("%d",hz[i]);
			}
			else if (i == 0)
			{
				System.out.printf("%d,",hz[i]);
			}
			else
			{
				System.out.printf("%d,",hz[i] - 1);
			}
		}
		}
		if (t == 0)
		{
			System.out.printf("%d",m);
		}
		return 0;
	}
}
