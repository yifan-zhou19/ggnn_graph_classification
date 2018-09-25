package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int l;
		String c = new String(new char[101]);
		c = new Scanner(System.in).nextLine();
		l = c.length();
		for (i = 0;i <= l - 1;i++)
		{
			System.out.printf("%c",c.charAt(i) + c.charAt((i + 1) % l));
		}
	}


}
