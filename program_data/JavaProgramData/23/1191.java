package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b;
		char c = 1;
		int i;
		int j;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		//printf("%d",n);
		String p = a.charAt(n - 1);
		String q = a.charAt(n - 1);
		//printf("%c""%c",*p,*q);

		for (i = 0;i <= n - 1,a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				c = c + 1;
			}
		}
		//printf("%d",c);
		if (c != 1)
		{
			for (;p >= a.charAt(0);p--)
			{
				if (p == ' ')
				{
					b = p;
					for (;p <= q;p++)
					{
					if (p != ' ')
					{
						System.out.printf("%c", p);
					}
					}
					System.out.print(" ");
					p = b - 1;
					q = b - 1;
				}
			}
			for (p = a.charAt(0); p != ' ';p++)
			{
				System.out.printf("%c", p);
			}
		}
		else
		{
			System.out.println(a);
		}
	}
}
