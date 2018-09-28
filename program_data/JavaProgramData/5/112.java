package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double std;
		double s;
		int i;
		int n1;
		int n2;
		int t = 0;
		String s1 = new String(new char[500]);
		String s2 = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			std = Double.parseDouble(tempVar);
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
		n1 = s1.length();
		n2 = s2.length();
		if (n1 != n2)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < n1;i++)
		{
			if (s1.charAt(i) != 'A' && s1.charAt(i) != 'T' && s1.charAt(i) != 'C' && s1.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
			if (s2.charAt(i) != 'A' && s2.charAt(i) != 'T' && s2.charAt(i) != 'C' && s2.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < n1;i++)
		{
			if (s1.charAt(i) == s2.charAt(i))
			{
				t++;
			}
		}
		s = (double)t / n1;
		if (s > std)
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

