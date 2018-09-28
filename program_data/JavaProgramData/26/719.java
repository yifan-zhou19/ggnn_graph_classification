package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{

			 System.out.printf("%c",s.charAt(i));
			 if (s.charAt(i) == ' ')
			 {

				 for (j = i + 1;s.charAt(j) == ' ';j++)
				 {
					 i = i + 1;
				 }

			 }



		}
		return 0;
	}

}
