package <missing>;

public class GlobalMembers
{
	public static int cal(int m, int n)
	{
		int x;
	 if (n == 1 || m == 0)
	 {
			x = 1;
	 }
	 else if (m == 2 && n != 1)
	 {
		 x = 2;
	 }
	 else if (m == 1)
	 {
		 x = 1;
	 }
		else if (n > m)
		{
			x = cal(m, m);
		} //???????
		else
		{
			x = cal(m, n - 1) + cal(m - n, n);
		} //??????
		return x;
	}
	public static int Main(int argc)
	{
		int i;
		int t;
		int p;
		int q;
	   t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= t;i++)
	   {
		   p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.out.print(cal(p, q));
	   System.out.print("\n");
	   } //????

		return 0;

	}
}

