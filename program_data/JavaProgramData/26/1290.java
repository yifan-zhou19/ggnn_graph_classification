package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[100]);
		int i;
		int n;
		int x;
	   sz = new Scanner(System.in).nextLine();
	n = sz.length();
	for (i = 0;i < n - 1;i++)
	{
		if (sz.charAt(i) == ' ')
		{
			if (sz.charAt(i + 1) == ' ')
			{
				continue;
			}
			else
			{
				System.out.print(" ");
			}
		}
		else
		{
			System.out.printf("%c",sz.charAt(i));
		}
	}
	System.out.printf("%c",sz.charAt(n - 1));
	return 0;
	}


}
