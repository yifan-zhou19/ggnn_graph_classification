package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int i;
		int n;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
						 if (!(s.charAt(i) == ' '))
						 {
									System.out.printf("%c",s.charAt(i));
						 }
						 else if (!(s.charAt(i + 1) == ' '))
						 {
							   System.out.print(" ");
						 }
		}
		return 0;
	}
}
