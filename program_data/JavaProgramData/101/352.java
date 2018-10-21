package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int a0 = 0;
		int b0 = 0;
		int c0 = 0;
		if (b > a)
		{
			a0++;
		}
		if (c == a)
		{
			a0++;
		}
		if (a > b)
		{
			b0++;
		}
		if (a > c)
		{
			b0++;
		}
		if (c > b)
		{
			c0++;
		}
		if (b > a)
		{
			c0++;
		}
		if (a0 > b0 > c0 && a < b < c)
		{
			System.out.print("ABC");
		}
		if (a0 > c0 > b0 && a < c < b)
		{
			System.out.print("ACB");
		}
		if (b0 > a0 > c0 && b < a < c)
		{
			System.out.print("BAC");
		}
		if (b0 > c0 > a0 && b < c < a)
		{
			System.out.print("BCA");
		}
		if (c0 > b0 > a0 && c < b < a)
		{
			System.out.print("CBA");
		}
		if (c0 > a0 > b0 && c < a < b)
		{
			System.out.print("CAB");
		}
	}
}
