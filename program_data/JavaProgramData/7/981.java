package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x;
		int y;
		int z;
		String a = new String(new char[256]);
		String b = new String(new char[50]);
		String c = new String(new char[50]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		x = a.length();
		y = b.length();
		z = c.length();
		for (i = 0;i <= x - y;i++)
		{
			for (j = i;j < i + y;j++)
			{
			if (a.charAt(j) != b.charAt(j - i))
			{
			break;
			}
			}
			if (j == i + y)
			{
				for (j = 0;j < i;j++)
				{
				System.out.printf("%c",a.charAt(j));
				}
			for (j = 0;j < z;j++)
			{
				System.out.printf("%c",c.charAt(j));
			}
			for (j = i + y;j < x;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			break;
			}
		}
		if (i == x - y + 1)
		{
			  System.out.println(a);
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}
