package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len;
		int i;
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len - 1;i++)
		{
		  System.out.printf("%c",(int)(s.charAt(i)) + (int)(s.charAt(i + 1)));
		}
		System.out.printf("%c\n",(int)(s.charAt(0)) + (int)(s.charAt(len - 1)));
	}
}
