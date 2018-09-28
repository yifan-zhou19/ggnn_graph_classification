package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[110]);
	   String b = new String(new char[110]);
	   a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   int k = a.length();
	   if (k == 1)
	   {
		   System.out.print(0);
		   System.out.print("\n");
		   System.out.print(a);
		   System.out.print("\n");
	   }
	   else
	   {
		   for (int i = 0;i < k;i++)
		   {
		   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 48);
		   }
	   int sum = 0;
	   sum = 10 * a.charAt(0) + a.charAt(1);
	   b = tangible.StringFunctions.changeCharacter(b, 0, sum / 13 + 48);
	   sum = sum % 13;
	   a = tangible.StringFunctions.changeCharacter(a, 0, sum / 10);
	   a = tangible.StringFunctions.changeCharacter(a, 1, sum - 10 * a.charAt(0));
	   for (int i = 0;i < k - 2;i++)
	   {
	   sum = 100 * a.charAt(i) + 10 * a.charAt(i + 1) + a.charAt(i + 2);
	   b = tangible.StringFunctions.changeCharacter(b, i + 1, sum / 13 + 48);
	   sum = sum % 13;
	   a = tangible.StringFunctions.changeCharacter(a, i + 1, sum / 10);
	   a = tangible.StringFunctions.changeCharacter(a, i + 2, sum - 10 * a.charAt(i + 1));
	   }
	   if (b.charAt(0) == 48)
	   {
			  if (k == 2)
			  {
				  System.out.print('0');
			  }
			  else
			  {
				  for (int i = 1;i < k - 1;i++)
				  {
			   System.out.print(b.charAt(i));
				  }
			  }
	   }
	   else
	   {
			  for (int i = 0;i < k - 1;i++)
			  {
			   System.out.print(b.charAt(i));
			  }
	   }
	   System.out.print("\n");
	   System.out.print(a.charAt(k - 1) + 10 * a.charAt(k - 2));
	   System.out.print("\n");
	   }
	   return 0;
	}
}

