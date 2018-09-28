package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[31]);
	 int i;
	 int j;
	 int k;
	 int l;
	 s = new Scanner(System.in).nextLine();
	 for (i = 0;i < 31;i++)
	 {
		  if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
		  {
			  System.out.printf("%c",s.charAt(i));
		  }
	  if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && !(s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9'))
	  {
		  System.out.print("\n");
	  }
	 }
	}
}
