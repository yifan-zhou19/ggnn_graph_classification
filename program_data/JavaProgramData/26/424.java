package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int l;
		int m;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		System.out.printf("%c",a.charAt(0));
		for (i = 1;i < l;i++)
		{
			 if (a.charAt(i) != ' ')
			 {
				 System.out.printf("%c",a.charAt(i));
			 }
			 else if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ')
			 {
				 System.out.printf("%c",a.charAt(i));
			 }
			 else if (a.charAt(i) == ' ' && a.charAt(i - 1) == ' ')
			 {
				 continue;
			 }
		}
		System.in.read();
	}
}
