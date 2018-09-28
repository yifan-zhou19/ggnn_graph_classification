package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;i < a.length();i++)
		{
			 if (a.charAt(i) <= '9' && a.charAt(i) >= '0')
			 {
			 System.out.print(a.charAt(i));
			 }
			 else if (a.charAt(i - 1) <= '9' && a.charAt(i - 1) >= '0')
			 {
			 System.out.print("\n");
			 }
		}
	}
}
