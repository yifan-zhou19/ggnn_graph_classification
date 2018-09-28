package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		String p1;
		String p2;
		p1 = a;
		p2 = b;
		int c;
		int d;
		for (i = 0;;i++)
		{
			if (*(p1.Substring(i) + 1) == '\0')
			{
					c = (p1.Substring(i));
					d = (p1);
					*(p2.Substring(i)) = c + d;
					break;
			}

			c = (p1.Substring(i));
			d = (p1.Substring(i) + 1);
			*(p2.Substring(i)) = c + d;
			System.out.printf("%c",*(p2.Substring(i)));
		}
		int l;
		System.out.printf("%c",c + d);
	}


}
