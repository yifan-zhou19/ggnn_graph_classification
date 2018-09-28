package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",a.charAt(i) + a.charAt((i + 1) % n));
		}
	}
}
