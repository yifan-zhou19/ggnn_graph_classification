package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[6]);
		x = new Scanner(System.in).nextLine();
		int i;

		for (i = 5;i >= 0;i--)
		{
		if (x.charAt(i) == '0' || x.charAt(i) == '1' || x.charAt(i) == '2' || x.charAt(i) == '3' || x.charAt(i) == '4' || x.charAt(i) == '5' || x.charAt(i) == '6' || x.charAt(i) == '7' || x.charAt(i) == '8' || x.charAt(i) == '9')
		{
			break;
		}
		}

		for (int j = i;j >= 0;j--)
		{
		System.out.printf("%c",x.charAt(j));
		}

		return 0;
	}
}
