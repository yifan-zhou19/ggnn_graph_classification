package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		n = b.length();
		int i = 0;
		while (a.charAt(i) != '\0')
		{
			int m = 0;
			while (m < n)
			{
				if (a.charAt(i + m) == b.charAt(m))
				{
					m++;
				}
				else
				{
					break;
				}
			}
			if (m == n)
			{
				int p = 0;
				while (p < i)
				{
					System.out.printf("%c",a.charAt(p));
					p++;
				}
				System.out.printf("%s",c);
				p = p + n;
				while (a.charAt(p) != '\0')
				{
					System.out.printf("%c",a.charAt(p));
					p++;
				}
				break;
			}
		i++;
		}
		if (a.charAt(i) == '\0')
		{
			System.out.printf("%s",a);
		}
		return 0;
	}
}

