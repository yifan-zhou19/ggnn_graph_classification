package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int c;
	public static int i;
	public static int j;
	public static int k;
	public static int Main()
	{
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					i = (b > a) + (c == a);
					j = (a > b) + (a > c);
					k = (a > b) + (b > a);
	if (a > b && b > c && i < j && j < k)
	{
		System.out.print("CBA");
	}
	if (a > c && c > b && i < k && k < j)
	{
		System.out.print("BCA");
	}
	if (b > a && a > c && j < i && i < k)
	{
		System.out.print("CAB");
	}
	if (b > c && c > a && j > k && k > i)
	{
		System.out.print("ACB");
	}
	if (c > a && a > b && k > i && i > j)
	{
		System.out.print("BAC");
	}
	if (c > b && b > a && k > j && j > i)
	{
		System.out.print("ABC");
	}
				}
			}
		}
		return 0;
	}

}
