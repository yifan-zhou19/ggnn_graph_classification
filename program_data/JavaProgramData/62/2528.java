package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[100]);
	   a = new Scanner(System.in).nextLine();
	   for (int i = 0;a.charAt(i) != '\0';i++)
	   {
			   System.out.printf("%c",a.charAt(i));
			   if (a.charAt(i) == ' ')
			   {
				   for (int j = i + 1;a.charAt(j) == ' ';j++)
				   {
						i++;
				   }
			   }
	   }
		return 0;
	}



}
