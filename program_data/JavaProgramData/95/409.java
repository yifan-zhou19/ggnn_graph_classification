package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[80]);
	  String q = new String(new char[80]);
	  int i;
	  s = new Scanner(System.in).nextLine();
	  q = new Scanner(System.in).nextLine();
	 for (i = 0;i <= 80;i++)
	 {
		 if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
		 {
			 s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + 32);
		 }

		 else if (s.charAt(i) == 0)
		 {
			 break;
		 }
	 }
	  for (i = 0;i <= 80;i++)
	  {
		 if (q.charAt(i) >= 65 && q.charAt(i) <= 90)
		 {
			 q = tangible.StringFunctions.changeCharacter(q, i, q.charAt(i) + 32);
		 }

		 else if (q.charAt(i) == 0)
		 {
			 break;
		 }
	  }

	  for (i = 0;i <= 80;i++)
	  {

		   if (s.charAt(i) > q.charAt(i))
		   {
			  System.out.print(">");
		   break;

		   }
		  else if (s.charAt(i) < q.charAt(i))
		  {
			  System.out.print("<");
		  break;
		  }
		  else if (s.charAt(i) == q.charAt(i) && s.charAt(i) == 0)
		  {
			  System.out.print("=");
			  break;
		  }
	  }

	   return 0;


	}
}

