package <missing>;

public class GlobalMembers
{
	public static int h(String s)
	{
		int i;
		for (i = 0;i < s.length();i++)
		{
			if (!s[i].equals('A') && !s[i].equals('G') && !s[i].equals('T') && !s[i].equals('C'))
			{
				i = 1;
				break;
			}
		}
		if (i != 1)
		{
			i = 0;
		}
		return i;
	}
	public static int Main()
	{
		double c;
		double d;
		double e;
		int j;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("error");
		}
		else if (h(a) != 0 || h(b) != 0)
		{
			System.out.print("error");
		}
		else
		{
			e = 0;
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == b.charAt(j))
				{
					e++;
				}
			}
			d = e / a.length();
			if (d >= c)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}


}

