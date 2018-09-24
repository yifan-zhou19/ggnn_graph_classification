package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[3000]);
	  a = new Scanner(System.in).nextLine();
	  String b = new String(new char[3000]);
	  b = new Scanner(System.in).nextLine();
	  String c = new String(new char[3000]);
	  c = new Scanner(System.in).nextLine();
	  int i;
	  int j;
	  int k;
	  int s;
	  int l = 0;
	  int count = 0;
		for (k = 0;b.charAt(k) != '\0';k++)
		{
		 l = l + 1;
		}
	   for (i = 0;a.charAt(i) != '\0';i++)
	   {
		  if (a.charAt(i) == b.charAt(0))
		  {

			   for (j = i,s = 0;j < i + l,s < l;j++,s++)
			   {
				   if (a.charAt(j) == b.charAt(s))
				   {
					count++;
				   }


			   if (count == l)
			   {
					  for (j = i, s = 0;j <= i + l - 1 && s <= l - 1;j++, s++)
					  {
						   a = tangible.StringFunctions.changeCharacter(a, j, c.charAt(s));
					  }

			   }
			   }

		  }




	   }
		 for (i = 0;a.charAt(i) != '\0';i++)
		 {
		  System.out.printf("%c",a.charAt(i));
		 }


	 System.in.read();


	}

}

