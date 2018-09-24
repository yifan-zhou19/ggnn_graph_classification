package <missing>;

public class GlobalMembers
{
	public static int xToTen(int x, String c)
	{
		int i;
		int lenth;
		int ten;
		int num;
		lenth = c.length();
		for (i = 0, ten = 0; i < lenth; i++)
		{
			if (c[i].compareTo('0') >= 0 && c[i].compareTo('9') <= 0)
			{
				num = c[i] - '0';
			}
			if (c[i].compareTo('A') >= 0 && c[i].compareTo('Z') <= 0)
			{
				num = c[i] - 'A' + 10;
			}
			if (c[i].compareTo('a') >= 0 && c[i].compareTo('z') <= 0)
			{
				num = c[i] - 'a' + 10;
			}
			ten = ten * x + num;
		}
		return (ten);
	}

	public static void tenToYout(int ten, int y)
	{
		int[] a = new int[100];
		int i;
		int lenth;
		for (lenth = 0; ten >= y; lenth++)
		{
			a[lenth] = ten % y;
			ten /= y;
		}
		a[lenth] = ten;
		for (i = lenth; i >= 0; i--)
		{
			if (a[i] < 10)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print((char)(a[i] - 10 + 'A'));
			}
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		String c = new String(new char[100]);
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		tenToYout(xToTen(x, c), y);
		return 0;
	}

}

