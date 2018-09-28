package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[N]);
	   s = new Scanner(System.in).nextLine();
	   int i;

	   for (i = 0;s.charAt(i) != '\0';i++)
	   {

		   if (s.charAt(i) != ' ')
		   {
			   System.out.printf("%c",s.charAt(i));
		   }
		   if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
		   {
			   System.out.print(" ");
		   }

	   }

	return 0;
	}
}
