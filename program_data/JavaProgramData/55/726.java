package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f;
		int t;
		int[] n = new int[10000];
		int[] m = new int[10000];
		int l;
		int i;
		int s = 0;
		int k;
		int g;
		int h;
		String c = new String(new char[10000]);
		String d = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			f = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			t = Integer.parseInt(tempVar3);
		}
		l = c.length();
		for (i = l - 1;i >= 0;i--)
		{
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
				n[l - 1 - i] = c.charAt(i) - '0';
			}
			else
			{
				if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
				{
					n[l - 1 - i] = c.charAt(i) - 'a' + 10;
				}
				else
				{
					if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
					{
						n[l - 1 - i] = c.charAt(i) - 'A' + 10;
					}
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			g = 1;
			for (k = 0;k < i;k++)
			{
				g *= f;
			}
			s += n[i] * g;
		}
		if (s == 0)
		{
			h = 1;
		}
		else
		{
			h = 0;
		}
		for (k = 0;s != 0;k++)
		{
			m[k] = s % t;
			s = s / t;
		}
		for (i = k - 1;i >= 0;i--)
		{
			if (m[i] <= 9)
			{
				d = tangible.StringFunctions.changeCharacter(d, k - 1 - i, m[i] + '0');
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, k - 1 - i, m[i] - 10 + 'A');
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c",d.charAt(i));
		}
		if (h == 1)
		{
			System.out.print("0");
		}
		System.out.print("\n");
	}

}

