package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zm = new String(new char[101]);
		String zm2 = new String(new char[101]);
		char a;
		char b;
		char c;
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zm = tempVar2.charAt(0);
			}
			k = zm.length();
			if (k > 3)
			{
				a = zm.charAt(k - 3);
				b = zm.charAt(k - 2);
				c = zm.charAt(k - 1);
			if (b == 101 && c == 114)
			{
				zm2 = zm.substring(0, k - 2);
				zm2 = zm2.substring(0, k - 2);
			}
			if (b == 108 && c == 121)
			{
				zm2 = zm.substring(0, k - 2);
				zm2 = zm2.substring(0, k - 2);
			}
			if (a == 105 && b == 110 && c == 103)
			{
				zm2 = zm.substring(0, k - 3);
				zm2 = zm2.substring(0, k - 3);
			}
			}
			System.out.println(zm2);
		}
		return 0;
	}
}

