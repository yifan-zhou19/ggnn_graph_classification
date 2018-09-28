package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[81]);
	String b = new String(new char[81]);
	int lena;
	int lenb;
	int i;
	int k = 0;
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	lena = a.length() - 1;
	lenb = b.length() - 1;
	for (i = 0;i < lena;i++)
	{
		if ((a.charAt(i) >= 65) && (a.charAt(i) <= 90))
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
		}
	}
	for (i = 0;i < lenb;i++)
	{
		if ((b.charAt(i) >= 65) && (b.charAt(i) <= 90))
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
		}
	}
	for (i = 0;i <= lena;i++)
	{
	k = k + 1;
	if (a.charAt(i) < b.charAt(i))
	{
		System.out.print("<");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto end_loop;
	}
	if (a.charAt(i) > b.charAt(i))
	{
		System.out.print(">");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto end_loop;
	}
	}
	if ((k = lena) != 0)
	{
		System.out.print("=");
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end_loop:
	return 0;
	}
}

