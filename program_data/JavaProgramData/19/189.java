package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int i;
		int k;
		int n = 0;
		int p;
		int j;
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		i = 0;
		while (a.charAt(i) != '\0')
		{
			n++;
			i++;
		}
		i = 0;
		while (s.charAt(i) != '\0')
		{
			p = 1;
			for (j = 0;j < n;j++)
			{
				if (a.charAt(j) != s.charAt(i + j))
				{
					p = 0;
				}
			}
			if (p != 0)
			{
				if (i > 1 && s.charAt(i - 1) != ' ')
				{
					p = 0;
				}
			}
			if (p != 0)
			{
				System.out.printf("%s",b);
				i = i + n - 1;
			}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
			i++;
		}
		return 0;
	}
}
