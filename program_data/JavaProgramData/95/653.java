package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  int i;
	  int len;
	  a = new Scanner(System.in).nextLine();
	  b = new Scanner(System.in).nextLine();
	  len = a.length();
	  for (i = 0;i < len;i++)
	  {
		if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		{
		  a.charAt(i) -= 32;
		}
		if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
		{
		  b.charAt(i) -= 32;
		}

		if (a.charAt(i) > b.charAt(i))
		{
			 System.out.print(">");
			 break;
		}

		else
		{
		if (a.charAt(i) < b.charAt(i))
		{
			System.out.print("<");
		   break;
		}
		}
	  }
	  if (i >= len)
	  {
		System.out.print("=");
	  }
	}
}
