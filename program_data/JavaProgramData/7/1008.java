package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[256]);
		  String b = new String(new char[256]);
		  String c = new String(new char[256]);
		  a = new Scanner(System.in).nextLine();
		  b = new Scanner(System.in).nextLine();
		  c = new Scanner(System.in).nextLine();
		  int n = 0;
		  int q = 0;
		  for (int i = 0;b.charAt(i) != '\0';i++)
		  {
				  n++;
		  }
		  for (int i = 0;a.charAt(i) != '\0';i++)
		  {
				  q++;
		  }
		  int i;
		  int j;
		  int k;
		  int p;
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
				  int m = 0;
				  for (j = 0;j < n;j++)
				  {
						  if (a.charAt(i + j) == b.charAt(j))
						  {
						  m++;
						  }
				  }
						  if (m == n)
						  {
						  break;
						  }
		  }
		  if (i == q)
		  {
		  for (p = 0;a.charAt(p) != '\0';p++)
		  {
		  System.out.printf("%c",a.charAt(p));
		  }
		  }
		  else
		  {
		  for (k = 0;c.charAt(k) != '\0';k++)
		  {
							a = tangible.StringFunctions.changeCharacter(a, k + i, c.charAt(k));
		  }
		  for (p = 0;a.charAt(p) != '\0';p++)
		  {
				  System.out.printf("%c",a.charAt(p));
		  }
		  }
				  System.in.read();
				  System.in.read();
				  System.in.read();
				  System.in.read();
				  System.in.read();
				  System.in.read();
				  System.in.read();
				  System.in.read();
				  System.in.read();
				  System.in.read();
				  System.in.read();
	}
}

