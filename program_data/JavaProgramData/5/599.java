package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
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
		if (b.length() != c.length())
		{
			System.out.print("error\n");
			return 0;
		}
		int n = b.length();
		int i;
		for (i = 0;i < n;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				System.out.print("error\n");
				return 0;
			}
			if (c.charAt(i) != 'A' && c.charAt(i) != 'T' && c.charAt(i) != 'T' && c.charAt(i) != 'G' && c.charAt(i) != 'C')
			{
				System.out.print("error\n");
				return 0;
			}
		}
		int count = 0;
		for (i = 0;i < n;i++)
		{
			if (b.charAt(i) == c.charAt(i))
			{
				count += 1;
			}
		}
		double d;
		d = 1.0 * count / n;
		if (d > a)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;
	}



}

