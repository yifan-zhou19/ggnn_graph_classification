package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int n;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i <= (n - 1);i++)
		{
			if (a.charAt(i) != 32)
			{
				System.out.printf("%c",a.charAt(i));
			}
			if (a.charAt(i) == 32 && a.charAt(i - 1) != 32)
			{
					System.out.printf("%c",a.charAt(i));
			}
		}
	}

}
