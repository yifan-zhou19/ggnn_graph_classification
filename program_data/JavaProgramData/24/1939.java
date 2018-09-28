package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[3000]);
		int i = 0;
		int j = 0;
		int c = 0;
		int d = 10;
		int m;
		int n;
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			while (a.charAt(i) != ' ' && a.charAt(i) != '\0')
			{
			  j++;
			  i++;
			}
			if (j > c)
			{
				m = i - j;
				c = j;
			}
			if (j < d)
			{
				n = i - j;
				d = j;
			}
			while (a.charAt(i) == ' ')
			{
				i++;
				j = 0;
			}
		}
		while (a.charAt(m) != ' ' && a.charAt(m) != '\0')
		{
			System.out.printf("%c",a.charAt(m));
			m++;
		}
		System.out.print("\n");
		while (a.charAt(n) != ' ' && a.charAt(n) != '\0')
		{
			System.out.printf("%c",a.charAt(n));
			n++;
		}
		System.out.print("\n");
		return 0;
	}


}
