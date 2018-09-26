package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i = 0;
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) && b.charAt(i);i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
		   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		 if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
		 {
			 b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
		 }
		 if (a.charAt(i) > b.charAt(i))
		 {
			 System.out.print(">");
		  break;
		 }
		 if (a.charAt(i) < b.charAt(i))
		 {
			 System.out.print("<");
		  break;
		 }
		}
		if (!a.charAt(i) && !b.charAt(i))
		{
		  System.out.print("=");
		}
	}

}

