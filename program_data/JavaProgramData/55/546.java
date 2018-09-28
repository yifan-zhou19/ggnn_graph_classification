package <missing>;

public class GlobalMembers
{
	public static final int maxL = 300;

	public static int a;
	public static int b;
	public static String str = new String(new char[maxL + 10]);

	public static int[] from = new int[maxL + 10];
	public static int[] to = new int[maxL + 10];

	public static int[] ans = new int[maxL + 10];

	public static int Main()
	{
		int i;
		int j;
		int k;
		int L;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		L = str.length();
		for (i = '0';i <= '9';i++)
		{
		from[i] = i - '0';
		to[i - '0'] = i;
		}
		for (i = 'a';i <= 'z';i++)
		{
			from[i] = i - 'a' + 10;
		}
		for (i = 'A';i <= 'Z';i++)
		{
		from[i] = i - 'A' + 10;
		to[i - 'A' + 10] = i;
		}
		x = 0;
		for (i = 0;i < L;i++)
		{
		x *= a;
		x += from[str.charAt(i)];
		}
		L = 0;
		while (x != 0)
		{
		ans[++L] = x % b;
		x /= b;
		}
		if (L == 0)
		{
			ans[++L] = 0;
		}
		for (i = L;i >= 1;i--)
		{
		System.out.printf("%c",to[ans[i]]);
		}
		System.out.print("\n");
		return 0;
	}

}

