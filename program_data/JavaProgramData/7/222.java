package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String sub = new String(new char[256]);
		String re = new String(new char[256]);
		int i;
		int j;
		int k;
		s = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
		   for (j = i;j < sub.length() + i;j++)
		   {
				if (s.charAt(j) != sub.charAt(j - i))
				{
					break;
				}
				if (j == sub.length() + i - 1)
				{
					 for (k = j;k >= i;k--)
					 {
						s = tangible.StringFunctions.changeCharacter(s, k, re.charAt(k - i));
					 }
				}
		   }
		   if (j == sub.length() + i)
		   {
			   break;
		   }
		}
		System.out.printf("%s",s);
		return 0;
	}

}

