package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		String s1 = new String(new char[501]);
		String s2 = new String(new char[501]);
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
		int i;
		int len1;
		int len2;
		int sum = 0;
		double gl;
		len1 = s1.length();
		len2 = s2.length();
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				if ((s1.charAt(i) == 'A' || s1.charAt(i) == 'T' || s1.charAt(i) == 'C' || s1.charAt(i) == 'G') && (s2.charAt(i) == 'A' || s2.charAt(i) == 'T' || s2.charAt(i) == 'C' || s2.charAt(i) == 'G'))
				{
					if (s1.charAt(i) == s2.charAt(i))
					{
						sum += 1;
					}
				}
				else
				{
					System.out.print("error");
					return 0;
				}
			}
			gl = 1.0 * sum / len1;
			if (gl > n)
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

