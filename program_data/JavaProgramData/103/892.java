package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[1005]);
	 int l;
	 int i;
	 a = new Scanner(System.in).nextLine();
	 l = a.length();
	 int t = 1;
	 if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z')
	 {
		   a = tangible.StringFunctions.changeCharacter(a, 0, a.charAt(0) - 'a' + 'A');
	 }
	 char p = a.charAt(0);
	 for (i = 1;i <= l; i++)
	 {
		 if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		 {
		   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a' + 'A');
		 }
		if (a.charAt(i) != p)
		{
		  System.out.printf("(%c,%d)",p,t);
		  t = 1;
		  p = a.charAt(i);
		}
		else
		{
			t++;
		}
	 }

	 return 0;
	}

}

