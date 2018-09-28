package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[105]);
	   int i;
	   a = new Scanner(System.in).nextLine();
	   for (i = 0;a.charAt(i) != '\0';i++)
	   {
		   if (a.charAt(i) != ' ')
		   {
			  System.out.printf("%c",a.charAt(i));
		   }
		   else if ((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' '))
		   {
			  System.out.print(" ");
		   }
	   }
		return 0;
	}
}
