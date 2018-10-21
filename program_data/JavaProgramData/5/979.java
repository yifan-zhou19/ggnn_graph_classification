package <missing>;

public class GlobalMembers
{
	public static int f(char x)
	{
		if (x == 'A' || x == 'T' || x == 'G' || x == 'C')
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static void Main(String[] args)
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int x = 0;
		int i;
		int y = 1;
		float p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Float.parseFloat(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 1;i <= a.length();i++)
		{
		if (f(a.charAt(i - 1)) != 0)
		{
			y = 0;
		}
		}
		for (i = 1;i <= b.length();i++)
		{
		if (f(b.charAt(i - 1)) != 0)
		{
			y = 0;
		}
		}
		if (a.length() != b.length())
		{
			y = 0;
		}
		if (y == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 1;i <= a.length();i++)
			{
			if (a.charAt(i - 1) == b.charAt(i - 1))
			{
				x++;
			}
			}
			if (x > p * a.length())
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
	}

}

