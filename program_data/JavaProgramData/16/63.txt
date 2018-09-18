package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[6]);
	  a = new Scanner(System.in).nextLine();
	  int i;
	  int j;
	  j = a.length();
	  for (i = j - 1;i >= 0;i--)
	  {
	  System.out.printf("%c",a.charAt(i));
	  }
	  System.in.read();
	  System.in.read();
	}

}
