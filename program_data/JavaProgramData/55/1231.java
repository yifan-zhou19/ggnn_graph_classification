package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j = 0;
		int decimal;
		int number = 0;
	  String n = new String(new char[20]);
	  String m = new String(new char[20]);
	  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  n = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;n.charAt(i) != '\0';i++)
	  {
		  if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
		  {
			  n.charAt(i) -= 32;
		  }
	  }
	  for (i = 0;n.charAt(i) != '\0';i++)
	  {
		  if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
		  {
			  decimal = n.charAt(i) - '0';
		  }
	  else
	  {
		  decimal = n.charAt(i) - 'A' + 10;
	  }
	  number = a * number + decimal;
	  }
	  while (number >= b)
	  {
		  if ((number % b) >= 10)
		  {
		  m = tangible.StringFunctions.changeCharacter(m, j, number % b - 10 + 'A');
		  }
	  else
	  {
		  m = tangible.StringFunctions.changeCharacter(m, j, number % b + '0');
	  }
		 number = number / b;
		 j++;
	  }
	  if (number >= 10)
	  {
		  m = tangible.StringFunctions.changeCharacter(m, j, number - 10 + 'A');
	  }
	  else
	  {
		  m = tangible.StringFunctions.changeCharacter(m, j, number + '0');
	  }
	   for (i = j;i >= 0;i--)
	   {
		   System.out.print(m.charAt(i));
	   }



		return 0;
	}


}

