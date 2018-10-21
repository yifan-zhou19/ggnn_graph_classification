package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int len;
		 int i;
		 String s = new String(new char[100]);
		 s = new Scanner(System.in).nextLine();
		 len = s.length();
		 if (s.charAt(0) != ' ')
		 {
			 System.out.printf("%c",s.charAt(0));
		 }
		 for (i = 1;i < len;i++)
		 {
			  if (s.charAt(i) != ' ')
			  {
				  System.out.printf("%c",s.charAt(i));
				  continue;
			  }
			  if (s.charAt(i - 1) != ' ' && s.charAt(i) == ' ')
			  {
				  System.out.printf("%c",s.charAt(i));
				  continue;
			  }
			  if (s.charAt(i - 1) == ' ' && s.charAt(i) == ' ')
			  {
				  continue;
			  }
		 }
		 return 0;
	}
}
