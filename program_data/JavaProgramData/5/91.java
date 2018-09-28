package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m;
		double n;
		int len1;
		int len2;
		int count = 0;
		int i;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
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
		if (len1 == len2)
		{
			for (i = 0;i < len1;i++)
			{
				if (s1.charAt(i) != 'A' && s1.charAt(i) != 'T' && s1.charAt(i) != 'C' && s1.charAt(i) != 'G' || s2.charAt(i) != 'A' && s2.charAt(i) != 'T' && s2.charAt(i) != 'C' && s2.charAt(i) != 'G')
				{
					count = len1 + 1;
					break;
				}
				if (s1.charAt(i) == s2.charAt(i))
				{
					count++;
				}
			}
			n = 1.0 * count / len1;
			if (count >= len1 + 1)
			{
				System.out.print("error\n");
			}
			if (n > m && n <= 1)
			{
				System.out.print("yes\n");
			}
			else if (n <= m)
			{
				System.out.print("no\n");
			}
		}
		else
		{
			System.out.print("error\n");
		}
		return 0;

	}

}

