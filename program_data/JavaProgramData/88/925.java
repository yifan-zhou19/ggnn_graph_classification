package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = " ";
		a = new Scanner(System.in).nextLine();
		int g = 1;
		String p = a;
		for (int i = 0;i < 30;i++)
		{
			if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
			{
				System.out.print((p.Substring(i)));
				g = 1;
			}
			if ((*(p.Substring(i)) < '0' || *(p.Substring(i))>'9') && g == 1)
			{
				System.out.print("\n");
				g = 0;
			}
		}
		return 0;
	}
}
