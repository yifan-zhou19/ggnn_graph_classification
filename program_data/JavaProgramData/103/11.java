package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		a = new Scanner(System.in).nextLine();
		int t = 1;
		int l = a.length();
		for (int j = 1;j <= l;j++)
		{
		   if (a.charAt(j) != a.charAt(j - 1) && a.charAt(j) - a.charAt(j - 1) != 'A'-'a' && a.charAt(j) - a.charAt(j - 1) != 'a'-'A')
		   {
				 if (a.charAt(j - 1) >= 'a')
				 {
					  a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) + 'Z'-'z');
				 }
				 System.out.printf("(%c,%d)",a.charAt(j - 1),t);
				 t = 1;
		   }
		   else
		   {
		   t++;
		   }
		}
	}
}

