package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int j;
		int z;
		int len;
		int len1;
		int len2;
		String s = new String(new char[1000]);
		final String a = "";
		final String b = "";
		final String c = "";
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;s.charAt(i) != ' ';i++)
		{
		 a = tangible.StringFunctions.changeCharacter(a, i, s.charAt(i));
		}
		 z = 0;
		 for (j = i + 1;j < len;j++)
		 {
			 b = tangible.StringFunctions.changeCharacter(b, z, s.charAt(j));
			 z++;
		 }
		  len1 = a.length();
		  len2 = b.length();
		  x = 0;
		  for (i = 0;i < len2;i++)
		  {
			  if (b.charAt(i) == a.charAt(0))
			  {
				 for (j = i;j < i + len1;j++)
				 {
				   c = tangible.StringFunctions.changeCharacter(c, x, b.charAt(j));
				   x++;
				 }
			   if (strcmp(c,a) == 0)
			   {
				   break;
			   }
			   else
			   {
				   continue;
			   }
			  }
		  }
		  System.out.printf("%d",i);
	}
}

