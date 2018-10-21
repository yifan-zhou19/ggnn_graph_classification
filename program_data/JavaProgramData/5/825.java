package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int b;
		int c;
		int i;
		double a;
		double j = 0;
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
		b = s1.length();
		c = s2.length();
		if (b != c)
		{
			System.out.print("error");
		}
		if (b == c)
		{
			for (i = 0;i < b;i++)
			{
				if (s1.charAt(i) != 'A' && s1.charAt(i) != 'T' && s1.charAt(i) != 'C' && s1.charAt(i) != 'G' && s2.charAt(i) != 'A' && s2.charAt(i) != 'T' && s2.charAt(i) != 'C' && s2.charAt(i) != 'G')
				{
					System.out.print("error");
					j = -1;
					break;
				}
				else
				{
					if (s1.charAt(i) == s2.charAt(i))
					{
						j++;
					}
				}
			}
			if (j != -1)
			{
				j = j / b;
				if (j > a)
				{
					System.out.print("yes");
				}
				if (j <= a)
				{
					System.out.print("no");
				}
			}
		}

	}
}

