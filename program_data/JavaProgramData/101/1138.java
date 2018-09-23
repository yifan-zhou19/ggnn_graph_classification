package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int p = 0;
	int q = 0;
	int r = 0;
	for (p = 0;p <= 2;p = p + 1) //?p q r ????A B C????????0?1?2?
	{
	 for (q = 0;q <= 2;q = q + 1)
	 {
	for (r = 0;r <= 2;r = r + 1)
	{
	if (p != q && q != r && r != p)
	{
	if ((2 - p) == (p < q) + (r == p) && (2 - q) == (p> q) + (p > r) && (2 - r) == (r > q) + (q > p)) //2-p,2-q,2-r?????ABC???????
	{
	if (p > q && q > r)
	{
		System.out.print("C");
		System.out.print("B");
		System.out.print("A");
	}
		else if (p > r && r > q)
		{
		System.out.print("B");
		System.out.print("C");
		System.out.print("A");
		}
	else if (q > p && p > r)
	{
		System.out.print("C");
		System.out.print("A");
		System.out.print("B");
	}
	else if (q > r && r > p)
	{
		System.out.print("A");
		System.out.print("C");
		System.out.print("B");
	}
	else if (r > p && p > q)
	{
		System.out.print("B");
		System.out.print("A");
		System.out.print("C");
	}
	else if (r > q && q > p)
	{
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
	}
	} //??????????????????
	}
	}
	 }
	}
	return 0;
	}
}
