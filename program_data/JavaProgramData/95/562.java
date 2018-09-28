package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			  {
				  a.charAt(i) -= 32;
			  }
			  i++;
		}
		i = 0;
		while (a.charAt(i) != '\0')
		{
			  if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			  {
				  b.charAt(i) -= 32;
			  }
			  i++;
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
	}


}
