package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int num = 0;
		int j;
		int i;
		int a;
		int b;
		int x;
		String m = new String(new char[50]);
		String n = new String(new char[50]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		m = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		 for (i = 0;m.charAt(i) != '\0';i++)
		 {
			 if (m.charAt(i) >= 65 && m.charAt(i) <= 90)
			 {
				 m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i) + 32);
			 }
		 } //??????????

		for (i = 0;m.charAt(i) != '\0'; i++)
		{
			  if (m.charAt(i) >= 48 && m.charAt(i) <= 57)
			  {
				  x = m.charAt(i) - 48;
			  }
			else
			{
				x = m.charAt(i) - 97 + 10;
			}
			  num = num * a + x; //?a??????10????num???
		}

		 if (num == 0)
		 {
			 System.out.print(num);
			 System.out.print("\n");
		 }

		 for (i = 0;num != 0;i++) //??????b????n????
		 {
			  n = tangible.StringFunctions.changeCharacter(n, i, num % b);
			  if (n.charAt(i) >= 9)
			  {
				  n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 55);
			  }
			  else
			  {
				  n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 48);
			  }
			  num = num / b;
		 }


		for (j = i - 1;j >= 0;j--)
		{
			System.out.print(n.charAt(j));
		}

		System.out.print("\n");

		return 0;
	}


}

