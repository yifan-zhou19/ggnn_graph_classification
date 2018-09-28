package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[30]);
		  a = new Scanner(System.in).nextLine();
		  for (int i = 0;a.charAt(i) != '\0';i++)
		  {
				  if (a.charAt(i) <= '9' && a.charAt(i) >= '0' && a.charAt(i + 1) <= '9' && a.charAt(i + 1) >= '0')
				  {
					System.out.printf("%c",a.charAt(i));
				  }
				  else if (a.charAt(i) <= '9' && a.charAt(i) >= '0' && (a.charAt(i + 1) <= '9' && a.charAt(i + 1) >= '0') == 0)
				  {
					System.out.printf("%c\n",a.charAt(i));
				  }
		  }
	}

}
