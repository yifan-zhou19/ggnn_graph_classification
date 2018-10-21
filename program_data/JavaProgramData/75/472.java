package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100000]);
	public static String e = new String(new char[100000]);
	public static int[] f = new int[1010];

	public static int Main()
	{
		int i;
		int j;
		int st;
		int et;
		int ans;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			e = tempVar2.charAt(0);
		}
		for (i = 0;i < 1010;i++)
		{
			f[0] = 0;
		}
		ans = 0;
		i = j = 0;
		while (s.charAt(i) != '\0' && e.charAt(j) != '\0')
		{
			st = et = 0;
			while (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				st *= 10;
				st += s.charAt(i) - '0';
				i++;
			}
			i++;
			while (e.charAt(j) >= '0' && e.charAt(j) <= '9')
			{
				et *= 10;
				et += e.charAt(j) - '0';
				j++;
			}
			j++;
			ans++;
			for (k = st;k < et;k++)
			{
				f[k]++;
			}
		}
		int max = -1;
		for (i = 0;i < 1010;i++)
		{
			if (f[i] > max)
			{
				max = f[i];
			}
		}
		System.out.printf("%d %d\n",ans,max);

		return 0;
	}
}

