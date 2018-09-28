package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int kongge = 0;
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (int i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.printf("%c",a.charAt(i));
				kongge = 0;
			}
			else if (kongge == 0)
			{
				System.out.print(" ");
				kongge += 1;
			}
		}


		return 0;
	}


}
