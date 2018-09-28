package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int i;
		double e;
		String str = new String(new char[501]);
		String s = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s = tempVar3.charAt(0);
		}
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != 'A' && str.charAt(i) != 'T' && str.charAt(i) != 'G' && str.charAt(i) != 'C')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'G' && s.charAt(i) != 'C')
			{
				System.out.print("error");
				return 0;
			}
		}
		if (str.length() != s.length())
		{
			System.out.print("error");
		}
		else if (str.length() == s.length())
		{
			n = s.length();
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) == s.charAt(i))
				{
					k++;
				}
			}
			if ((1.0 * k / n) > e)
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

