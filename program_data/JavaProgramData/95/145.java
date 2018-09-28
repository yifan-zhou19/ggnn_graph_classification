package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		int i;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0; i < 80; i++)
		{
			if (s1.charAt(i) == s2.charAt(i) || s1.charAt(i) == s2.charAt(i) + 32 || s1.charAt(i) == s2.charAt(i) - 32)
			{
				continue;
			}
			else if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90 && s2.charAt(i) >= 65 && s2.charAt(i) <= 90)
			{
				if (s1.charAt(i) < s2.charAt(i))
				{
					System.out.print("<\n");
					break;
				}
				else if (s1.charAt(i) > s2.charAt(i))
				{
					System.out.print(">\n");
					break;
				}
			}
			else if (s1.charAt(i) >= 97 && s1.charAt(i) <= 112 && s2.charAt(i) >= 97 && s2.charAt(i) <= 112)
			{
				if (s1.charAt(i) < s2.charAt(i))
				{
					System.out.print("<\n");
					break;
				}
				else if (s1.charAt(i) > s2.charAt(i))
				{
					System.out.print(">\n");
					break;
				}
			}
			else if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90 && s2.charAt(i) >= 97 && s2.charAt(i) <= 112)
			{
				if (s1.charAt(i) + 32 < s2.charAt(i))
				{
					System.out.print("<\n");
					break;
				}
				else if (s1.charAt(i) + 32 > s2.charAt(i))
				{
					System.out.print(">\n");
					break;
				}
			}
			else if (s1.charAt(i) >= 97 && s1.charAt(i) <= 112 && s2.charAt(i) >= 65 && s2.charAt(i) <= 90)
			{
				if (s1.charAt(i) - 32 < s2.charAt(i))
				{
					System.out.print("<\n");
					break;
				}
				else if (s1.charAt(i) - 32 > s2.charAt(i))
				{
					System.out.print(">\n");
					break;
				}
			}
		}
		if ((i = 80) != 0)
		{
			System.out.print("=\n");
		}
		return 0;
	}
}
