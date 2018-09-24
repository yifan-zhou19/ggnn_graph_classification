package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {'e', 'r'};
		char[] b = {'l', 'y'};
		char[] c = {'i', 'n', 'g'};
		String s = new String(new char[20]);
		int n;
		int m;
		int j;
		int co;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			co = s.length();
			if ((s.charAt(co - 2) == a[0] && s.charAt(co - 1) == a[1]) || (s.charAt(co - 2) == b[0] && s.charAt(co - 1) == b[1]))
			{
				for (j = 0;j < co - 2;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
			}
			if (s.charAt(co - 3) == c[0] && s.charAt(co - 2) == c[1] && s.charAt(co - 1) == c[2])
			{
				for (j = 0;j < co - 3;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

