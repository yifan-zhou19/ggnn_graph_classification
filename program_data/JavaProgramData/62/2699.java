package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	 String a = new String(new char[10000]);
	 a = new Scanner(System.in).nextLine();
	 for (int i = 0;i < a.length();i++)
	 {
		   if (a.charAt(i) != ' ')
		   {
					   System.out.printf("%c",a.charAt(i));
		   }
		   else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
		   {
				System.out.printf("%c",a.charAt(i));
		   }
	 }


		return 0;
	}

}
