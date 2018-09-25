package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String p;
		int len;
		int i;
		int j;
		int st;
		p = a;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if ((*(p.Substring(i)) >= 48) && (*(p.Substring(i)) <= 57))
			{
				st = 1;
				System.out.printf("%c",*(p.Substring(i)));
			}
			else
			{
				if (st == 1)
				{
					System.out.print("\n");
					st = 0;
				}
				else
				{
					st = 0;
				}
			}
		}



		return 0;
	}
}
