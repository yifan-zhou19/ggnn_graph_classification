package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[1]);
	String p;
	int a;
	int i;
	s1 = new Scanner(System.in).nextLine();
	s2 = tangible.StringFunctions.changeCharacter(s2, 0, s1.charAt(0));
	a = s1.length();
	p = s1.charAt(0);
	for (i = 0;i < a - 1;i++)
	{
		*(p.Substring(i)) = s1.charAt(i) + s1.charAt(i + 1);
	}
	*(p.Substring(a) - 1) = s1.charAt(a - 1) + s2.charAt(0);
	for (i = 0;i < a;i++)
	{
	System.out.print(*(p.Substring(i)));
	}
	}

}

