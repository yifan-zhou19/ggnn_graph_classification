package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[300]);

	public static int Main()
	{

		a = new Scanner(System.in).nextLine();
		int n = a.length();


		int p = 0;
		int q = 0;
		int m = 0;
		while (p < n && q < n)
		{
			while (a.charAt(p) == ' ')
			{
				p++;
			}

			q = p;

			while (a.charAt(q) != ' ' && a.charAt(q) != 0)
			{
				q++;
			}
			if (m == 0)
			{

				System.out.printf("%d",q - p);
			}
			else
			{
				System.out.printf(",%d",q - p);
			}
			p = q;
			m++;
		}



		return 0;

	}

}
