package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int n;
		int i;
		int temp;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n - 1;i++)
		{
			temp = a.charAt(i) + a.charAt(i + 1);
			System.out.printf("%c",temp);
		}
		temp = a.charAt(n - 1) + a.charAt(0);
		System.out.printf("%c",temp);
	}
}
