package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[256]);
		  String b = new String(new char[256]);
		  String c = new String(new char[256]);
		  int i;
		  int j;
		  int n = 0;
		  int m;
		  a = new Scanner(System.in).nextLine();
		  b = new Scanner(System.in).nextLine();
		  c = new Scanner(System.in).nextLine();
		  m = b.length();
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
								 if (a.charAt(i) == b.charAt(0))
								 {
											   for (j = 1;j < m;j++)
											   {
																	   if (a.charAt(i + j) == b.charAt(j))
																	   {
																		  n++;
																	   }
											   }
								 }
								 if (n == m - 1)
								 {
												 for (j = 0;j < m;j++)
												 {
												 a = tangible.StringFunctions.changeCharacter(a, i + j, c.charAt(j));
												 }
												 break;
								 }
		  }
		  System.out.println(a);
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

