package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		int n1;
		int n2;
		int m = 0;
		int c = 0;
		String s1 = new String(new char[500]);
		String s2 = new String(new char[500]);
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		n1 = s1.length();
		n2 = s2.length();
		for (int i = 0;s1.charAt(i) != '\0';i++)
		{
			if ((s1.charAt(i) == 'A' || s1.charAt(i) == 'G' || s1.charAt(i) == 'C' || s1.charAt(i) == 'T') && (s2.charAt(i) == 'A' || s2.charAt(i) == 'G' || s2.charAt(i) == 'C' || s2.charAt(i) == 'T'))
			{
				if (s1.charAt(i) == s2.charAt(i))
				{
					m++;
				}
			}
			else
			{
				c = 1;
			}
		}
		if (c == 1 || n1 != n2)
		{
			System.out.print("error\n");
		}
		else
		{
			b = m * 1.0 / n1;
			if (a < b)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

