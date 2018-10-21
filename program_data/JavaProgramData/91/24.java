package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[102]);
	  int i;
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;;i++)
	  {
		  System.out.printf("%c",a.charAt(i) + a.charAt(i + 1));
		  if (a.charAt(i + 2) == '\0')
		  {
			 break;
		  }
	  }
	  System.out.printf("%c",a.charAt(i + 1) + a.charAt(0));
	  return 0;
	}
}
