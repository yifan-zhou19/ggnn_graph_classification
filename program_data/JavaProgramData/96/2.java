package <missing>;

public class GlobalMembers
{
	public static final int maxL = 100;

	public static String a = new String(new char[maxL + 1]);

	public static int[] ans = new int[maxL + 1];

	public static int Main()
	{
		int i;
		int l;
		int rest;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		rest = 0;
		for (i = 0;i < l;i++)
		{
		rest = rest * 10 + a.charAt(i) - '0';
		ans[i] = rest / 13;
		rest %= 13;
		}
		i = 0;
		while ((ans[i] == 0) && (i < l - 1))
		{
		i++;
		}
		for (;i < l;i++)
		{
		System.out.printf("%ld",ans[i]);
		}
		System.out.printf("\n%ld\n",rest);
		return 0;
	}

}

