package <missing>;

public class GlobalMembers
{
	public static void down(tangible.RefObject<String> a)
	{
	for (int i = 0;a.argValue.charAt(i) != 0;i++)
	{
		if (a.argValue.charAt(i) >= 'A' && a.argValue.charAt(i) <= 'Z')
		{
		   a.argValue.charAt(i) = a.argValue.charAt(i) - 'A'+'a';
		}
	}
	}

	public static int Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	down(tempRef_a);
	a = tempRef_a.argValue;
tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
	down(tempRef_b);
	b = tempRef_b.argValue;
	int x = strcmp(a,b);
	if (x > 0)
	{
		System.out.print('>');
	}
	else if (x < 0)
	{
		System.out.print('<');
	}
		 else
		 {
			 System.out.print('=');
		 }
	}

}

