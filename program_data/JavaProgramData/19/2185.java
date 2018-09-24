package <missing>;

public class GlobalMembers
{
	public static int check(tangible.RefObject<String> p, String a, int l)
	{
	   int i;
	   for (i = 0;i < l;i++)
	   {
			if (!a[i].equals(*(p.argValue.Substring(i))))
			{
			   return 0;
			}
	   }
	   return 1;
	}
	public static int Main()
	{
	   String s = new String(new char[200]);
	   String r = new String(new char[200]);
	   String a = new String(new char[101]);
	   String b = new String(new char[101]);
	   int i = 0;
	   int j;
	   int ls;
	   int la;
	   int lb;
	   int count = 0;
	   int p = 1;
	   s = new Scanner(System.in).nextLine();
	   a = new Scanner(System.in).nextLine();
	   b = new Scanner(System.in).nextLine();
		 ls = s.length();
		 la = a.length();
		 lb = b.length();
		 if (a.charAt(0) == s.charAt(0))
		 {
				  if (check(s.charAt(0), a, la) == 1 && s.charAt(i + la) == ' ')
				  {
					  for (j = 0;j < lb;j++)
					  {
						  r = tangible.StringFunctions.changeCharacter(r, count, b.charAt(j));
						  count++;
					  }
						p = i + la;

				  }
				  else
				  {
					  r = tangible.StringFunctions.changeCharacter(r, count, s.charAt(0));
					  count++;

				  }
		 }
			 else
			 {
				  r = tangible.StringFunctions.changeCharacter(r, count, s.charAt(0));
				  count++;
			 }
		 for (i = p;i < ls;i++)
		 {
			 if (a.charAt(0) == s.charAt(i))
			 {
				  if (check(s.charAt(i), a, la) == 1 && (s.charAt(i - 1) == ' ' && (s.charAt(i + la) == ' ' || s.charAt(i + la) == '\0')))
				  {
					  for (j = 0;j < lb;j++)
					  {
						  r = tangible.StringFunctions.changeCharacter(r, count, b.charAt(j));
						  count++;
					  }
						i = i + la - 1;
					   continue;
				  }
				  else
				  {
					  r = tangible.StringFunctions.changeCharacter(r, count, s.charAt(i));
					  count++;
					  continue;
				  }
			 }
			 else
			 {
				  r = tangible.StringFunctions.changeCharacter(r, count, s.charAt(i));
				  count++;
			 }
		 }
		r = tangible.StringFunctions.changeCharacter(r, count, '\0');
		System.out.printf("%s",r);

	}

}

