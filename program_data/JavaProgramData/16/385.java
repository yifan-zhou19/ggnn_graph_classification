package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 String s = new String(new char[80]);
	 int i;
	 s = new Scanner(System.in).nextLine();
	 for (i = s.length() - 1; i >= 0; i--)
	 {
		 System.out.printf("%c",s.charAt(i));
	 }


	}

}
