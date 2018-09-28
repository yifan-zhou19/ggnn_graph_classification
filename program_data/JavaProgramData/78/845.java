package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int z; //????
	 int q;
	 int s;
	 int l;
	 int i;
	 int check;
	 String a = new String(new char[6]);
	 for (z = 1;z <= 5;z++) //????
	 {
		 for (q = 1;q <= 5;q++)
		 {
			 for (s = 1;s <= 5;s++)
			 {
			   for (l = 1;l <= 5;l++)
			   {
				   check = (z + q == s + l) + (z + l > s + q) + (z + s < q);
				   if (check == 3)
				   {
					   a = tangible.StringFunctions.changeCharacter(a, z, 'z');
					   a = tangible.StringFunctions.changeCharacter(a, q, 'q');
					   a = tangible.StringFunctions.changeCharacter(a, s, 's');
					   a = tangible.StringFunctions.changeCharacter(a, l, 'l'); //????
				   for (i = 5;i >= 1;i--)
				   {
					   if (i == z || i == q || i == s || i == l)
					   {
				   System.out.print(a.charAt(i));
				   System.out.print(" ");
				   System.out.print(i * 10);
				   System.out.print("\n");
					   }
				   }
				   }
			   }
			 }
		 }
	 }


		return 0;

	}

}

