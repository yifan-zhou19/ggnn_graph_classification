package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int n;
		  int l;
		  String a = new String(new char[100]);
		  String b = new String(new char[100]);
		  a = new Scanner(System.in).nextLine();
		  l = a.length();
		  for (i = 0;i < l;i++)
		  {
						 if (a.charAt(i) != ' ')
						 {
						   System.out.printf("%c",a.charAt(i));
						 }
						  if (a.charAt(i) == ' ')
						  {
									 if (a.charAt(i - 1) == ' ')
									 {
									 continue;
									 }
									 else
									 {
									System.out.print(" ");
									 }
						  }
		  }
		  System.in.read();
	}

}
