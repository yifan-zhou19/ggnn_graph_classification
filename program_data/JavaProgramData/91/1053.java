package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[100]);
	 char a;
		s = new Scanner(System.in).nextLine();
		int l = s.length();
		int i;
	 for (i = 0;i < l;i++)
	 {
		 if (i != l - 1)
		 {
			 a = s.charAt(i) + s.charAt(i + 1);
		 }
		 if (i == l - 1)
		 {
			 a = s.charAt(0) + s.charAt(l - 1);
		 }
		 System.out.printf("%c",a);
	 }
	return 0;
	}

}
