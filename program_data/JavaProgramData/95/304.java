package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i;
		int l;
		int c;
		int d;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = a.length();
		d = b.length();
		if (c >= d)
		{
			l = c;
		}
		else
		{
			l = d;
		}

		for (i = 0;i <= l;i++)
		{

		  if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
		  {
			  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
		  }
		  if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
		  {
			  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
		  }
		  if (a.charAt(i) > b.charAt(i))
		  {
			  System.out.print(">\n");
			  break;
		  }
		  if (a.charAt(i) < b.charAt(i))
		  {
			  System.out.print("<\n");
			  break;
		  }

		}
		  if (i == l + 1)
		  {
			  System.out.print("=\n");
		  }

		return 0;
	}


}

