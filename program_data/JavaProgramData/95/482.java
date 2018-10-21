package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int n;
		int f;
		int i;
		int j;
		int len1;
		int len2;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		f = 0;
		len1 = s1.length();
		len2 = s2.length();
		for (i = 0; i < len1; i++)
		{
			if ((s1.charAt(i) >= 'a') && (s1.charAt(i) <= 'z'))
			{
				s1.charAt(i) -= 32;
			}
			if ((s2.charAt(i) >= 'a') && (s2.charAt(i) <= 'z'))
			{
				s2.charAt(i) -= 32;
			}
			if (s1.charAt(i) < s2.charAt(i))
			{
				f = -1;
				break;
			}
			if (s1.charAt(i) > s2.charAt(i))
			{
				f = 1;
				break;
			}
		}
		if (f == 0)
		{
			System.out.print("=");
		}
		if (f == -1)
		{
			System.out.print("<");
		}
		if (f == 1)
		{
			System.out.print(">");
		}
		return 0;
	}

}
