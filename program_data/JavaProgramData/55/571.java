package <missing>;

public class GlobalMembers
{
	public static final int maxL = 100;

	public static int a;
	public static int b;
	public static String str = new String(new char[maxL + 1]);

	public static int[] ans = new int[maxL + 1];

	public static int Main()
	{
		int i;
		int l;
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
		l = str.length();
		x = 0;
		for (i = 0;i < l;i++)
		{
		x *= a;
		if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
		{
			x += str.charAt(i) - '0';
		}
		else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
		{
			x += str.charAt(i) - 'a' + 10;
		}
		else
		{
			x += str.charAt(i) - 'A' + 10;
		}
		}
		l = 0;
		while (x > 0)
		{
		ans[l] = x % b;
		x /= b;
		l++;
		}
		if (l == 0)
		{
			ans[++l] = 0;
		}
		for (i = l - 1;i >= 0;i--)
		{
		if (ans[i] < 10)
		{
			System.out.printf("%ld",ans[i]);
		}
		else
		{
			System.out.printf("%c",ans[i] - 10 + 'A');
		}
		}
		return 0;
	}


}

