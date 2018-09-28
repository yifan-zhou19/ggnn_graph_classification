package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int shu = 0;
		int j;
		int i;
		int a;
		int b;
		int mm;
		String m = new String(new char[100]);
		String n = new String(new char[100]);
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
		 }

		for (i = 0;m.charAt(i) != '\0'; i++)
		{
			  if (m.charAt(i) >= 48 && m.charAt(i) <= 57)
			  {
				  mm = m.charAt(i) - 48;
			  }
			else
			{
				mm = m.charAt(i) - 97 + 10;
			}
			  shu = shu * a + mm;
		}

		 if (shu == 0)
		 {
			 System.out.print(shu);
			 System.out.print("\n");
		 }

		 for (i = 0;shu != 0;i++)
		 {
			  n = tangible.StringFunctions.changeCharacter(n, i, shu % b);
			  if (n.charAt(i) >= 9)
			  {
				  n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 55);
			  }
			  else
			  {
				  n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 48);
			  }
			  shu = shu / b;
		 }

		for (j = i - 1;j >= 0;j--)
		{
			System.out.print(n.charAt(j));
		}

		return 0;
	}
}

