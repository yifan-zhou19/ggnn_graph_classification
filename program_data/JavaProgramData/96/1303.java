package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[104]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = tempVar.charAt(0);
		}
		int len = m.length();
		String m2 = new String(new char[103]);
		int f = 0;
		int F = 0;
		if (len == 2)
		{
			if (m.charAt(0) - '0' == 1 && m.charAt(1) - '0' <= 2)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(10 + m.charAt(1) - '0');
				System.out.print("\n");
			}
		}
		if (len == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(m.charAt(0) - '0');
			System.out.print("\n");
			return 0;
		}
		for (int i = 0;i < len;i++)
		{
			int a;
			a = f * 10 + m.charAt(i) - '0';
			f = a % 13;
			if (a / 13 == 0 && F == 0)
			{
			}
			else if (i == len - 1)
			{
				F++;
				System.out.print(a / 13);
				System.out.print("\n");
				System.out.print(a % 13);
			}
			else
			{
				F++;
				System.out.print(a / 13);
			}

		}
		return 0;
	}
}

