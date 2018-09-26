package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[10000]);
		int i;
		int j;
		int w;
		int l;
		int n;
	c = new Scanner(System.in).nextLine();
	l = c.length();
	w = 0;
	for (i = 0;i < l;i++)
	{
		if (c.charAt(i) == ' ')
		{
			w = 0;
		}
	else if (w == 0)
	{
		w = 1;
		for (j = i, n = 0;c.charAt(j) != ' ' && c.charAt(j) != '\0';j++)
		{
			n = n + 1;
		}
		System.out.printf("%d",n);
		if (c.charAt(j) != '\0')
		{
			System.out.print(",");
		}
	}
	}
	}

}
