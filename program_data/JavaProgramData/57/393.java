package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		String a = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			m = a.length();
			if (a.charAt(m - 1) == 'r' || a.charAt(m - 1) == 'y')
			{
				a = a.substring(0, m - 2);
								System.out.println(a);
			}
			if (a.charAt(m - 1) == 'g')
			{
					   a = a.substring(0, m - 3);
					   System.out.println(a);
			}
		}
		return 0;
	}



}

