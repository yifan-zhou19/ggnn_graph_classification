package <missing>;

public class GlobalMembers
{
	public static int ch(char a)
	{
		if (a >= '0' && a <= '9')
		{
			return 1;
		}
		return 0;
	}
	public static void Main()
	{
		String s = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		int j;
		int i;
		int k = 0;
		int m = 0;
		for (i = 0;i < s.length();i++)
		{
		 if (i > 0 && ch(s.charAt(i)) != 0 && ch(s.charAt(i - 1)) == 0)
		 {
			 k = i;
		 }
		 if (i > 0 && ch(s.charAt(i)) == 0 && ch(s.charAt(i - 1)) != 0)
		 {
				 m = 1;
				 for (j = k;j <= i - 1;j++)
				 {
					 System.out.printf("%c",s.charAt(j));
				 }
				 System.out.print("\n");
		 }
		 if (ch(s.charAt(i)) != 0 && i == s.length() - 1)
		 {
						  m = 1;
						  for (j = k;j <= i;j++)
						  {
							System.out.printf("%c",s.charAt(j));
						  }
						  System.out.print("\n");
		 }
		}
	}
}
