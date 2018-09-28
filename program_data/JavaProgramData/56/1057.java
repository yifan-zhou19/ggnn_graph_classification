package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[5]);
		String p;
		int l;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		p = n;
		l = n.length();
		if (l == 1)
		{
			System.out.printf("%s",n);
		}
		else if (l == 2)
		{
			a = p;
			p = *(p.Substring(1));
			*(p.Substring(1)) = a;
			System.out.printf("%s",n);
		}
		else if (l == 3)
		{
			a = p;
			p = *(p.Substring(2));
			*(p.Substring(2)) = a;
			System.out.printf("%s",n);
		}
		else if (l == 4)
		{
			a = p;
			b = (p.Substring(1));
			p = *(p.Substring(3));
			*(p.Substring(1)) = *(p.Substring(2));
			*(p.Substring(3)) = a;
			*(p.Substring(2)) = b;
			System.out.printf("%s",n);
		}
		else if (l == 5)
		{
			a = p;
			b = (p.Substring(1));
			p = *(p.Substring(4));
			*(p.Substring(1)) = *(p.Substring(3));
			*(p.Substring(4)) = a;
			*(p.Substring(3)) = b;
			System.out.printf("%s",n);
		}
		return 0;
	}
}

