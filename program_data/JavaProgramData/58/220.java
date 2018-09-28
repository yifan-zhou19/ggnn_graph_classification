package <missing>;

public class GlobalMembers
{
	public static int f(String c)
	{
		int z;
		int l = 0;
		int j;
		l = c.length();
		if (c[0].equals('_') || (c[0].compareTo(91) < 0 && c[0].compareTo(64) > 0) || (c[0].compareTo(123) < 0 && c[0].compareTo(96) > 0))
		{
				for (j = 0;j < l;j++)
				{
					if (c[j].equals('_') || (c[j].compareTo('z') <= 0 && c[j].compareTo('a') >= 0) || (c[j].compareTo('Z') <= 0 && c[j].compareTo('A') >= 0) || (c[j].compareTo('9') <= 0 && c[j].compareTo('0') >= 0))
					{
						z = 1;
					}
					else
					{
					return 0;
					break;
					}
				}
		}
		else
		{
		z = 0;

		}
		return (z);
	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		String c = new String(new char[90]);

		String s = new String(new char[10]);
	   s = new Scanner(System.in).nextLine();
	   n = Integer.parseInt(s);
		for (i = 0;i < n;i++)
		{
			c = new Scanner(System.in).nextLine();
			System.out.printf("%d\n",f(c));
		}

	}

}
