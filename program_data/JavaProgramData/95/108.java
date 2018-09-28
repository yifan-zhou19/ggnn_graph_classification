package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		int i;
		int a;
		int b;
		int p = 0;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		a = s1.length();
		b = s2.length();
		for (i = 0;i < a;i++)
		{
			if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
			{
				s1.charAt(i) += 32;
			}
		}
		for (i = 0;i < b;i++)
		{
			if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z')
			{
				s2.charAt(i) += 32;
			}
		}
		for (i = 0;i < a && i < b;i++)
		{
			if (s1.charAt(i) == s2.charAt(i))
			{
				continue;
			}
			else if (s1.charAt(i) > s2.charAt(i))
			{
				System.out.print(">");
				p = 1;
				break;
			}
			else if (s1.charAt(i) < s2.charAt(i))
			{
				System.out.print("<");
				p = 1;
				break;
			}
		}
		if (p == 0)
		{
				System.out.print("=");
		}
	}




}
