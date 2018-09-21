package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String h = new String(new char[1000]);
	int a;
	int b = 0;
	int c = 1000;
	int i1;
	int i2;
	int j1;
	int j2;
	int i;
	int len;
	h = new Scanner(System.in).nextLine();
	len = h.length();
	int j = -1;
	for (i = 0;i < len + 1;i++)
	{
		if ((h.charAt(i) == ' ') || (h.charAt(i) == ',') || (h.charAt(i) == '\0'))
		{
				a = i - j - 1;
				if (a > 0)
				{
			if (a > b)
			{
				b = a;
				i1 = i;
				j1 = j;
			}
			if (a < c)
			{
				c = a;
				i2 = i;
				j2 = j;
			}
				}
			j = i;
		}
	}
		for (i = j1 + 1;i < i1;i++)
		{
			System.out.printf("%c",h.charAt(i));
		}
		System.out.print("\n");
		for (i = j2 + 1;i < i2;i++)
		{
			System.out.printf("%c",h.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}
