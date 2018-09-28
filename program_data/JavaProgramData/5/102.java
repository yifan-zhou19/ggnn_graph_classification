package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[505]);
		String s2 = new String(new char[505]);
		double n;
		double m = 0;
		double len1;
		double len2;
		double flag = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		len1 = s1.length();
		len2 = s2.length();
		for (i = 0;i < len1;i++)
		{
			if ((s1.charAt(i) == 'A') || (s1.charAt(i) == 'T') || (s1.charAt(i) == 'C') || (s1.charAt(i) == 'G'))
			{
				continue;
			}
			else
			{
				flag = 1;
				break;
			}
		}
		for (i = 0;i < len2;i++)
		{
			if ((s2.charAt(i) == 'A') || (s2.charAt(i) == 'T') || (s2.charAt(i) == 'C') || (s2.charAt(i) == 'G'))
			{
				continue;
			}
			else
			{
				flag = 1;
				break;
			}
		}

		if ((len1 != len2) || (flag == 1))
		{
			System.out.print("error");
		}
		else
		{
		for (i = 0;i <= len1;i++)
		{
			if (s1.charAt(i) == s2.charAt(i))
			{
				m++;
			}
		}
		m = m / len1;
		if (m > n)
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

