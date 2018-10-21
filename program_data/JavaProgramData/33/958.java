package <missing>;

public class GlobalMembers
{
	public static void f(String s, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			switch (s[i])
			{
			case 'A':
				System.out.print("T");
					 break;
			case 'T':
				System.out.print("A");
					 break;
			case 'G':
				System.out.print("C");
					 break;
			case 'C':
				System.out.print("G");
					 break;
			}
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		int t;
		int n;
		int i;
		String s = new String(new char[260]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			s = new Scanner(System.in).nextLine();
			n = s.length();
			f(s, n);
		}
	   return 0;
	}

}

