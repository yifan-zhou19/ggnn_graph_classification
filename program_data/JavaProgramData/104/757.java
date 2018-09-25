package <missing>;

public class GlobalMembers
{
	public static int s(int x, int y)
	{
	 if (x == y)
	 {
		 return x;
	 } //?????????????
	 else if (x > y)
	 {
		 return s(x / 2, y);
	 } //?????????????2????
	 else
	 {
		 return s(x, y / 2);
	 }
	}
	public static int Main(int argc)
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(s(x, y));
		return 0;

	}
}

