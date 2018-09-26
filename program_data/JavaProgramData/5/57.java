package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a = 0;
		int b;
		double xg;
		String s1 = new String(new char[501]);
		String s2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			xg = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		if (s1.length() != s2.length())
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;s1.charAt(i) != '\0';i++)
		{
			if ((s1.charAt(i) == 'T' || s1.charAt(i) == 'A' || s1.charAt(i) == 'G' || s1.charAt(i) == 'C') && (s2.charAt(i) == 'T' || s2.charAt(i) == 'A' || s2.charAt(i) == 'G' || s2.charAt(i) == 'C'))
			{
				if (s1.charAt(i) == s2.charAt(i))
				{
				a++;
				}
			}
			else
			{
				System.out.print("error");
				return 0;
			}
		}
		b = s1.length();
		if (a * 1.0 / b > xg)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

