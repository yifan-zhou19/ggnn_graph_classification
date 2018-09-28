package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int i;
		for (i = 1;i <= a.length() - 1;i++)
		{
		System.out.printf("%c",a.charAt(i - 1) + a.charAt(i));
		}
		System.out.printf("%c",a.charAt(a.length() - 1) + a.charAt(0));
	}

}
