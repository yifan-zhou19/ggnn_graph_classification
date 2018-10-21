package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int flag = 1;
		int i;
		s = new Scanner(System.in).nextLine();
	   for (i = 0;i < s.length();i++)
	   {
	   if (s.charAt(i) == ' ')
	   {
		   flag = 0;
	   }
	   else
	   {
		   if (flag == 0)
		   {
			   System.out.print(" ");
		   }
			   System.out.printf("%c",s.charAt(i)),flag = 1;
	   }
	   }
		return 0;
	}

}
