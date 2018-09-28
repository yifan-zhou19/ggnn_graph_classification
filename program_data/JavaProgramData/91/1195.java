package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int j;
		int k;
		int n;
		int l;
		int f;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i <= a.length() - 2;i++)
		{
									n = a.charAt(i) + a.charAt(i + 1);
									System.out.printf("%c", n);
		}
									n = a.charAt(a.length() - 1) + a.charAt(0);
		System.out.printf("%c", n);
		return 0;
	}

}
