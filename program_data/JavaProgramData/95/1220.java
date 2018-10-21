package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i = 0;
		  String s1 = new String(new char[100]);
		  String s2 = new String(new char[100]);

		  s1 = new Scanner(System.in).nextLine();
		  s2 = new Scanner(System.in).nextLine();

		  for (i = 0;s1.charAt(i) && s2.charAt(i);i++)
		  {
								   if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
								   {
									   s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 'a'+'A');
								   }
								   if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
								   {
									   s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - 'a'+'A');
								   }
								   if (s1.charAt(i) != s2.charAt(i))
								   {
													System.out.print((s1.charAt(i) > s2.charAt(i))?">":"<");
													break;
								   }

		  }
		  if (!s1.charAt(i) && !s2.charAt(i))
		  {
		  System.out.print("=");
		  }
	}
}

