package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		char a;
		s = new Scanner(System.in).nextLine();
		int n;
		int i;
		int j;
		n = s.length();
		for (i = 0;i < (n - 1);i++)
		{
			j = s.charAt(i) + s.charAt(i + 1);
			a = j;
			System.out.printf("%c",a);
		}
		j = s.charAt(n - 1) + s.charAt(0);
		a = j;
		System.out.printf("%c",a);


		return 0;
	}
}
