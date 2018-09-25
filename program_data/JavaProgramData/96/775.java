package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String n = new String(new char[100]);
		  String m = new String(new char[100]);
		  n = new Scanner(System.in).nextLine();

		  int i;
		  int k;
		  int p;
		  int r;
		  k = n.length();
		  r = n.charAt(0) - '0';

		  for (i = 0;i < k - 1;i++)
		  {
			  p = (n.charAt(i + 1) - '0' + r * 10) / 13;
			  m = tangible.StringFunctions.changeCharacter(m, i, p);
			  r = (n.charAt(i + 1) - '0' + r * 10) % 13;
		  }

		  if (n.charAt(1) == '\0' || (n.charAt(2) == '\0' && n.charAt(0) <= '1' && n.charAt(1) < '3'))
		  {
		  System.out.print("0");
		  }

		  if ((int)m.charAt(0) == 0)
		  {
		  for (i = 1;i < k - 1;i++)
		  {
		  System.out.printf("%d",m.charAt(i));
		  }
		  }
		  else
		  {
		  for (i = 0;i < k - 1;i++)
		  {
		  System.out.printf("%d",m.charAt(i));
		  }
		  }

		  System.out.print("\n");
		  System.out.printf("%d",r);
	}


}

