package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String op = new String(new char[104]);
	   op = new Scanner(System.in).nextLine();
	  // printf("%s",op);
	  int len;

	  len = op.length();
	   String opp = new String(new char[103]);
	   int j = 0;
	   for (int i = 0;i <= len - 1;i++)
	   {
			   if (op.charAt(i) != 32 || (op.charAt(i) == 32 && op.charAt(i + 1) != 32))
			   {
				   opp = tangible.StringFunctions.changeCharacter(opp, j, op.charAt(i));
				   j++;
			   }
			   else
			   {
				   while (op.charAt(i) == 32)
				   {
					   i++;
				   }
			   i--;
			   i--;
			   }




	   }

	   opp = tangible.StringFunctions.changeCharacter(opp, j, '\0');
	   System.out.println(opp);
	   System.in.read();












	}



}

