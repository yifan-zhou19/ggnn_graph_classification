package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
	char i;
	char j;
	char k;
	char l1;
	char l2;
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	l1 = a.length();
	l2 = b.length();
	if (l1 >= l2)
	{
		for (i = 0;i < l2;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
			if (b.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'a'+'A');
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				break;
			}
		}
		if (l1 == l2 && i == l2)
		{
			System.out.print("=");
		}
	}
	else
	{
	   for (i = 0;i < l1;i++)
	   {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
			if (b.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'a'+'A');
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				break;
			}
	   }
	}













	}

}

