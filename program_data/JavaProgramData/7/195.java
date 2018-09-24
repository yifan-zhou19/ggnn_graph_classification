package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);
		int t;
		int i;
		int j;
		int k;
		s = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			t = 0;
			if (s.charAt(i) == sub.charAt(0))
			{
			   for (j = i,k = 0;sub.charAt(k) != '\0';j++,k++)
			   {
				   if (s.charAt(j) != sub.charAt(k))
				   {
					  t = 1;
					  break;
				   }
			   }
			   if (t == 0)
			   {
				 for (j = i;rep.charAt(j - i) != '\0';j++)
				 {
					 s = tangible.StringFunctions.changeCharacter(s, j, rep.charAt(j - i));
				 }
				 break;
			   }
			}
		}
		System.out.printf("%s",s);
	}


}

