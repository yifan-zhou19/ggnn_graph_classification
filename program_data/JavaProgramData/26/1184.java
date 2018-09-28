package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		while (true)
		{
			 for (int i = 0;a.charAt(i) != '\0';i++)
			 {
				 if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
				 {
					 for (int j = i;a.charAt(j) != '\0';j++)
					 {
						 a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					 }
				 }
			 }
			 int z = 0;
			 for (int i = 0;a.charAt(i) != '\0';i++)
			 {
				 if (a.charAt(i) == ' ')
				 {
					 if (a.charAt(i + 1) == ' ')
					 {
						 z++;
					 }
				 }
			 }
			 if (z == 0)
			 {
				 break;
			 }
		}
		System.out.println(a);
		return 0;
		}

}

