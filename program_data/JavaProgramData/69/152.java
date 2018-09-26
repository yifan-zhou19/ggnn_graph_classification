package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1;
		int l2;
		int n;
		int a;
		int b;
		int i;
		int[] c = new int[260];
		String s1 = new String(new char[250]);
		String s2 = new String(new char[250]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l1 = s1.length();
		l2 = s2.length();
		n = 0;
		c[0] = 0;
		while (l1 != 0 || l2 != 0)
		{
			a = (l1 > 0)?s1.charAt(--l1) - 48:0;
			b = (l2 > 0)?s2.charAt(--l2) - 48:0;
			c[n] += a + b;
			c[n + 1] = c[n] / 10;
			c[n++] = c[n] % 10;
		}
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (c[n--] == 0 && n >= 0)
		{
			;
		}
		for (i = n + 1;i >= 0;i--)
		{
			System.out.printf("%d",c[i]);
		}
		return 0;
	}

}

