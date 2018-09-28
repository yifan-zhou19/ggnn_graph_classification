package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		String a = new String(new char[1000]);
		int n;
		int m = 0;
		int i;
		int j;

		p = a;

		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = n - 1;i >= 0;i--)
		{

			if (*(p.Substring(i)) != ' ')
			{
				m++;
			}
			if (*(p.Substring(i)) == ' ')
			{

				for (j = i + 1;j <= i + m;j++)
				{
					System.out.printf("%c",*(p.Substring(j)));
				}
				System.out.print(" ");
				m = 0;
			}

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
			if (*(p.Substring(i) + 1) == ' ')
			{
				break;
			}
		}
	}

}
