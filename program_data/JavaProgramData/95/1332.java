package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int sign = 0;
		for (i = 0;i <= s1.length() && i <= s2.length();i++)
		{
			if (s1.charAt(i) - s2.charAt(i) == 32 || s2.charAt(i) - s1.charAt(i) == 32)
			{
			continue;
			}
			if (s1.charAt(i) >= 97)
			{
				s1.charAt(i) -= 32;
			}
			if (s2.charAt(i) >= 97)
			{
				s2.charAt(i) -= 32;
			}
			if ((int)(s1.charAt(i) - s2.charAt(i)) > 0)
			{
				sign = 1;
				break;
			}
			if ((int)(s1.charAt(i) - s2.charAt(i)) < 0)
			{
				sign = -1;
				break;
			}
		}
		if (sign == 0)
		{
			System.out.print("=");
		}
		if (sign == 1)
		{
			System.out.print(">");
		}
		if (sign == -1)
		{
			System.out.print("<");
		}
		return 0;
	}

}
