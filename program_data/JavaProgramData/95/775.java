package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int f = char x;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0' && b.charAt(i) != '\0';i++)
		{
		  if (f(a.charAt(i)) == 1)
		  {
			  a.charAt(i) -= 32;
		  }
		  if (f(b.charAt(i)) == 1)
		  {
			  b.charAt(i) -= 32;
		  }
		  if (a.charAt(i) < b.charAt(i))
		  {
			  System.out.print("<");
			  break;
		  }
		  if (a.charAt(i) > b.charAt(i))
		  {
			  System.out.print(">");
			  break;
		  }
		}
		if (a.charAt(i) == b.charAt(i) && a.charAt(i) == '\0')
		{
			System.out.print("=");
		}


	}

	public static int f(char x)
	{
		return (x >= 97) && (x <= 122);
	}
}
