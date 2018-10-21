package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int l;
		int k;
		String s = new String(new char[300]);
		char a;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		k = 0;
		for (a = 'A';a <= 'Z';a++)
		{
			t = 0;
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) == a)
				{
					t = t + 1;
					k = 1;
				}
			}
			if (t != 0)
			{
				System.out.printf("%c=%d\n",a,t);
			}
		}
		for (a = 'a';a <= 'z';a++)
		{
			t = 0;
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) == a)
				{
					t = t + 1;
					k = 1;
				}
			}
			if (t != 0)
			{
				System.out.printf("%c=%d\n",a,t);
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}
