package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[40]);
	   s = new Scanner(System.in).nextLine();
	   int i;
	   for (i = 0;i < s.length();i++)
	   {
		   if (Character.isDigit(*(s.Substring(i))) != 0)
		   {
			   System.out.print((s.Substring(i)));
		   }
		   else
		   {
			   if (Character.isDigit(*(s.Substring(i) - 1)) != 0)
			   {
			   System.out.print("\n");
			   }
		   }

	   }

	   return 0;
	}
}
