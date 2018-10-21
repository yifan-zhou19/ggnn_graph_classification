package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		for (i = 1;i < 4;i++)
		{
			for (j = 1;j < 4;j++)
			{
				for (k = 1;k < 4;k++)
				{
					a = i;
					b = j;
					c = k;
		if ((a < b && c == a) && (a> b || a > c) && !(c > b || b > a))
		{
			System.out.print("CBA");
			return 0;
		}

		if ((a < b && c == a) && !(a> b || a > c) && (c > b || b > a))
		{
			System.out.print("BCA");
			return 0;
		}
		if ((a < b || c == a) && !(a> b || a > c) && (c > b && b > a))
		{
			System.out.print("BAC");
			return 0;
		}
		if ((a < b || c == a) && (a> b && a > c) && !(c > b || b > a))
		{
			System.out.print("CAB");
			return 0;
		}
		if (!(a < b && c == a) && (a> b && a > c) && (c > b || b > a))
		{
			System.out.print("ACB");
			return 0;
		}
		if (!(a < b && c == a) && (a> b || a > c) && (c > b && b > a))
		{
			System.out.print("ABC");
			return 0;
		}
				}
			}
		}
		return 0;
	}
}
