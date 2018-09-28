package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n = 0;
		String t = new String(new char[260]);
		String s = new String(new char[260]);
		String w = new String(new char[260]);
		w = new Scanner(System.in).nextLine();
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		for (i = 0;i < w.length();i++)
		{
			k = 1;
			for (j = 0;j < s.length();j++)
			{
				if (s.charAt(j) != w.charAt(i + j))
				{
					k = 0;
				}
			}
				if (k != 0)
				{
					n = i;
					break;
				}
		}
		if (n != 0)
		{
			for (i = 0;i < n;i++)
			{
				System.out.printf("%c",w.charAt(i));
			}
			System.out.printf("%s",t);
			for (i = n + s.length();i < w.length();i++)
			{
				System.out.printf("%c",w.charAt(i));
			}
		}
		else
		{
			System.out.printf("%s",w);
		}
		return 0;
	}

}
