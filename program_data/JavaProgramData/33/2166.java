package <missing>;

public class GlobalMembers
{
	public static void dna()

	{

		 int i;

		 String str = new String(new char[255]);

		 str = new Scanner(System.in).nextLine();

		 for (i = 0;i < str.length();i++)

		 {

		   if (str.charAt(i) == 'A')
		   {

			 str = tangible.StringFunctions.changeCharacter(str, i, 'T');
		   }

		   else if (str.charAt(i) == 'T')
		   {

			 str = tangible.StringFunctions.changeCharacter(str, i, 'A');
		   }

		   else if (str.charAt(i) == 'C')
		   {

			 str = tangible.StringFunctions.changeCharacter(str, i, 'G');
		   }

		   else if (str.charAt(i) == 'G')
		   {

			 str = tangible.StringFunctions.changeCharacter(str, i, 'C');
		   }

		 }

		 System.out.println(str);

	}




	public static int Main()

	{

		  int a;
		  int i;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }

		  System.in.read();

		  for (i = 0;i < a;i++)
		  {

			dna();
		  }

	}


}

