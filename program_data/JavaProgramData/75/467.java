package <missing>;

public class GlobalMembers
{
	public static int n;

	public static int[] x = new int[10010];
	public static int[] y = new int[10010];
	public static String a = new String(new char[100010]);
	public static String b = new String(new char[100010]);

	public static int tonum(tangible.RefObject<String> s, int a, int b)
	{
		int ans = 0;
		for (int i = a;i <= b;i++)
		{
			ans = ans * 10 + (s.argValue.charAt(i) - '0');
		}
		return ans;
	}
	public static int Main()
	{
		//n = 1;
		while (scanf("%s %s",a,b) != EOF)
		{
			n = 0;

			int len = a.length();
			int pre = 0;
			for (int i = 0;i <= len;i++)
			{
				if (i == len || a.charAt(i) == ',')
				{
				tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
					x[++n] = tonum(tempRef_a, pre, i - 1),pre = i + 1;
					a = tempRef_a.argValue;
				}
			}

			len = b.length();
			pre = 0;
			n = 0;
			for (int i = 0;i <= len;i++)
			{
				if (i == len || b.charAt(i) == ',')
				{
				tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
					y[++n] = tonum(tempRef_b, pre, i - 1),pre = i + 1;
					b = tempRef_b.argValue;
				}
			}

			int ans = 0;
			for (int i = 0;i <= 1000;i++)
			{
				int ccount = 0;
				for (int j = 1;j <= n;j++)
				{
					if (x[j] <= i != 0 && y[j] > i)
					{
						ccount++;
					}
				}
				ans = Math.max(ans,ccount);
			}

			System.out.printf("%d %d\n",n,ans);
		}
		return 0;
	}

}

