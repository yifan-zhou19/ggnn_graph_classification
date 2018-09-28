package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double a;
		double len;
		double cd;
		double s = 0;
		double b = 0;
		double c;
		String s1 = new String(new char[501]);
		String s2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		len = s1.length();
		cd = s2.length();
		if (len != cd)
		{
			System.out.print("error");
		}
		if (len == cd)
		{
			for (i = 0;i < len;i++)
			{
				if ((s1.charAt(i) == 'A' || s1.charAt(i) == 'T' || s1.charAt(i) == 'C' || s1.charAt(i) == 'G') && (s2.charAt(i) == 'A' || s2.charAt(i) == 'T' || s2.charAt(i) == 'C' || s2.charAt(i) == 'G'))
				{
					b++;
					if (s1.charAt(i) == s2.charAt(i))
					{
						s++;
					}
				}
			}
			if (b == len)
			{
				c = s / len;
				if (c > a)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
			if (b != len)
			{
				System.out.print("error");
			}
		}
		return 0;
	}




}

