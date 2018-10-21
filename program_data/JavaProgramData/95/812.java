package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String ca = new String(new char[80]);
	  String cb = new String(new char[80]);
	  int i;
	  int na;
	  int nb;
	  int n;
	  int b = 0;
	  ca = new Scanner(System.in).nextLine();
	  cb = new Scanner(System.in).nextLine();
	  na = ca.length();
	  nb = cb.length();
	  n = (na > nb != 0?na:nb);
	  for (i = 0;i < n;i++)
	  {
		  if ((ca.charAt(i) >= 65) && (ca.charAt(i) <= 90))
		  {
			ca = tangible.StringFunctions.changeCharacter(ca, i, ca.charAt(i) + 32);
		  }
		  if ((cb.charAt(i) >= 65) && (cb.charAt(i) <= 90))
		  {
			cb = tangible.StringFunctions.changeCharacter(cb, i, cb.charAt(i) + 32);
		  }
	  }
	  if (strcmp(ca,cb) > 0)
	  {
		  System.out.print(">");
	  }
	  else if (strcmp(ca,cb) < 0)
	  {
		  System.out.print("<");
	  }
	  else
	  {
		  System.out.print("=");
	  }
	}
}

