package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[300]);
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		s2 = s1;
		int l;
		int l1;
		int l2;
		l1 = l2 = s1.length();
		n = n - 1;
		while (n != 0)
		{
			n = n - 1;
			scanf("\n");
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s = tempVar3.charAt(0);
			}
			l = s.length();
			if (l < l1)
			{
				s1 = s;
				l1 = l;
			}
			if (l > l2)
			{
				s2 = s;
				l2 = l;
			}
		}
	System.out.println(s2);
	System.out.printf("%s",s1);
	return 0;
	}

}

