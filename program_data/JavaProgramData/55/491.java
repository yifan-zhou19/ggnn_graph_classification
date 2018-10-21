package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int flag;
		String n = new String(new char[100]);
		String m = new String(new char[100]);
		char c;
		int i;
		int s = 0;
		int k;
		int x;
		int y;
		int t;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 0;n.charAt(i) != '\0';i++)
		{
		}
		k = i - 1;
		for (i = 0;i <= k;i++)
		{
			c = n.charAt(i);
			if (c >= 'a' && c <= 'z')
			{
				x = c - 87;
			}
			if (c >= 'A' && c <= 'Z')
			{
				x = c - 55;
			}
			if (c >= '0' && c <= '9')
			{
				x = c - 48;
			}
			if (c == '0')
			{
				flag = 0;
			}
			s = s + x * (int)Math.pow(a,k - i);
		}
		t = s;
		for (i = 0;t > 0;i++)
		{
			u = t % b,t = (t - u) / b;
		}
		k = i - 1;
		for (i = 0;s > 0;i++)
		{
			y = s % b;
			if (y > 9)
			{
				c = y + 55;
			}
			else
			{
				c = y + 48;
			}
			m = tangible.StringFunctions.changeCharacter(m, k - i, c);
			s = (s - y) / b;
		}
		for (i = 0;i <= k;i++)
		{
			System.out.printf("%c",m.charAt(i));
		}
		if (flag == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
	}
}

