package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[33]);
		int i;
		int a;
		int b;
		int n;
		int x = 0;
		int y = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = s.length() - 1; i >= 0; i--)
		{
			if (s.charAt(i) >= 'a')
			{
			   x += (s.charAt(i) - 'a' + 10) * y;
			}
			else if (s.charAt(i) >= 'A')
			{
			   x += (s.charAt(i) - 'A' + 10) * y;
			}
			else
			{
			   x += (s.charAt(i) - '0') * y;
			}
			y *= a;
		}
		y = 1;
		while (x / y >= b)
		{
		   y *= b;
		}
		do
		{
			n = x / y;
			x = x % y;
			if (n >= 10)
			{
				System.out.printf("%c", 'A' + (n - 10));
			}
			else
			{
				System.out.printf("%d", n);
			}
			y = y / b;
		} while (y >= 1);
		return 0;
	}
}

