package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String x = new String(new char[80]);
		String y = new String(new char[80]);
		int i;
		for (i = 0;i <= 79;i++)
		{
			x = x.substring(0, i);
			y = y.substring(0, i);
		}
		x = new Scanner(System.in).nextLine();
		y = new Scanner(System.in).nextLine();
		for (i = 0;i <= 79;i++)
		{
			if (x.charAt(i) > 64 && x.charAt(i) < 91)
			{
				x.charAt(i) += 32;
			}
		}
		for (i = 0;i <= 79;i++)
		{
			if (y.charAt(i) > 64 && y.charAt(i) < 91)
			{
				y.charAt(i) += 32;
			}
		}
		if (strcmp(x,y) > 0)
		{
			System.out.print(">\n");
		}
		else
		{
			if (strcmp(x,y) < 0)
			{
				System.out.print("<\n");
			}
			else
			{
				System.out.print("=\n");
			}
		}
	}
}
